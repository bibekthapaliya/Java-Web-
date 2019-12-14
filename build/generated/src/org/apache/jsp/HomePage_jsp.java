package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.info.model.User;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            body {\n");
      out.write("                background-color: #efefef;\n");
      out.write("                background-image: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h1{color:maroon}\n");
      out.write("            h1{font: \"20\"}\n");
      out.write("            p{color: violet}\n");
      out.write("            #student{\n");
      out.write("                color:darkred;\n");
      out.write("                top:200px;\n");
      out.write("                right:600px;\n");
      out.write("                left:400px;\n");
      out.write("                position:fixed;\n");
      out.write("                padding: 10px 10px 10px 20px;\n");
      out.write("            }\n");
      out.write("            #teacher{\n");
      out.write("                color:darkred;\n");
      out.write("                top:200px;\n");
      out.write("                right:400px;\n");
      out.write("                left:650px;\n");
      out.write("                position:fixed;\n");
      out.write("                padding: 10px 10px 10px 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #table{\n");
      out.write("                \n");
      out.write("                width: 600px;\n");
      out.write("                height: 200px;\n");
      out.write("                top:100px;\n");
      out.write("                right:500px;\n");
      out.write("\n");
      out.write("                left:300px;\n");
      out.write("\n");
      out.write("                position:fixed;\n");
      out.write("\n");
      out.write("                background:#FFFFFF;\n");
      out.write("\n");
      out.write("                border:1px solid #ccc;\n");
      out.write("\n");
      out.write("                padding: 10px 10px 10px 20px;\n");
      out.write("            }\n");
      out.write("            form{\n");
      out.write("                height: 150px;\n");
      out.write("                width: 600px;\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
User validUser = (User) session.getAttribute("validUser");
            if (validUser == null) {
                response.sendRedirect("Login.jsp");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
} else {
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"table\">\n");
      out.write("            <form action=\"StudentServlet\" method=\"Post\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <input type=\"Submit\" name=\"Student\" value=\"Student\" id=\"student\"><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <input type=\"Submit\" name=\"Teacher\" value=\"Teacher\" id=\"teacher\"><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                ");
}
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
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
