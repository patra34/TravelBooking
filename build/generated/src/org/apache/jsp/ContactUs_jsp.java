package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ContactUs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Contact Us</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"SOURCES/CSS/styles.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <header style=\"background-color: rgb(202, 22, 22);\">\n");
      out.write("        <div class=\"header-content\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <img width=\"20%\" height=\"20%\"\n");
      out.write("                    src=\"SOURCES/IMG/logo.png\"\n");
      out.write("                    alt=\"Background Image\">\n");
      out.write("            </div>\n");
      out.write("            <h1 class=\"website-name\">INDI-TRAVELS</h1>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <nav>\n");
      out.write("        <div class=\"nav-content\" style=\"background-color: red; display: flex; justify-content: space-between;\">\n");
      out.write("            <ul class=\"footer-list\">\n");
      out.write("                <li><a href=\"Catalogs.jsp\">CATALOG</a></li>\n");
      out.write("                <li><a href=\"Orders.jsp\">MY ORDERS</a></li>\n");
      out.write("                <li><a href=\"AboutUs1.jsp\">ABOUT US</a></li>\n");
      out.write("                <li><a href=\"Feedback.jsp\">FEEDBACK</a></li>\n");
      out.write("            </ul>\n");
      out.write("            <button class=\"sub\" style=\"padding-left: 25px; padding-right: 25px; margin: 5px 25px;\" onclick=\"window.location.href='SignOut.html';\">SIGN OUT</button>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <main>\n");
      out.write("        <div class=\"contact-container\">\n");
      out.write("            <img src=\"SOURCES/IMG/contact.jpg\" alt=\"Background Image\">\n");
      out.write("            <div class=\"contact-centered-text\">\n");
      out.write("                <p style=\"font-size: x-large;\"><b>HOW CAN WE HELP YOU?</b><br>Email us with any questions and enquiry\n");
      out.write("                </p>\n");
      out.write("                <hr class=\"bar\">\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <div class=\"icon\">\n");
      out.write("                        <i class=\"fa fa-map-marker\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"text\" style=\"margin-left: 54px;\">\n");
      out.write("                        <p>Address:<br> A-1,High Offices, Akash Nagar, GC Road, Mumbai</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <div class=\"icon\">\n");
      out.write("                        <i class=\"fa fa-phone\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"text\" style=\"margin-left: 44px;\">\n");
      out.write("                        <p>Phone:<br> 91-9876501234, 91-7894560123</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <div class=\"icon\">\n");
      out.write("                        <i class=\"fa fa-envelope\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"text\" style=\"margin-left: 35px;\">\n");
      out.write("                        <p>Email: <br>inditravels@tours.in</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </main>\n");
      out.write("\n");
      out.write("    <footer>\n");
      out.write("        <div class=\"footer-content\" style=\"background-color: rgb(202, 22, 22);\">\n");
      out.write("            <ul class=\"footer-list\">\n");
      out.write("                <li><a href=\"AboutUs1.jsp\">About Us</a></li>\n");
      out.write("                <li><a href=\"ContactUs.jsp\">Contact Us</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
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
