package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Signup Form</title>\n");
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
      out.write("                <img width=\"20%\" height=\"20%\"\n");
      out.write("                    src=\"SOURCES/IMG/logo.png\"\n");
      out.write("                    alt=\"logo\">\n");
      out.write("            </div>\n");
      out.write("            <h1 class=\"website-name\">INDI-TRAVELS</h1>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <main>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <img src=\"SOURCES/IMG/bg-image.png\" alt=\"Background Image\">\n");
      out.write("            <div class=\"centered-text\">\n");
      out.write("                <h2>Signup Form</h2>\n");
      out.write("                <form class=\"login-form\" method=\"post\" action=\"register\" onsubmit=\"validateForm(event)\">\n");
      out.write("                    <input type=\"text\" name=\"username\" placeholder=\"Username\" required>\n");
      out.write("                    <input type=\"text\" name=\"phone\" placeholder=\"Phone No\" oninput=\"validateContact(this)\" required>\n");
      out.write("                    <input type=\"text\" name=\"email\" placeholder=\"Email Id\" oninput=\"validateEmail(this)\" required>\n");
      out.write("                    <div style=\"position: relative;\">\n");
      out.write("                        <input type=\"password\" name=\"password\" id=\"password\" placeholder=\"Password\" oninput=\"validatePass(this)\" required>\n");
      out.write("                        <span id=\"toggle-icon\"\n");
      out.write("                            style=\"position: absolute; top: 50%; right: 10px; transform: translateY(-50%); cursor: pointer; font-size: 13px; font-weight: bold;\"\n");
      out.write("                            onclick=\"togglePasswordVisibility()\">Show</span>\n");
      out.write("                    </div>\n");
      out.write("                    <div style=\"position: relative;\">\n");
      out.write("                        <input type=\"password\" name=\"cpassword\" id=\"cpassword\" placeholder=\"Confirm password\" oninput=\"validatePassword(this)\" required>\n");
      out.write("                        <span id=\"toggle-icon1\"\n");
      out.write("                            style=\"position: absolute; top: 50%; right: 10px; transform: translateY(-50%); cursor: pointer; font-size: 13px; font-weight: bold;\"\n");
      out.write("                            onclick=\"togglePasswordVisibility1()\">Show</span>\n");
      out.write("                    </div>\n");
      out.write("                    <button type=\"submit\" >Signup</button>\n");
      out.write("                </form>\n");
      out.write("                <p>Already a User? <a href=\"login.jsp\">Login</a></p>\n");
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
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        function togglePasswordVisibility() {\n");
      out.write("            passwordInput = document.getElementById('password');\n");
      out.write("            toggleIcon = document.getElementById('toggle-icon');\n");
      out.write("            if (passwordInput.type === 'password') {\n");
      out.write("                passwordInput.type = 'text';\n");
      out.write("                toggleIcon.innerText = 'Hide';\n");
      out.write("            } else {\n");
      out.write("                passwordInput.type = 'password';\n");
      out.write("                toggleIcon.innerText = 'Show';\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        function togglePasswordVisibility1() {\n");
      out.write("             passwordInput1 = document.getElementById('cpassword');\n");
      out.write("             toggleIcon1 = document.getElementById('toggle-icon1');\n");
      out.write("            if (passwordInput1.type === 'password') {\n");
      out.write("                passwordInput1.type = 'text';\n");
      out.write("                toggleIcon1.innerText = 'Hide';\n");
      out.write("            } else {\n");
      out.write("                passwordInput1.type = 'password';\n");
      out.write("                toggleIcon1.innerText = 'Show';\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        function validateContact(input) {\n");
      out.write("            var contactNumber = input.value;\n");
      out.write("            var pattern = /^[0-9]{10}$/; \n");
      out.write("\n");
      out.write("            if (!pattern.test(contactNumber)) {\n");
      out.write("                input.setCustomValidity(\"Contact number must contain 10 digits.\");\n");
      out.write("            } else {\n");
      out.write("                input.setCustomValidity(\"\");\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        function validatePass(input) {\n");
      out.write("            var password = document.getElementById(\"password\").value;\n");
      out.write("            var confirmPasswordInput = document.getElementById(\"cpassword\");\n");
      out.write("\n");
      out.write("            if (confirmPasswordInput.value !== password) {\n");
      out.write("                confirmPasswordInput.setCustomValidity(\"Passwords do not match.\");\n");
      out.write("            } else {\n");
      out.write("                confirmPasswordInput.setCustomValidity(\"\");\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        function validatePassword(input) {\n");
      out.write("            var password = document.getElementById(\"password\").value;\n");
      out.write("            var confirmPasswordInput = document.getElementById(\"cpassword\");\n");
      out.write("\n");
      out.write("            if (password !== confirmPasswordInput.value) {\n");
      out.write("                confirmPasswordInput.setCustomValidity(\"Passwords do not match.\");\n");
      out.write("            } else {\n");
      out.write("                confirmPasswordInput.setCustomValidity(\"\");\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        function validateEmail(input) {\n");
      out.write("            var email = input.value;\n");
      out.write("            var atIndex = email.indexOf(\"@\");\n");
      out.write("            var dotIndex = email.lastIndexOf(\".\");\n");
      out.write("            var pattern = /^[a-zA-Z0-9@.]+$/;\n");
      out.write("        \n");
      out.write("            if (!pattern.test(inputValue) || atIndex === -1 || atIndex !== email.lastIndexOf(\"@\") || dotIndex !== email.length - 3 && dotIndex !== email.length - 4) {\n");
      out.write("                input.setCustomValidity(\"Invalid email format.\");\n");
      out.write("            } else {\n");
      out.write("                input.setCustomValidity(\"\");\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        function validateForm(event) {\n");
      out.write("            var passwordInput = document.getElementById(\"password\");\n");
      out.write("            var confirmPasswordInput = document.getElementById(\"cPassword\");\n");
      out.write("            var contactInput = document.getElementById(\"contact\");\n");
      out.write("            var emailInput = document.getElementsByName(\"email\")[0];\n");
      out.write("\n");
      out.write("            if (!passwordInput.checkValidity() || !confirmPasswordInput.checkValidity() || !contactInput.checkValidity() || !emailInput.checkValidity()) {\n");
      out.write("                event.preventDefault(); \n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        var status = document.getElementById(\"status\").value;\n");
      out.write("        if(status==\"success\"){\n");
      out.write("            swal(\"Congrats\", \"Account Created Successfully\",\"success\")\n");
      out.write("        } \n");
      out.write("        if(status==\"failed\"){\n");
      out.write("            swal(\"Oops!\", \"Something went wrong\",\"error\")\n");
      out.write("        }\n");
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
