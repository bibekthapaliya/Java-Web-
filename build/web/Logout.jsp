<%-- 
    Document   : Logout
    Created on : Nov 6, 2014, 1:34:08 PM
    Author     : Bvek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        
        session.invalidate();
        response.sendRedirect("Login.jsp");
        
        
        
        
        %>
        
        
    </body>
</html>
