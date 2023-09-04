package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AboutUs1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <title>About Us</title>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"SOURCES/CSS/aboutus.css\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"header\">\n");
      out.write("        <div class=\"logo\">\n");
      out.write("            <img src=\"SOURCES/IMG/logo.png\" alt=\"Logo\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"company-name\">INDI-TRAVELS</div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <nav>\n");
      out.write("        <div class=\"nav-content\"\n");
      out.write("            style=\"background-color: rgb(0, 247, 255); display: flex; margin-left: -9px; justify-content: space-between; width: 100.85%; z-index: 1; margin-top: 100px;\">\n");
      out.write("            <ul class=\"footer-list\">\n");
      out.write("                <li><a href=\"Catalogs.jsp\" style=\"color: black;\">CATALOG</a></li>\n");
      out.write("                <li><a href=\"Orders.jsp\" style=\"color: black;\">ORDERS</a></li>\n");
      out.write("                <li><a href=\"AboutUs1.jsp\" style=\"color: black;\">ABOUT US</a></li>\n");
      out.write("                <li><a href=\"Feedback.jsp\" style=\"color: black;\">FEEDBACK</a></li>\n");
      out.write("            </ul>\n");
      out.write("            <button class=\"sub\"\n");
      out.write("                style=\"padding-left: 25px; padding-right: 25px; margin: 5px 25px; color: black; border: solid black 2px; background-color: yellow;\"\n");
      out.write("                onclick=\"window.location.href='SignOut.html';\">SIGN OUT</button>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div class=\"image\">\n");
      out.write("        <img class=\"img\" src=\"SOURCES/IMG/logo.png\" alt=\"Logo\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"CNAME\">\n");
      out.write("            <h1>INDI-TRAVELS</h1><br>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"about\">\n");
      out.write("            <br>\n");
      out.write("            <p>&emsp;&emsp;Welcome to our site, your gateway to boundless explorations and unforgettable adventures.\n");
      out.write("                Established with a fervent passion for wanderlust, We stands as a beacon for globetrotters seeking\n");
      out.write("                authentic and transformative travel experiences. We understand that traveling is not just about visiting\n");
      out.write("                new places. it's about forging connections, embracing diverse cultures, and collecting stories that\n");
      out.write("                become woven into the tapestry of your life.</p>\n");
      out.write("            <p>&emsp;&emsp;Here, we believe that every journey is a story waiting to be told. Our mission is to empower\n");
      out.write("                you to create your own narratives by curating journeys that transcend the ordinary. With a team of avid\n");
      out.write("                travelers and seasoned experts, we meticulously handpick destinations and design itineraries that cater\n");
      out.write("                to all types of adventurers. Whether you're a thrill-seeker yearning for adrenaline-pumping escapades, a\n");
      out.write("                culture enthusiast eager to immerse yourself in the local way of life, or a leisure traveler seeking\n");
      out.write("                relaxation in picturesque settings, Our company has something special for you.</p>\n");
      out.write("            <p>&emsp;&emsp;Our commitment goes beyond just planning trips. it's about fostering a sense of wonder and\n");
      out.write("                fostering connections. We collaborate with local communities to ensure that your travels leave a\n");
      out.write("                positive footprint, supporting sustainable tourism and ethical practices. As you explore the world\n");
      out.write("                through INDI-TRAVELS, be prepared to be inspired, enlightened, and transformed. Join us in traversing\n");
      out.write("                states, delving into the heart of destinations, and embracing the unknown. Your story is out there - let\n");
      out.write("                us be your trusted companion in scripting the chapters of your extraordinary journey.</p>\n");
      out.write("            <br>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"footer\">\n");
      out.write("        <a href=\"AboutUs1.jsp\">About Us</a>\n");
      out.write("        <a href=\"ContactUs.jsp\">Contact Us</a>\n");
      out.write("    </div>\n");
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
