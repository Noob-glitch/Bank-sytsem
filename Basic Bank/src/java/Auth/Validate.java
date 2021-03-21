/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Auth;

import java.sql.Connection;

/**
 *
 * @author Pankaj singh
 */import java.sql.*;

public class Validate {
    public static boolean checkUser(String name) 
    {
        boolean st =false;
        try {

            //loading drivers for mysql
            Class.forName("com.mysql.jdbc.Driver");

            //creating connection with the database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bank","root","123");
            PreparedStatement ps = con.prepareStatement("select * from customer where name=?" );
            ps.setString(1, name);
            
            ResultSet rs =ps.executeQuery();
            st = rs.next();

        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return st;                 
    }   
}
