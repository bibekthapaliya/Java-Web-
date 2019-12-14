<%-- 
    Document   : StudentForm
    Created on : Sep 25, 2014, 7:49:20 AM
    Author     : Bvek
--%>

<%@page import="com.info.model.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body {background-color: lightgray}
            h1{color: black}
            h1{font: "20"}
            #p {color: violet;
               text-align:right;
                top:200px;
            }
            
            table, tr, td {

                border: 1px solid black;
            }



            form {
                background-color:#BBBBBB;
                height:200px;
                top:200px;
                margin: auto;
                left:400px;
                right:300px;
                width: auto;
                position: fixed;
                padding: 10px 10px 20px 20px;
                line-height: 2em;
                alignment-adjust: central;
            }

        </style>


    </head>
    <body>
        <jsp:include page="Header.jsp"/>

        <p id="p"><a href="Logout.jsp">Logout</a></p>

        <%
            Student Student = (Student) request.getAttribute("Student");
            if (Student == null) {
                Student = new Student();
                Student.setStudentId(0);
                Student.setStudentName("");
                Student.setStudentAddress("");
            }


        %>
        <form action="StudentServlet" method="post" >
            <table>
                <tr><td>Student Name:</td>
                    <td><input type="text" name="StudentName" required title="StudentName required" placeholder="StudentName" autofocus="autofocus" data-icon="U" style="height:20px; right:10px;" value="<%=Student.getStudentName()%>"></td></tr>
                <tr><td>Student Address:</td> <td><input type="text" name="StudentAddress" required title="Address required" placeholder="StudentAddress" data-icon="x" style="height:20px;right:10px;" value="<%=Student.getStudentAddress()%>" ></td></tr>
                               
            </table>
            <input type="hidden" name="StudentId" value="<%=Student.getStudentId()%>"><br>
            

            <% if (Student.getStudentId() == 0) { %>
            <input type="Submit" name="AddStudent" value="Add">

            <%} else {%>
            <input type="Submit" name="UpdateStudent" value="Update">
            <% }%>








        </form>


    </body>
</html>
