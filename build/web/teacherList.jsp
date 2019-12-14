<%-- 
    Document   : teacherList
    Created on : Dec 8, 2014, 10:13:38 PM
    Author     : Bvek
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.info.model.Teacher"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%
        List<Teacher> teacherList=(ArrayList)request.getAttribute("teacherList");
        
        %>
        <a href="TeacherForm.jsp">New Teacher</a>
        <table>
            <caption>Teacher List</caption>
        
        <%
        int i=0;
         
        for(Teacher T:teacherList){
        %> 
        <tr>
         <td> <%=++i %> </td> 
          <td><%=T.getTeacherName()%> </td>
           <td> <%=T.getFaculty()%> </td>
	   <td> <%=T.getAddress()%> </td>
            <td><a href=" Teacher?TeacherIdForEdit=<%=T.getTeacher_Id()%>" >Edit</a></td>
             <td><a href=" Teacher?TeacherIdForDelete=<%=T.getTeacher_Id()%>">Delete</a></td>
             </tr>

        <%
        }
        %>
        
        
        </table>
    </body>
</html>
