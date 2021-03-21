<%-- 
    Document   : Transfer
    Created on : 19 Feb, 2021, 9:01:59 AM
    Author     : Pankaj singh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Transfer</title>
    </head>

    <style type=text/css>
        body{
            margin: 0;
            padding: 0;
            background-image: url("image/bank.jpg");
            background-position: center;
            background-repeat: no-repeat;
            font-family:apple-system, BlinkMacSystemFont, "Segoe UI", Helvetica, Arial, sans-serif;

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
        #section{
            border-radius: 10px;
            width: 30%;
            margin: 0 auto;
            margin-top: 100px;
            background-color: #f2f4f8;
            height:340px;
        }
        #TransferForm{
            padding: 10px;
            width:90%;
            margin: 0 auto;

        }
        #form1{
            display: flex;
            flex-wrap: wrap;
            flex-direction: column;

        }
        #form1 label{
            padding: 5px; 
        }
        input[type=submit]{
            width: 30%;
            margin: 0 auto;
            margin-top: 10px;
            height: 30px;
            border-radius: 5px;
            background-color: #0099cc;
            color:#f2f4f8;
            cursor: pointer;
        }
        input[type=submit]:hover{
            background-color:#ffffff;
            color:black;
        }

        input[type=text]{
            border-radius:5px;
            height: 30px;
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
            }  } 
        #Current{
            display: none;
        }
        </style>
        <body>
            <div id="title">
            <h1>Basic Banking System</h1>


            <div id="nav-bar">
                <a href="index.jsp">Home</a>
                
                


            </div></div>
        <div id="section">
            <div id="TransferForm">

                <form id="form1" method="post" action="transfer">
                    <%
                        String name = request.getParameter("name");
                        String email = request.getParameter("email");
                        String amount= request.getParameter("amount");

                    %>

                    <label>Sender's name</label>
                    <input type="text" name="name" value="<%=name%>"  readonly/>
                    <label>Sender's Email</label>
                    <input type="text" name="email" value="<%=email%>" readonly />
                    <label>Enter Reciever's Name</label>
                    <input type="text" name="recievername" />
                    <label>Enter Amount </label>
                    <input type="text" name="amount" />
                    <input id="Current" type="text" name="CurrentBal" value="<%=amount%>"/>
                    <input type="submit" value="Transfer"/>

                </form>

            </div>
        </div>
         
    </body>
</html>
