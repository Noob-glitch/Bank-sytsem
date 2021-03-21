package Auth;

import Auth.Validate;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.Calendar;


public class Transfer extends HttpServlet {
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String name = request.getParameter("recievername");
        
        
        if(Validate.checkUser(name))
        {
            String Name=request.getParameter("name");
		String Email=request.getParameter("email");
		String Reciever_name=request.getParameter("recievername");
		String Amount=request.getParameter("amount");
                int recCur = 0;
                String RecCur="";
                int credit=Integer.parseInt(Amount);
                String currentBal=request.getParameter("CurrentBal");
                int CurrentBalance=Integer.parseInt(currentBal);
                int ActualBal=CurrentBalance-credit;
                String actualbal=Integer.toString(ActualBal);
                Calendar calendar = Calendar.getInstance();
                 java.sql.Date ourJavaDateObject = new java.sql.Date(calendar.getTime().getTime());
                 
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","123");
			String sql="insert into transfer values(?,?,?,?,?)";
                        String sql2="UPDATE customer set Amount=? where Name=?";
                        String sql3=("select Amount from customer where Name='"+Reciever_name+"' ");
                        String sql4="UPDATE customer SET Amount=? where Name=?";
                        
			PreparedStatement ps=conn.prepareStatement(sql);
			{
				ps.setString(1, Name);
				ps.setString(2, Email);
				ps.setString(3, Amount);
				ps.setString(4, Reciever_name);
                                ps.setDate(5, ourJavaDateObject);
				ps.execute();
				ps.close();
				System.out.println("Saves!!!");
			}
			PreparedStatement ps1=conn.prepareStatement(sql2);
                        {
                            ps1.setString(1, actualbal);
                            ps1.setString(2, Name);
                            ps1.execute();
                        }
                        Statement stmt=conn.createStatement();
                        ResultSet rs=stmt.executeQuery(sql3);
                        while(rs.next())
                        {
                            int recamount=rs.getInt("Amount");
                            recCur=recamount+credit;
                            RecCur=Integer.toString(recCur);
                            
                            
                        }
                        PreparedStatement ps2=conn.prepareStatement(sql4);
                        {
                            ps2.setString(1,RecCur);
                            ps2.setString(2, Reciever_name);
                            ps2.execute();
                          
                        }
                             HttpSession session=request.getSession();
			   
			   session.setAttribute("RecCur",RecCur);
			response.sendRedirect("TransferHistory.jsp");
                        
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
           // RequestDispatcher rs = request.getRequestDispatcher("TransferHistory.jsp");
           // rs.forward(request, response);
        }
        else
        {
            String error="Incorrect Reciever Bsdk";
           HttpSession session=request.getSession();
			   
			   session.setAttribute("error",error);
			response.sendRedirect("Transfer.jsp");
        }
    }  
}