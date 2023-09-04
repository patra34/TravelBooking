package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class AdminBooking_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
 
    if(session.getAttribute("name")==null){
    response.sendRedirect("AdminLogin.jsp");
    }

      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Admin Booking</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"SOURCES/CSS/styles.css\">    \n");
      out.write("    <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"alert/dist/sweetalert.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body style=\"background-image: url('SOURCES/IMG/AdminBG.jpg'); background-size: cover; background-position: center;\n");
      out.write("background-attachment: fixed;\">\n");
      out.write("    <input type=\"hidden\" id=\"status\" value=\"");
      out.print( request.getAttribute("status") );
      out.write("\">\n");
      out.write("    <div>\n");
      out.write("        <header style=\"background-color: black; position: fixed; z-index: 1; top: 0; left: 0;\">\n");
      out.write("            <div class=\"header-content\">\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                    <img width=\"20%\" height=\"20%\" src=\"SOURCES/IMG/logo.png\" alt=\"Background Image\">\n");
      out.write("                </div>\n");
      out.write("                <h1 class=\"website-name\">INDI-TRAVELS</h1>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <nav>\n");
      out.write("            <div class=\"nav-content\"\n");
      out.write("                style=\"background-color: yellow; display: flex; justify-content: space-between; position: fixed; width: 100%; z-index: 1; margin-top: -90px;\">\n");
      out.write("                <ul class=\"footer-list\">\n");
      out.write("                    <li><a href=\"AdminBooking.jsp\" style=\"color: black;\">BOOKINGS</a></li>\n");
      out.write("                    <li><a href=\"AdminFeedback.jsp\" style=\"color: black;\">FEEDBACK</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <button class=\"sub\"\n");
      out.write("                    style=\"padding-left: 25px; padding-right: 25px; margin: 5px 25px; color: black; border: solid black 2px; background-color: yellow;\"\n");
      out.write("                    onclick=\"window.location.href='AdminLogin.jsp';\">SIGN OUT</button>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"footer-content\"\n");
      out.write("                style=\"background-color: rgba(0, 0, 0, 0); flex-direction: column; margin-top: 200px; margin-left: auto; margin-right: auto; margin-bottom: 40px; width: 95%;\">\n");
      out.write("                <h3 style=\"color: yellow; text-align: left;\">FOLLOWING ARE BOOKINGS DETAILS PROVIDED BY YOUR CUSTOMERS:\n");
      out.write("                </h3>\n");
      out.write("                <table class=\"booking\"\n");
      out.write("                    style=\"color: yellow; border-collapse: collapse; border: solid yellow 2px; background-color: rgba(128, 128, 128, 0.557); text-align: center;\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th class=\"bid\" style=\"width: 1%;\">BID</th>\n");
      out.write("                        <th class=\"uname\" style=\"width: 4%;\">USERNAME</th>\n");
      out.write("                        <th class=\"des\" style=\"width: 5%;\">DESTINATION</th>\n");
      out.write("                        <th class=\"hc\" style=\"width: 5%;\">HOTELCHAIN</th>\n");
      out.write("                        <th class=\"A\" style=\"width: 2%;\">NO. OF ADULTS</th>\n");
      out.write("                        <th class=\"C\" style=\"width: 1%;\">NO. OF CHILDREN</th>\n");
      out.write("                        <th class=\"D\" style=\"width: 2%;\">NO. OF DAYS</th>\n");
      out.write("                        <th class=\"Ph\" style=\"width: 5%;\">PHONE</th>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        Connection con = null;
                        PreparedStatement pst=null;
                        ResultSet rs = null;
                        RequestDispatcher dispatcher = null;
                        
                        int count =0;
                        try
                        {
                            Class.forName("com.mysql.jdbc.Driver");
                            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tbw","root","");
                            pst = con.prepareStatement("select * from package");
                            rs=pst.executeQuery();
                            while(rs.next())
                            { count++;
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"bid\">");
      out.print( rs.getInt(1));
      out.write("</td>\n");
      out.write("                        <td class=\"uname\">");
      out.print( rs.getString(2));
      out.write("</td>\n");
      out.write("                        <td class=\"des\">");
      out.print( rs.getString(3));
      out.write("</td>\n");
      out.write("                        <td class=\"hc\">");
      out.print( rs.getString(4));
      out.write("</td>\n");
      out.write("                        <td class=\"A\">");
      out.print( rs.getInt(5));
      out.write("</td>\n");
      out.write("                        <td class=\"C\">");
      out.print( rs.getInt(6));
      out.write("</td>\n");
      out.write("                        <td class=\"D\">");
      out.print( rs.getInt(7));
      out.write("</td>\n");
      out.write("                        <td class=\"Ph\">");
      out.print( rs.getString(8));
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                            }  
                            if( count<=1){
                                request.setAttribute("status", "failed");
                                dispatcher=request.getRequestDispatcher("Orders.jsp");
                            }
                            dispatcher.forward(request, response);
                        } catch(Exception e){
                                
                        } 
                    
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    var status = document.getElementById(\"status\").value;\n");
      out.write("        if(status==\"failed\"){\n");
      out.write("            swal(\"Oops!\", \"No Orders found\",\"error\")\n");
      out.write("        }\n");
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
