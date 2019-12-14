package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.info.model.Student;

public final class StudentForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            body {background-color: lightgray}\n");
      out.write("            h1{color: black}\n");
      out.write("            h1{font: \"20\"}\n");
      out.write("            p{color: violet}\n");
      out.write("            form{background:lightblue }\n");
      out.write("            table, tr, td {\n");
      out.write("\n");
      out.write("                border: 1px solid black;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            form {\n");
      out.write("                background-color:#BBBBBB;\n");
      out.write("                alignment-adjust: central;\n");
      out.write("                height:200px;\n");
      out.write("                top:400px;\n");
      out.write("                right:350px;\n");
      out.write("                left:600px;\n");
      out.write("                position: fixed;\n");
      out.write("                padding: 10px 10px 20px 20px;\n");
      out.write("                line-height: 2em;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <a href=\"Logout.jsp\">Logout</a>\n");
      out.write("\n");
      out.write("        ");

            Student Student = (Student) request.getAttribute("Student");
            if (Student == null) {
                Student = new Student();
                Student.setStudentId(0);
                Student.setStudentName("");
                Student.setStudentAddress("");
            }


        
      out.write("\n");
      out.write("        <form action=\"StudentServlet\" method=\"post\">\n");
      out.write("            <table>\n");
      out.write("                <tr><td>Student Name:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"StudentName\" required title=\"StudentName required\" placeholder=\"StudentName\" autofocus=\"autofocus\" data-icon=\"U\" style=\"height:20px; right:10px;\" value=\"");
      out.print(Student.getStudentName());
      out.write("\"></td></tr>\n");
      out.write("                <tr><td>Student Address:</td> <td><input type=\"text\" name=\"StudentAddress\" required title=\"Address required\" placeholder=\"StudentAddress\" data-icon=\"x\" style=\"height:20px;right:10px;\" value=\"");
      out.print(Student.getStudentAddress());
      out.write("\" ></td></tr>\n");
      out.write("            </table>\n");
      out.write("            <input type=\"hidden\" name=\"StudentId\" value=\"");
      out.print(Student.getStudentId());
      out.write("\"><br>\n");
      out.write("            \n");
      out.write("\n");
      out.write("            ");
 if (Student.getStudentId() == 0) { 
      out.write("\n");
      out.write("            <input type=\"Submit\" name=\"AddStudent\" value=\"Add\">\n");
      out.write("\n");
      out.write("            ");
} else {
      out.write("\n");
      out.write("            <input type=\"Submit\" name=\"UpdateStudent\" value=\"Update\">\n");
      out.write("            ");
 }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
