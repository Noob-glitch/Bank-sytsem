<%-- 
    Document   : TransferHistory
    Created on : 19 Feb, 2021, 9:46:24 AM
    Author     : Pankaj singh
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<html>
    <head>
        <title>Banking System</title>
    </head>
    <style type="text/css">
    body{
     margin: 0;
     padding: 0;
     background-image: url("image/bank.jpg");
     background-position: center;
     background-repeat: no-repeat;
    }
    #title{
    
        display: flex;
        flex-wrap: wrap;
        background-color:#0099cc;
    }
    h1{
        margin-left: 10px;
        margin-top: 40px;
        margin-bottom: 20px;
        font-family:apple-system, BlinkMacSystemFont, "Segoe UI", Helvetica, Arial, sans-serif;
        color: #ffffff;
        Font-size: 30px;

Font-weight: 400;

Line-height: 0px;

color: #ffffff;
    }
    a{
        text-decoration: none;
        margin: 10px;
        margin-top: 30px;
        margin-bottom: 20px;
        font-family:apple-system, BlinkMacSystemFont, "Segoe UI", Helvetica, Arial, sans-serif;
        Font-size: 16px;

Font-weight: 700;

Line-height: 32px;
        color: #ffffff;

    }
    a:hover{
        color:#1d7eac;


    }
    #nav-bar{
        margin-left: 40px;
        width: 50%;
        display: flex;
        flex-wrap: wrap;
        height: inherit;

    }
  
    table{

        padding: 10px;
        width:100%;
    }
    table thead th{
        background-color: #383e56;
       padding: 5px;
       border: 1px solid #ffffff; 
       border-radius: 5px;       
    }
    table tbody th{
        background-color: #11698e;
        padding: 5px;
        border: 1px solid #ffffff;
        border-radius: 5px; 
    }
    
    #TransferHistory{
        margin: 0 auto;
        width:45%;
        
        border-radius: 10px;
        margin-top: 20px;
        color:#ffffff;
    }
   @media screen and (max-width:692px){
       #title{
           height: 100px;
       }
       h1{
           font-size: 18px;
       }
       
    a{
        font-size: 10px;
    }   
    
        table{
         width: 30%;    
         font-size: 8px;

        }
        table button{
            font-size: 8px;
        }
    }
   
    </style>
    <body>
          <sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver"
                           url="jdbc:mysql://localhost/bank"
                           user="root" password="123"/>
        <div id="title">
            <h1>Basic Banking System</h1>

        
        <div id="nav-bar">
            <a href="index.jsp">Home</a>
 
    

        </div></div>
       
        <div id="TransferHistory">
            <table>
                <thead>
                    <tr>
                        <th>
                            Sender's Name
                        </th>
                        <th> Email

                        </th>
                        <th>Amount</th>
                        <th>
                            Reciever's Name 
                        </th>
                        <th>Date</th>
                       </tr>
                </thead>
                <tbody>
                     <sql:query dataSource="${snapshot}" var="result">
                            SELECT * from transfer

                        </sql:query>
                         <c:forEach var="row" items="${result.rows}">
                    <tr>
                       
               
                        <th><c:out value="${row.Name}"/></th>
                        <th><c:out value="${row.Email}"/></th>
                        <th><c:out value="${row.Amount}"/></th>
                        <th><c:out value="${row.Reciever_name}"/></th>
                        <th><c:out value="${row.Date}"/></th>
                    </tr>
                         </c:forEach>
                        
                </tbody>
            </table>
       
        </div>
        </div>
        <div>
            <%String str=session.getAttribute("RecCur").toString();
            out.println(str);%>
        </div>
        <script type="text/javascript">
         
        </script>
    </body>
</html>