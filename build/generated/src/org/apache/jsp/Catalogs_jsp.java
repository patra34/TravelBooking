package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Catalogs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 
    if(session.getAttribute("name")==null){
        response.sendRedirect("login.jsp");
    }

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Catalog</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"SOURCES/CSS/styles.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css\">\n");
      out.write("    <script>\n");
      out.write("        function signOut() {\n");
      out.write("            window.location.href = \"signout.jsp\"; \n");
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
      out.write("    <header style=\"background-color: #001764; position: fixed; z-index: 1; top: 0; left: 0;\">\n");
      out.write("        <div class=\"header-content\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <img width=\"20%\" height=\"20%\" src=\"SOURCES/IMG/logo.png\" alt=\"Background Image\">\n");
      out.write("            </div>\n");
      out.write("            <h1 class=\"website-name\" style=\"color: white;\">INDI-TRAVELS</h1>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <nav>\n");
      out.write("        <div class=\"nav-content\"\n");
      out.write("            style=\"background-color: rgb(0, 247, 255); display: flex; justify-content: space-between; position: fixed; width: 100%; z-index: 1; margin-top: -100px;\">\n");
      out.write("            <ul class=\"footer-list\">\n");
      out.write("                <li><a href=\"Catalogs.jsp\" style=\"color: black;\">CATALOG</a></li>\n");
      out.write("                <li><a href=\"Orders.jsp\" style=\"color: black;\">ORDERS</a></li>\n");
      out.write("                <li><a href=\"AboutUs1.jsp\" style=\"color: black;\">ABOUT US</a></li>\n");
      out.write("                <li><a href=\"Feedback.jsp\" style=\"color: black;\">FEEDBACK</a></li>\n");
      out.write("            </ul>\n");
      out.write("            <button class=\"sub\"\n");
      out.write("                style=\"padding-left: 25px; padding-right: 25px; margin: 5px 25px; color: black; border: solid black 2px; background-color: yellow;\"\n");
      out.write("                onclick=\"signOut()\">SIGN OUT</button>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <footer>\n");
      out.write("        <div class=\"footer-content\"\n");
      out.write("            style=\"background-color: rgba(0, 0, 0, 0); flex-direction: column; margin-top: 200px; margin-left: auto; margin-right: auto; margin-bottom: 40px; width: 95%;\">\n");
      out.write("            <h3\n");
      out.write("                style=\"color: yellow; margin-top: 35px; font-size: 30px; -webkit-text-stroke-width: 1px; -webkit-text-stroke-color: black; text-align: center;\">\n");
      out.write("                FEEL FREE TO EXPLORE OUR CATALOG:\n");
      out.write("            </h3>\n");
      out.write("            <main>\n");
      out.write("                <section class=\"carousel-section\">\n");
      out.write("                    <h1 class=\"section-title\"\n");
      out.write("                        style=\"color: rgb(0, 247, 255); font-size: 50px; -webkit-text-stroke-width: 2px; -webkit-text-stroke-color: black;\">\n");
      out.write("                        North India</h1>\n");
      out.write("                    <div class=\"north-card\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <img src=\"SOURCES/IMG/manali.jpg\" alt=\"MANALI\" style=\"width:100%;\">\n");
      out.write("                            <div class=\"container1\">\n");
      out.write("                                <h4><b>MANALI</b></h4>\n");
      out.write("                                <a href=\"Bookings.jsp\"><button type=\"submit\">Book Now</button></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <img src=\"SOURCES/IMG/jaipur.jpg\" alt=\"JAIPUR\" style=\"width:100%;\">\n");
      out.write("                            <div class=\"container1\">\n");
      out.write("                                <h4><b>JAIPUR</b></h4>\n");
      out.write("                                <a href=\"Bookings.jsp\"><button type=\"submit\">Book Now</button></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <img src=\"SOURCES/IMG/ladakh.jpg\" alt=\"LADAKH\" style=\"width:100%;\">\n");
      out.write("                            <div class=\"container1\">\n");
      out.write("                                <h4><b>LADAKH</b></h4>\n");
      out.write("                                <a href=\"Bookings.jsp\"><button type=\"submit\">Book Now</button></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <img src=\"SOURCES/IMG/varanasi.png\" alt=\"VARANASI\" style=\"width:100%;\">\n");
      out.write("                            <div class=\"container1\">\n");
      out.write("                                <h4><b>VARANASI</b></h4>\n");
      out.write("                                <a href=\"Bookings.jsp\"><button type=\"submit\">Book Now</button></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("                \n");
      out.write("\n");
      out.write("                <section class=\"carousel-section\">\n");
      out.write("                    <h1 class=\"section-title\"\n");
      out.write("                        style=\"color: rgb(0, 247, 255); margin-top: 55px; font-size: 50px; -webkit-text-stroke-width: 2px; -webkit-text-stroke-color: black;\">\n");
      out.write("                        West India</h1>\n");
      out.write("                    <div class=\"north-card\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <img src=\"SOURCES/IMG/lonavala.jpg\" alt=\"LONAVALA\" style=\"width:100%;\">\n");
      out.write("                            <div class=\"container1\">\n");
      out.write("                                <h4><b>LONAVALA</b></h4>\n");
      out.write("                                <a href=\"Bookings.jsp\"><button type=\"submit\">Book Now</button></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <img src=\"SOURCES/IMG/statue-of-unity.jpg\" alt=\"KEVADIA\" style=\"width:100%;\">\n");
      out.write("                            <div class=\"container1\">\n");
      out.write("                                <h4><b>GUJARAT</b></h4>\n");
      out.write("                                <a href=\"Bookings.jsp\"><button type=\"submit\">Book Now</button></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <img src=\"SOURCES/IMG/dwarika.jpg\" alt=\"DWARKA\" style=\"width:100%;\">\n");
      out.write("                            <div class=\"container1\">\n");
      out.write("                                <h4><b>DWARKA</b></h4>\n");
      out.write("                                <a href=\"Bookings.jsp\"><button type=\"submit\">Book Now</button></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("\n");
      out.write("                <section class=\"carousel-section\">\n");
      out.write("                    <h1 class=\"section-title\"\n");
      out.write("                        style=\"color: rgb(0, 247, 255); margin-top: 55px; font-size: 50px; -webkit-text-stroke-width: 2px; -webkit-text-stroke-color: black;\">\n");
      out.write("                        East India</h1>\n");
      out.write("                    <div class=\"north-card\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <img src=\"SOURCES/IMG/konark.png\" alt=\"KONARK\" style=\"width:100%;\">\n");
      out.write("                            <div class=\"container1\">\n");
      out.write("                                <h4><b>KONARK</b></h4>\n");
      out.write("                                <a href=\"Bookings.jsp\"><button type=\"submit\">Book Now</button></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <img src=\"SOURCES/IMG/darjeeling.jpg\" alt=\"DARJEELING\" style=\"width:100%;\">\n");
      out.write("                            <div class=\"container1\">\n");
      out.write("                                <h4><b>DARJEELING</b></h4>\n");
      out.write("                                <a href=\"Bookings.jsp\"><button type=\"submit\">Book Now</button></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <img src=\"SOURCES/IMG/kolkata.jpg\" alt=\"KOLKATA\" style=\"width:100%;\">\n");
      out.write("                            <div class=\"container1\">\n");
      out.write("                                <h4><b>KOLKATA</b></h4>\n");
      out.write("                                <a href=\"Bookings.jsp\"><button type=\"submit\">Book Now</button></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <img src=\"SOURCES/IMG/meghalaya.jpg\" alt=\"EASTERN-7\" style=\"width:100%;\">\n");
      out.write("                            <div class=\"container1\">\n");
      out.write("                                <h4><b>EASTERN-7</b></h4>\n");
      out.write("                                <a href=\"Bookings.jsp\"><button type=\"submit\">Book Now</button></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </section>\n");
      out.write("                <section class=\"carousel-section\">\n");
      out.write("                    <h1 class=\"section-title\"\n");
      out.write("                        style=\"color: rgb(0, 247, 255); margin-top: 55px; font-size: 50px; -webkit-text-stroke-width: 2px; -webkit-text-stroke-color: black;\">\n");
      out.write("                        South India</h1>\n");
      out.write("                    <div class=\"north-card\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <img src=\"SOURCES/IMG/ooty.jpg\" alt=\"OOTY\" style=\"width:100%;\">\n");
      out.write("                            <div class=\"container1\">\n");
      out.write("                                <h4><b>OOTY</b></h4>\n");
      out.write("                                <a href=\"Bookings.jsp\"><button type=\"submit\">Book Now</button></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <img src=\"SOURCES/IMG/mysuru.jpg\" alt=\"MYSURU\" style=\"width:100%;\">\n");
      out.write("                            <div class=\"container1\">\n");
      out.write("                                <h4><b>MYSURU</b></h4>\n");
      out.write("                                <a href=\"Bookings.jsp\">\n");
      out.write("                                <button type=\"submit\">Book Now</button></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <img src=\"SOURCES/IMG/tirupati.jpg\" alt=\"TIRUPATI\" style=\"width:100%;\">\n");
      out.write("                            <div class=\"container1\">\n");
      out.write("                                <h4><b>TIRUPATI</b></h4>\n");
      out.write("                                <a href=\"Bookings.jsp\"><button type=\"submit\">Book Now</button></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("            </main>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("    <footer>\n");
      out.write("        <div class=\"footer-content\">\n");
      out.write("            <ul class=\"footer-list\">\n");
      out.write("                <li><a href=\"AboutUs1.jsp\">About Us</a></li>\n");
      out.write("                <li><a href=\"ContactUs.jsp\">Contact Us</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
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
