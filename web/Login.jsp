<%-- 
    Document   : Login
    Created on : Nov 4, 2014, 9:21:17 PM
    Author     : Bvek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
       
       
        <style>
            
            body{
                background-color:lavenderblush;
                
                
            }
            h1{
                
              font-family:fantasy;
            }
            #cent{
                background-color:rosybrown;
                alignment-adjust: central;
                height:200px;
                top:200px;
                right:350px;
                left:400px;
                position: fixed;
                width: 300px;
                padding: 10px 10px 20px 20px;
                
            }
           
            
        </style>
    </head>
    <body>
        <jsp:include page="Header.jsp"/>
          
        <div id="cent">
        
        <form action="UserServlet" method="post">
            <input type="text" name="userName" required title="Username required" placeholder="userName" autofocus="autofocus" data-icon="U" style="height:30px;" ><br>
            <input type="password" name="Password" required title="Password required" placeholder="Password" data-icon="x" style="height:30px;" ><br>

            <div class="btn" style="margin-top:10px;">
            <button type="submit" class="enviar" style="height:30px;">Login</button>
            </div>

        </form>
        </div>
        
       
    
        <jsp:include page="Footer.jsp"/>
        
        
        
    </body>
</html>
