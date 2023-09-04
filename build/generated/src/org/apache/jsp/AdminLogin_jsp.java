package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Admin Login Form</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"SOURCES/CSS/styles.css\">\n");
      out.write("    <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"alert/dist/sweetalert.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <input type=\"hidden\" id=\"status\" value=\"");
      out.print( request.getAttribute("status") );
      out.write("\">\n");
      out.write("    <header style=\"background-color: black;\">\n");
      out.write("        <div class=\"header-content\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <img width=\"20%\" height=\"20%\" src=\"SOURCES/IMG/logo.png\" alt=\"Background Image\">\n");
      out.write("            </div>\n");
      out.write("            <h1 class=\"website-name\">INDI-TRAVELS</h1>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <main>\n");
      out.write("        <div class=\"container\" style=\"height: 625px;\">\n");
      out.write("            <img src=\"SOURCES/IMG/AdminBG.jpg\" alt=\"Background Image\">\n");
      out.write("            <div class=\"centered-text\">\n");
      out.write("                <h2 style=\"color: yellow;\">Admin Login Form</h2>\n");
      out.write("                <form class=\"login-form\" style=\"width: 450px;\" method=\"post\" action=\"alogin\">\n");
      out.write("                    <div style=\"display: flex; align-items: center;\">\n");
      out.write("                        <span style=\"color: yellow; margin-right: 30px;\">ADMINISTRATOR:</span>\n");
      out.write("                        <input type=\"text\" name=\"admin\" placeholder=\"root\" oninput=\"validateUsername(this)\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div style=\"display: flex; align-items: center;\">\n");
      out.write("                        <span style=\"color: yellow; margin-right: 68px;\">PASSWORD:</span>\n");
      out.write("                        <div style=\"position: relative; width: 90%;\">\n");
      out.write("                            <input type=\"password\" name=\"password\" id=\"password\" placeholder=\"1234\" oninput=\"validatePassword(this)\" required>\n");
      out.write("                            <span id=\"toggle-icon\"\n");
      out.write("                                style=\"position: absolute; top: 40%; right: 10px; transform: translateY(-50%); cursor: pointer; font-size: 13px; font-weight: bold;\"\n");
      out.write("                                onclick=\"togglePasswordVisibility()\">Show</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <button type=\"submit\" style=\"margin-top: 20px;\">Login</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </main>\n");
      out.write("\n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("<script>\n");
      out.write("    function togglePasswordVisibility() {\n");
      out.write("        const passwordInput = document.getElementById('password');\n");
      out.write("        const toggleIcon = document.getElementById('toggle-icon');\n");
      out.write("        if (passwordInput.type === 'password') {\n");
      out.write("            passwordInput.type = 'text';\n");
      out.write("            toggleIcon.innerText = 'Hide';\n");
      out.write("        } else {\n");
      out.write("            passwordInput.type = 'password';\n");
      out.write("            toggleIcon.innerText = 'Show';\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("        \n");
      out.write("    var status = document.getElementById(\"status\").value;\n");
      out.write("    if(status==\"failed\"){\n");
      out.write("        swal(\"Sorry\", \"Authorized Personel Only\",\"error\");\n");
      out.write("    }\n");
      out.write("        \n");
      out.write("    function validateUsername(input) {\n");
      out.write("        var inputValue = input.value;\n");
      out.write("        var pattern = /^[a-zA-Z0-9@_.]+$/;\n");
      out.write("\n");
      out.write("        if (!pattern.test(inputValue)) {\n");
      out.write("            input.setCustomValidity(\"Username can only contain letters, numbers, and '@','_'\");\n");
      out.write("        } else {\n");
      out.write("            input.setCustomValidity(\"\");\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function validatePassword(input) {\n");
      out.write("        var inputValue = input.value;\n");
      out.write("        var pattern = /^[a-zA-Z0-9@#$%.!_]+$/;\n");
      out.write("\n");
      out.write("        if (!pattern.test(inputValue)) {\n");
      out.write("            input.setCustomValidity(\"Password can only contain letters, numbers, and special characters @, #, $, %, !,_, and .\");\n");
      out.write("        } else {\n");
      out.write("            input.setCustomValidity(\"\");\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function validateForm(event) {\n");
      out.write("        var usernameInput = document.getElementsByName(\"admin\")[0];\n");
      out.write("        var passwordInput = document.getElementsByName(\"password\")[0];\n");
      out.write("\n");
      out.write("        validateUsername(usernameInput);\n");
      out.write("        validatePassword(passwordInput);\n");
      out.write("\n");
      out.write("        if (!usernameInput.checkValidity() || !passwordInput.checkValidity()) {\n");
      out.write("            event.preventDefault();\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("    </script>\n");
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
