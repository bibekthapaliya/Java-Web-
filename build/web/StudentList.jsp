<%-- 
    Document   : StudentList
    Created on : Sep 25, 2014, 7:49:46 AM
    Author     : Bvek
--%>

<%@page import="java.util.Collections"%>
<%@page import="java.util.List"%>
<%@page import="com.info.model.Student"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            #New{
                position: absolute;
                 top:80px;
                left: 30px;
                width: 300px;
                              
                               
            }  
            #Search{
                            
                float:right;
                top:250px;
                border: 10px;
                margin: auto;
                border-collapse: collapse;
               
                
                
            }
            #logout{
                margin: auto;
                top:250px;
                left:100px;
                text-align: right;
                                     
            }
            h1{
                
                top:400px;
                text-align: center;
                              
                
            }
            #center{
                 position: absolute;
                   top:200px;
                   left:250px;
                   margin-left: auto;
                     margin-right: auto;
                     width: 75%; 
                
            }
                    
            table{
                border-bottom:1px;
                height:auto;
                width:70%;
                border: 10px;
                border-collapse: collapse;
                background-color:navajowhite;
                                                            
            }
            td{
                text-align:center;
                width:25px;
                padding:10px 0;
                border-top: 2px black solid;
                border-bottom:2px black solid;
                border-left: 2px black solid;
                border-right: 2px black solid;
                
                
            }
            
            
            
            
        </style>
        
    </head>
    <body>
        
      
            
            <p id="logout"> <a href="Logout.jsp">Logout</a></p>
            <div id="New">
                <p><a href="StudentForm.jsp">New Student</a></p>
            </div>
             
            <form action="StudentServlet" method="post">
              <span>
              <select name="tablelist">	
               <option>ID</option>
                <option>First Name</option>
		<option>Last Name</option>
										
		</select>
		</span>
		<span>
                    <input type="text" name="SearchValue" placeholder="Search ..."  autocomplete="off">
                 <button  type="submit" name="Search" style="border-radius:4px;">Search<i class="icon-search white"> </i></button>
		</span>   
                
            </form>
              <%
                 
        List<Student> studentList=(ArrayList)request.getAttribute("studentList");
              
        %>
        <div id="center">
        <table>
            <caption>Student List</caption>
        
        <%
        int i=0;
         
        for(Student S:studentList){
        %> 
        <tr>
         <td> <%=++i %> </td> 
          <td><%=S.getStudentName()%> </td>
           <td> <%=S.getStudentAddress()%> </td>
            <td><a href=" StudentServlet?StudentIdForEdit=<%=S.getStudentId()%>" >Edit</a></td>
             <td><a href=" StudentServlet?StudentIdForDelete=<%=S.getStudentId()%>">Delete</a></td>
             </tr>
             

        <%
        }
        %>
        
        
        </table>
        </div>
        <jsp:include page="Footer.jsp"/>
        
    </body>
</html>
