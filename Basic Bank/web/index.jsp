<%-- 
    Document   : index
    Created on : 21 Feb, 2021, 8:59:29 PM
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

        #ViewAllCustomers{
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
            font-size: large;
            padding: 5px;
            border: 1px solid #ffffff;
            border-radius: 5px; 
            background-color: #0099cc;

        }
        button{
            border-radius: 5px;
            height: 25px;
            background-color: #161d6f;
            color: #ffffff;
            cursor: pointer;

        }
        button:hover{
            background-color: #a9294f;
        }
        #TransferHistory{
            width:45%;
            background-color: #11698e;
            border-radius: 10px;
            margin: 20px;
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
            #ViewAllCustomers{
                width: 60%;
            }
            table{
                width: 30%;    
                font-size: 8px;

            }
            table button{
                font-size: 8px;
            }
        }
        #none{
            display: none;
        }
    </style>
    <body>
        <sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver"
                           url="jdbc:mysql://localhost/bank"
                           user="root" password="123"/>
        <div id="title">
            <h1>Basic Banking System</h1>


            <div id="nav-bar">
                
               
                <a href="TransferHistory.jsp" id="nav3">TransferHistory</a>


            </div></div>
        <div id="section">
            <div id="ViewAllCustomers">
                <table>
                    <thead>
                        <tr>
                            <th>
                                Customer Name
                            </th>
                            

                            <th>
                                Current Balance
                            </th>
                     
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>
                         <sql:query dataSource="${snapshot}" var="result">
                            SELECT * from customer

                        </sql:query>
                        <c:forEach var="row" items="${result.rows}">
                        <tr>
                            <th><c:out value="${row.Name}"/></th>
                            
                            <th><c:out value="${row.Amount}"/></th>
                            <th><button class="btn2">UserDetails</button></th>
                        </tr>
                        </c:forEach>
                       
                    </tbody>
                </table>

            </div>


        </div>
        <div id="none">
            <form method="post" action="CustomerDetail.jsp">
                <input id="username" type="text" name="username"/>
                <input type="text" id="email" name="email"/>
                <input type="text" id="amount" name="amount"/>
                <input  id="submit" type="submit"/></form>
        </div>

        <script type="text/javascript">
            var CustomerName;
                    var btn = [...document.getElementsByClassName("btn")];
                    for (let i = 0; i < btn.length; i++){
            btn[i].addEventListener("click", clicked);
            }
            function clicked(event){
            event.addEventListener(location.href = "Transfer.jsp");
            }
            var btn2 = [...document.getElementsByClassName("btn2")];
                    for (let i = 0; i < btn2.length; i++){
            btn2[i].addEventListener('click', Customer_Details);
            }
            function Customer_Details(event){
            var element = event.target;
                    var name = element.parentElement.parentElement.children[0].innerHTML;
                    var email = element.parentElement.parentElement.children[1].innerHTML;
                    var amount = element.parentElement.parentElement.children[2].innerHTML;
                    console.log(name);
                    let username = document.getElementById("username").value = name;
                    let Cemail = document.getElementById("email").value = email;
                    let Camount = document.getElementById("amount").value = amount;
                    console.log(username, email, amount);
                    if (username != null && Cemail != null && Camount != null)
                    // event.addEventListener(location.href="CustomerDetail.jsp");
                    document.getElementById("submit").click();
            }




        </script>
    </body>
</html>
