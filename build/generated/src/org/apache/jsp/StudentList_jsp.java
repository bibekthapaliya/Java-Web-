package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import com.info.model.Student;
import java.util.ArrayList;

public final class StudentList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            #New{\n");
      out.write("                color:darkred;\n");
      out.write("                font-size:20px;\n");
      out.write("                alignment-adjust: central;\n");
      out.write("                top :100px;\n");
      out.write("                right: 300px;\n");
      out.write("                left:600px;\n");
      out.write("                position: fixed;\n");
      out.write("                           \n");
      out.write("                               \n");
      out.write("            }  \n");
      out.write("            #logout{\n");
      out.write("                top:110px;\n");
      out.write("                left:1000px;\n");
      out.write("              \n");
      out.write("                                           \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("        <h1>Student List!</h1>\n");
      out.write("        <div id=\"logout\"> <a href=\"Logout.jsp\">Logout</a></div>\n");
      out.write("        <form action=\"StudentServlet\" method=\"post\">\n");
      out.write("        <div id=\"New\"><input type=\"Submit\" name=\"NewStudent\" value=\"NewStudent\"></div>  \n");
      out.write("        </form>\n");
      out.write("        ");

        List<Student> studentList=(ArrayList)request.getAttribute("studentList");
        
        
      out.write("\n");
      out.write("        <table>\n");
      out.write("      \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");

        int i=0;
        
        for(Student S:studentList){
        
      out.write(" \n");
      out.write("        <tr>\n");
      out.write("            <td> ");
      out.print(++i );
      out.write(" </td>\n");
      out.write("            <td>");
      out.print(S.getStudentName());
      out.write(" </td>\n");
      out.write("            <td> ");
      out.print(S.getStudentAddress());
      out.write(" </td>\n");
      out.write("            <td><a href=\" StudentServlet?StudentIdForEdit=");
      out.print(S.getStudentId());
      out.write("\" >Edit</a></td>\n");
      out.write("             <td><a href=\" StudentServlet?StudentIdForDelete=");
      out.print(S.getStudentId());
      out.write("\">Delete</a></td>\n");
      out.write("        </tr>\n");
      out.write("        ");

        }
        
      out.write("\n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Foote.jsp", out, false);
      out.write("\n");
      out.write("        \n");
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
