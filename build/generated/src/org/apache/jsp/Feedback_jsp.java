package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Feedback_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 
    if(session.getAttribute("name")==null){
        response.sendRedirect("login.jsp");
    }

      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Feedback</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"SOURCES/CSS/styles.css\">\n");
      out.write("    <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"alert/dist/sweetalert.css\">\n");
      out.write("    <script>\n");
      out.write("        function signOut() {\n");
      out.write("            window.location.href = \"SignOut.jsp\"; \n");
      out.write("            window.history.pushState(null, \"\", \"SignOut.jsp\"); \n");
      out.write("            window.onpopstate = function(event) {\n");
      out.write("                window.history.forward();\n");
      out.write("            };\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body style=\"background-image: url('SOURCES/IMG/catalog.jpg'); background-size: cover; background-position: center;\n");
      out.write("background-attachment: fixed;\">\n");
      out.write("    <input type=\"hidden\" id=\"status\" value=\"");
      out.print( request.getAttribute("status") );
      out.write("\">\n");
      out.write("    <div>\n");
      out.write("        <header style=\"position: fixed; z-index: 1; top: 0; left: 0;\">\n");
      out.write("            <div class=\"header-content\">\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                    <img width=\"20%\" height=\"20%\" src=\"SOURCES/IMG/logo.png\" alt=\"Background Image\">\n");
      out.write("                </div>\n");
      out.write("                <h1 class=\"website-name\">INDI-TRAVELS</h1>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        ");
 String uname=(String)session.getAttribute("name");
      out.write("\n");
      out.write("        <nav>\n");
      out.write("            <div class=\"nav-content\"\n");
      out.write("                style=\"background-color: rgb(0, 247, 255); display: flex; justify-content: space-between; position: fixed; width: 100%; z-index: 1; margin-top: -100px;\">\n");
      out.write("                <ul class=\"footer-list\">\n");
      out.write("                    <li><a href=\"Catalogs.jsp\" style=\"color: black;\">CATALOG</a></li>\n");
      out.write("                    <li><a href=\"Orders.jsp\" style=\"color: black;\">ORDERS</a></li>\n");
      out.write("                    <li><a href=\"AboutUs1.jsp\" style=\"color: black;\">ABOUT US</a></li>\n");
      out.write("                    <li><a href=\"Feedback.jsp\" style=\"color: black;\">FEEDBACK</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <button class=\"sub\"\n");
      out.write("                    style=\"padding-left: 25px; padding-right: 25px; margin: 5px 25px; color: black; border: solid black 2px; background-color: yellow;\"\n");
      out.write("                    onclick=\"signOut()\">SIGN OUT</button>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <main style=\"margin-top: 200px;\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"centered-text\">\n");
      out.write("                    <h2 style=\"color: white;\">Feedback Form</h2>\n");
      out.write("                    <form class=\"login-form\" style=\"width: 450px;\" method=\"post\" action=\"feedback\" onsubmit=\"validateForm(event)\">\n");
      out.write("                        <div style=\"display: flex; align-items: center;\">\n");
      out.write("                            <span style=\"color: white; margin-right: 30px;\">USERNAME:</span>\n");
      out.write("                            <input type=\"text\" name=\"username\" placeholder=\"Username\" value=\"");
      out.print( uname );
      out.write("\"  readonly>\n");
      out.write("                        </div>\n");
      out.write("                        <div style=\"display: flex; align-items: start; margin-top: 10px;\">\n");
      out.write("                            <span style=\"color: white; margin-right: 34px;\">FEEDBACK:</span>\n");
      out.write("                            <textarea name=\"feedback\" id=\"feedback\" placeholder=\"Feedback (max 200 characters)\"\n");
      out.write("                                maxlength=\"500\" oninput=\"validateFeedback(this)\" required></textarea>\n");
      out.write("                        </div>\n");
      out.write("                        <button type=\"submit\" style=\"margin-top: 20px;\">Submit</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </main>\n");
      out.write("\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"footer-content\" style=\"margin-top: 30px;\">\n");
      out.write("                <ul class=\"footer-list\">\n");
      out.write("                    <li><a href=\"AboutUs1.jsp\">About Us</a></li>\n");
      out.write("                    <li><a href=\"ContactUs.jsp\">Contact Us</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("</body>\n");
      out.write("<script>\n");
      out.write("    var status = document.getElementById(\"status\").value;\n");
      out.write("        if(status==\"failed\"){\n");
      out.write("            swal(\"Alert\", \"Fill the form properly\",\"error\");\n");
      out.write("        }\n");
      out.write("        if(status==\"success\"){\n");
      out.write("            swal(\"Done\", \"Feedback Submitted\",\"success\");\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("    function validateFeedback(input) {\n");
      out.write("        var feedback = input.value;\n");
      out.write("\n");
      out.write("        if (feedback.length > 10) {\n");
      out.write("            input.setCustomValidity(\"Feedback must not exceed 200 characters.\");\n");
      out.write("        } else {\n");
      out.write("            input.setCustomValidity(\"\");\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        var specialCharacters = /[@#$%^&*_+\\-=\\[\\]{};'\"\\\\|<>\\/?]+/;\n");
      out.write("        if (specialCharacters.test(feedback)) {\n");
      out.write("            input.setCustomValidity(\"Feedback must not contain special characters.\");\n");
      out.write("        } else {\n");
      out.write("            input.setCustomValidity(\"\");\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("     function validateForm(event) {\n");
      out.write("        var feedbackInput = document.getElementById(\"feedback\");\n");
      out.write("\n");
      out.write("        if (!feedbackInput.checkValidity()) {\n");
      out.write("            event.preventDefault();\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("</script>\n");
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
