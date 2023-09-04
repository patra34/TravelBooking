package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SignOut_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
 session.invalidate(); 
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    \n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Sign Out</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"SOURCES/CSS/styles.css\">\n");
      out.write("    <script>\n");
      out.write("        function preventBack() {\n");
      out.write("            window.history.forward();\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        setTimeout(\"preventBack()\", 0);\n");
      out.write("        window.onunload = function() {\n");
      out.write("            null\n");
      out.write("        };\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <header style=\"background-color: rgb(255, 106, 0);\">\n");
      out.write("        <div class=\"header-content\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <img width=\"20%\" height=\"20%\" src=\"SOURCES/IMG/logo.png\" alt=\"Background Image\">\n");
      out.write("            </div>\n");
      out.write("            <h1 class=\"website-name\">INDI-TRAVELS</h1>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <main>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <img src=\"SOURCES/IMG/SignOut.jpg\" alt=\"Background Image\">\n");
      out.write("            <div class=\"centered-text\">\n");
      out.write("                <h2>THANKS FOR VISITING!</h2>\n");
      out.write("                <button onclick=\"window.location.href = 'login.jsp';\">GO TO HOME</button></a\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </main>\n");
      out.write("\n");
      out.write("    <footer>\n");
      out.write("        <div class=\"footer-content\" style=\"background-color: rgb(255, 68, 0);\">\n");
      out.write("            <ul class=\"footer-list\">\n");
      out.write("                <li><a href=\"AboutUs.html\">About Us</a></li>\n");
      out.write("                <li><a href=\"ContactUs1.html\">Contact Us</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("</body>\n");
      out.write("\n");
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
