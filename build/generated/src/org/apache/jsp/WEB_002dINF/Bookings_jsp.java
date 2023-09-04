package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Bookings_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Admin Booking</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"SOURCES/CSS/styles.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body style=\"background-image: url('bg-image.png'); background-size: cover; background-position: center;\n");
      out.write("background-attachment: fixed;\">\n");
      out.write("\n");
      out.write("    <div>\n");
      out.write("        <header style=\"position: fixed; z-index: 1; top: 0; left: 0;\">\n");
      out.write("            <div class=\"header-content\">\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                    <img width=\"20%\" height=\"20%\" src=\"SOURCES/IMG/logo.png\" alt=\"logo\">\n");
      out.write("                </div>\n");
      out.write("                <h1 class=\"website-name\">INDI-TRAVELS</h1>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <nav>\n");
      out.write("            <div class=\"nav-content\"\n");
      out.write("                style=\"background-color: rgb(0, 247, 255); display: flex; justify-content: space-between; position: fixed; width: 100%; z-index: 1; margin-top: -90px;\">\n");
      out.write("                <ul class=\"footer-list\">\n");
      out.write("                    <li><a href=\"Catlogs.jsp\" style=\"color: black;\">CATALOG</a></li>\n");
      out.write("                    <li><a href=\"Orders.jsp\" style=\"color: black;\">ORDERS</a></li>\n");
      out.write("                    <li><a href=\"AboutUs1.jsp\" style=\"color: black;\">ABOUT US</a></li>\n");
      out.write("                    <li><a href=\"Feedback.jsp\" style=\"color: black;\">FEEDBACK</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <button class=\"sub\"\n");
      out.write("                    style=\"padding-left: 25px; padding-right: 25px; margin: 5px 25px; color: black; border: solid black 2px; background-color: yellow;\"\n");
      out.write("                    onclick=\"window.location.href='SignOut.html';\">SIGN OUT</button>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <main style=\"margin-top: 200px;\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"centered-text\">\n");
      out.write("                    <h2 style=\"color: white;\">Booking Form</h2>\n");
      out.write("                    <form class=\"login-form\" style=\"width: 450px;\">\n");
      out.write("                        <div style=\"display: flex; align-items: center;\">\n");
      out.write("                            <span style=\"color: white; margin-right: 121px;\">USERNAME:</span>\n");
      out.write("                            <input type=\"text\" placeholder=\"Username\" style=\"width: 46.7%;\">\n");
      out.write("                        </div>\n");
      out.write("                        <div style=\"display: flex; align-items: center;\">\n");
      out.write("                            <span style=\"color: white; margin-right: 109px;\">DESTINATION:</span>\n");
      out.write("                            <select name=\"destination\" id=\"destination\" style=\"width: 55%;\">\n");
      out.write("                                <option value=\"\" disabled selected>Select Hotel</option>\n");
      out.write("                                <option value=\"A\">A</option>\n");
      out.write("                                <option value=\"B\">B</option>\n");
      out.write("                              </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div style=\"display: flex; align-items: center;\">\n");
      out.write("                            <span style=\"color: white; margin-right: 109px;\">HOTELCHAIN:</span>\n");
      out.write("                            <select name=\"hotel\" id=\"hotel-select\" style=\"width: 55%;\">\n");
      out.write("                                <option value=\"\" disabled selected>Select Hotel</option>\n");
      out.write("                                <option value=\"OYO\">OYO</option>\n");
      out.write("                                <option value=\"ROYAL ORCHID\">ROYAL ORCHID</option>\n");
      out.write("                                <option value=\"Marriott \">MARRIOTT</option>\n");
      out.write("                                <option value=\"Taj\">Taj</option>\n");
      out.write("                                <option value=\"Golden Tulip\">GOLDEN TULIP</option>\n");
      out.write("                                <option value=\"ITC\">ITC</option>\n");
      out.write("                                <option value=\"LOCAL\">LOCAL</option>\n");
      out.write("                              </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div style=\"display: flex; align-items: center;\">\n");
      out.write("                            <span style=\"color: white; margin-right: 50px;\">NUMBER OF ADULTS:</span>\n");
      out.write("                            <input type=\"text\" placeholder=\"No of Adults\" style=\"width: 46.7%;\">\n");
      out.write("                        </div>\n");
      out.write("                        <div style=\"display: flex; align-items: center;\">\n");
      out.write("                            <span style=\"color: white; margin-right: 30px;\">NUMBER OF CHILDREN:</span>\n");
      out.write("                            <input type=\"text\" placeholder=\"No of Children\" style=\"width: 46.7%;\">\n");
      out.write("                        </div>\n");
      out.write("                        <div style=\"display: flex; align-items: center;\">\n");
      out.write("                            <span style=\"color: white; margin-right: 69px;\">NUMBER OF DAYS:</span>\n");
      out.write("                            <input type=\"text\" placeholder=\"No of Days\" style=\"width: 46.7%;\">\n");
      out.write("                        </div>\n");
      out.write("                        <div style=\"display: flex; align-items: center;\">\n");
      out.write("                            <span style=\"color: white; margin-right: 62px;\">CONTACT NUMBER:</span>\n");
      out.write("                            <input type=\"text\" placeholder=\"Contact No\" style=\"width: 46.7%;\">\n");
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
      out.write("                    <li><a href=\"About Us.html\">About Us</a></li>\n");
      out.write("                    <li><a href=\"contact.html\">Contact Us</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
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
