<%-- 
    Document   : CustomerDetail
    Created on : 19 Feb, 2021, 7:24:56 AM
    Author     : Pankaj singh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
        .nav{
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
        .nav:hover{
            color:#1d7eac;


        }
        #nav-bar{
            margin-left: 40px;
            width: 50%;
            display: flex;
            flex-wrap: wrap;
            height: inherit;

        }
        #customerdetail{
            border-radius: 10px;
            margin: 0 auto;
            margin-top: 20px;
            width: 45%;
            color: #ffffff;
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
            background-color: #383e56;
            padding: 5px;
            border: 1px solid #ffffff;
            border-radius: 5px; 
            color:#ffffff;

        }

    </style>
    <body>
        <sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver"
                           url="jdbc:mysql://localhost/bank"
                           user="root" password="123"/>

        <div id="title">
            <h1>Basic Banking System</h1>


            <div id="nav-bar">
                <a class="nav"href="index.jsp">Home</a>
              


            </div></div>
        <div id="customerdetail">
            <table>
                <thead>
                    <tr>
                        <th>
                            Name
                        </th>
                        <th>
                            Email
                        </th>
                        <th>
                            Current Balance
                        </th>
                        <th>Action</th>

                    </tr>
                </thead>
                <tbody>
               
                    <tr>

             
                        <sql:query dataSource="${snapshot}" var="result">
                            SELECT * from customer where Name="<c:out value="${param.username}"></c:out>"

                        </sql:query>
                        <c:forEach var="row" items="${result.rows}">
                    <form action="Transfer.jsp" method="post">
                        <th><input type="text" name="name" value="<c:out value="${row.Name}"/>" readonly/></th>
                            <th><input type="text" name="email" value="<c:out value="${row.Email}"/>" readonly/></th>
                            <th><input type="text" name="amount" value="<c:out value="${row.Amount}"/>" readonly/></th>
                            <th> <input type="submit" value="Transfer"/></th>
                             </form>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>

        </div>
    </body>
</html>
