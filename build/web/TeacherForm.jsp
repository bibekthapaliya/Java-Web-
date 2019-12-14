<%-- 
    Document   : TeacherForm
    Created on : Dec 1, 2014, 9:46:06 PM
    Author     : Bvek
--%>

<%@page import="com.info.model.Teacher"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
        Teacher teacher=(Teacher)request.getAttribute("Teacher");
        if (teacher == null) {
                teacher = new Teacher();
                teacher.setTeacher_Id(0);
                teacher.setTeacherName("");
                teacher.setAddress("");
                teacher.setFaculty("");
                

               
            }
        
        
        
        
        %>
        <form action="Teacher" method="post">
            <table>
                <tr><td>Teacher Name:</td>
                    <td><input type="text" name="teacherName" required title="teacherName required" placeholder="teacherName" autofocus="autofocus" data-icon="U" style="height:20px; right:10px;" value="<%=teacher.getTeacherName()%>"></td></tr>
                <tr><td>Faculty:</td> <td><input type="text" name="Faculty" required title="Faculty required" placeholder="faculty" data-icon="x" style="height:20px;right:10px;" value="<%=teacher.getFaculty()%>" ></td></tr>
                <tr><td>Address:</td> <td><input type="text" name="Address" required title="Address required" placeholder="addrerss" data-icon="x" style="height:20px;right:10px;" value="<%=teacher.getAddress()%>" ></td></tr>
            </table>
            <input type="hidden" name="teacher_Id" value="<%=teacher.getTeacher_Id()%>"><br>
            

            <% if (teacher.getTeacher_Id() == 0) { %>
            <input type="Submit" name="AddTeacher" value="Add">

            <%} else {%>
            <input type="Submit" name="UpdateTeacher" value="Update">
            <% }%>
        </form>


        
        
        
    </body>
</html>
