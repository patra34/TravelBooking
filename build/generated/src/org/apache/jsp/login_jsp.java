package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Login Form</title>\n");
      out.write("    <link rel=\"icon\" type=\"image/x-icon\" href=\"SOURCES/IMG/favicon_io/favicon.ico\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"SOURCES/CSS/styles.css\">\n");
      out.write("    <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"alert/dist/sweetalert.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <input type=\"hidden\" id=\"status\" value=\"");
      out.print( request.getAttribute("status") );
      out.write("\">\n");
      out.write("    <header>\n");
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
      out.write("            <img src=\"SOURCES/IMG/bg-image.png\" alt=\"Background Image\">\n");
      out.write("            <div class=\"centered-text\">\n");
      out.write("                <h2>Login Form</h2>\n");
      out.write("                <form class=\"login-form\" method=\"post\" action=\"login\" onsubmit=\"validateForm(event)\">\n");
      out.write("                    <input type=\"text\" name=\"username\" placeholder=\"username\" required>\n");
      out.write("                    <div style=\"position: relative;\">\n");
      out.write("                        <input type=\"password\" name=\"password\" id=\"password\" placeholder=\"Password\"  required>\n");
      out.write("                        <span id=\"toggle-icon\" style=\"position: absolute; top: 50%; right: 10px; transform: translateY(-50%); cursor: pointer; font-size: 13px; font-weight: bold;\" onclick=\"togglePasswordVisibility()\">Show</span>\n");
      out.write("                      </div>\n");
      out.write("                    <button type=\"submit\">Login</button>\n");
      out.write("                  </form>\n");
      out.write("                  <p>New User? <a href=\"Signup.jsp\">Sign Up</a></p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </main>\n");
      out.write("\n");
      out.write("    <footer>\n");
      out.write("        <div class=\"footer-content\">\n");
      out.write("            <ul class=\"footer-list\">\n");
      out.write("                <li><a href=\"AboutUs.html\">About Us</a></li>\n");
      out.write("                <li><a href=\"ContactUs1.html\">Contact Us</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        function togglePasswordVisibility() {\n");
      out.write("          const passwordInput = document.getElementById('password');\n");
      out.write("          const toggleIcon = document.getElementById('toggle-icon');\n");
      out.write("          if (passwordInput.type === 'password') {\n");
      out.write("            passwordInput.type = 'text';\n");
      out.write("            toggleIcon.innerText = 'Hide';\n");
      out.write("          } else {\n");
      out.write("            passwordInput.type = 'password';\n");
      out.write("            toggleIcon.innerText = 'Show';\n");
      out.write("          }\n");
      out.write("        }\n");
      out.write("        var status = document.getElementById(\"status\").value;\n");
      out.write("        if(status==\"failed\"){\n");
      out.write("            swal(\"Sorry\", \"Invalid Username or Password\",\"error\");\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
