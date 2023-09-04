<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<% 
    if(session.getAttribute("name")==null){
        response.sendRedirect("login.jsp");
    }
%>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Orders</title>
    <link rel="icon" type="image/x-icon" href="SOURCES/IMG/favicon_io/favicon.ico">
    <link rel="stylesheet" href="SOURCES/CSS/styles.css">
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
    <link rel="stylesheet" href="alert/dist/sweetalert.css">
    <script>
        function signOut() {
            window.location.href = "SignOut.jsp"; 
            window.history.pushState(null, "", "SignOut.jsp"); 
            window.onpopstate = function(event) {
                window.history.forward();
            };
        }
    </script>
</head>

<body style="background-image: url('SOURCES/IMG/bg-image.png'); background-size: cover; background-position: center;
background-attachment: fixed;">
    <input type="hidden" id="status" value="<%= request.getAttribute("status") %>">
    <div>
        <header style="position: fixed; z-index: 1; top: 0; left: 0;">
            <div class="header-content">
                <div class="logo">
                    <img width="20%" height="20%" src="SOURCES/IMG/logo.png" alt="Background Image">
                </div>
                <h1 class="website-name">INDI-TRAVELS</h1>
            </div>
        </header>

        <nav>
            <div class="nav-content"
                style="background-color: rgb(0, 247, 255); display: flex; justify-content: space-between; position: fixed; width: 100%; z-index: 1; margin-top: -100px;">
                <ul class="footer-list">
                    <li><a href="Catalogs.jsp" style="color: black;">CATALOG</a></li>
                    <li><a href="Orders.jsp" style="color: black;">ORDERS</a></li>
                    <li><a href="AboutUs1.jsp" style="color: black;">ABOUT US</a></li>
                    <li><a href="Feedback.jsp" style="color: black;">FEEDBACK</a></li>
                </ul>
                <button class="sub"
                    style="padding-left: 25px; padding-right: 25px; margin: 5px 25px; color: black; border: solid black 2px; background-color: yellow;"
                    onclick="signOut()">SIGN OUT</button>
            </div>
        </nav>

        <form class="login-form" method="post" action="#" style="width: 190px; margin-top: 200px; margin-left: auto; margin-right: auto; color: yellow; font-size: 25px;">
        YOUR ORDERS
        </form> 
        </div>
            
            
        </form>

        <footer>
            <div class="footer-content"
                style="background-color: rgba(32, 32, 32, 0.459); flex-direction: column; margin-top: 50px; margin-left: auto; margin-right: auto; margin-bottom: 40px; width: 95%;">
                <h3 style="color: yellow; text-align: left;">
                </h3>
                
                <table class="booking"
                    style="color: yellow; border-collapse: collapse; border: solid yellow 2px; background-color: rgba(128, 128, 128, 0.557); text-align: center;">
                    <tr>
                        <th class="bid" style="width: 1%;">BID</th>
                        <th class="uname" style="width: 4%;">USERNAME</th>
                        <th class="des" style="width: 5%;">DESTINATION</th>
                        <th class="hc" style="width: 5%;">HOTELCHAIN</th>
                        <th class="A" style="width: 2%;">NO. OF ADULTS</th>
                        <th class="C" style="width: 1%;">NO. OF CHILDREN</th>
                        <th class="D" style="width: 2%;">NO. OF DAYS</th>
                        <th class="Ph" style="width: 5%;">PHONE</th>
                    </tr>
                    <%
                        Connection con = null;
                        PreparedStatement pst=null;
                        ResultSet rs = null;
                        RequestDispatcher dispatcher = null;
                        
                        String uname=(String)session.getAttribute("name");
                        int count =0;
                        try
                        {
                            Class.forName("com.mysql.jdbc.Driver");
                            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tbw","root","");
                            pst = con.prepareStatement("select * from package where username = ?");
                            pst.setString(1, uname);
                            rs=pst.executeQuery();
                            while(rs.next())
                            { count++;
                    %> 
                    <tr>
                        <td class="bid"><%= rs.getInt(1)%></td>
                        <td class="uname"><%= rs.getString(2)%></td>
                        <td class="des"><%= rs.getString(3)%></td>
                        <td class="hc"><%= rs.getString(4)%></td>
                        <td class="A"><%= rs.getInt(5)%></td>
                        <td class="C"><%= rs.getInt(6)%></td>
                        <td class="D"><%= rs.getInt(7)%></td>
                        <td class="Ph"><%= rs.getString(8)%></td>
                    </tr>
                    <%
                            }  
                            if( count<1){
                                request.setAttribute("status", "failed");
                                dispatcher=request.getRequestDispatcher("Orders.jsp");
                            }
                            dispatcher.forward(request, response);
                        } catch(Exception e){
                                
                        } 
                    %>
                </table>
                <p class="notice">*Our agent will contact you shortly regarding your orders.</p>
            </div>
        </footer>


        <button class="cancel" type="submit" style="margin-top: 10px;" onclick="window.location.href='CancelOrder.jsp';">Cancel</button>

        <footer>
            <div class="footer-content" style="margin-top: 48.5px;">
                <ul class="footer-list">
                    <li><a href="AboutUs1.jsp">About Us</a></li>
                    <li><a href="ContactUs.jsp">Contact Us</a></li>
                </ul>
            </div>
        </footer>

</body>
<script>
    var status = document.getElementById("status").value;
        if(status=="failed"){
            swal("Oops!", "No Orders found","error")
        }
</script>
</html>
