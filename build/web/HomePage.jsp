<%-- 
    Document   : HomePage
    Created on : Nov 3, 2014, 10:31:55 AM
    Author     : Bvek
--%>

<%@page import="com.info.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body {
                background-color: #efefef;
                background-image: none;
            }

            h1{color:maroon}
            h1{font: "20"}
            
            #student{
                color:darkred;
                top:250px;
                right:600px;
                left:400px;
                position:fixed;
                padding: 10px 10px 10px 20px;
            }

            nav {
                line-height:30px;
                background-color:#eeeeee;
                float:right;
                padding:5px;	      
            }
            #teacher{
                color:darkred;
                top:250px;
                right:400px;
                left:650px;
                position:fixed;
                padding: 10px 10px 10px 20px;
            }

            #table{

                width: 600px;
                height: 200px;
                top:200px;
                right:500px;

                left:300px;

                position:fixed;

                background:#FFFFFF;

                border:1px solid #ccc;

                padding: 10px 10px 10px 20px;
            }
            form{
                height: 150px;
                width: 600px;
                padding:10px 10px 10px 20px;


            }

        </style>

    </head>
    <body>

        <jsp:include page="Header.jsp"></jsp:include>


        <%User validUser = (User) session.getAttribute("validUser");
            if (validUser == null) {
                response.sendRedirect("Login.jsp");%>


        <%} else {%>
        <nav><a href="Logout.jsp">Logout</a></nav>
        <div id="table">

            <form action="StudentServlet" method="Post">




                <input type="Submit" name="Student" value="Student" id="student"><br>


                <input type="Submit" name="Teacher" value="Teacher" id="teacher"><br>



                <%}%>


            </form>
        </div>

        <jsp:include page="Footer.jsp"/>
    </body>
</html>
