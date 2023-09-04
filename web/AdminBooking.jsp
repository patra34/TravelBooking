<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<% 
    if(session.getAttribute("name")==null){
    response.sendRedirect("AdminLogin.jsp");
    }
%>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Booking</title>
    <link rel="icon" type="image/x-icon" href="SOURCES/IMG/favicon_io/favicon.ico">
    <link rel="stylesheet" href="SOURCES/CSS/styles.css">    
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
    <link rel="stylesheet" href="alert/dist/sweetalert.css">
    <script>
        function signOut() {
            window.location.href = "AdminLogin.jsp"; 
            window.history.pushState(null, "", "AdminLogin.jsp"); 
            window.onpopstate = function(event) {
                window.history.forward();
            };
        }
    </script>
</head>

<body style="background-image: url('SOURCES/IMG/AdminBG.jpg'); background-size: cover; background-position: center;
background-attachment: fixed;">
    <input type="hidden" id="status" value="<%= request.getAttribute("status") %>">
    <div>
        <header style="background-color: black; position: fixed; z-index: 1; top: 0; left: 0;">
            <div class="header-content">
                <div class="logo">
                    <img width="20%" height="20%" src="SOURCES/IMG/logo.png" alt="Background Image">
                </div>
                <h1 class="website-name">INDI-TRAVELS</h1>
            </div>
        </header>

        <nav>
            <div class="nav-content"
                style="background-color: yellow; display: flex; justify-content: space-between; position: fixed; width: 100%; z-index: 1; margin-top: -90px;">
                <ul class="footer-list">
                    <li><a href="AdminBooking.jsp" style="color: black;">BOOKINGS</a></li>
                    <li><a href="AdminFeedback.jsp" style="color: black;">FEEDBACK</a></li>
                </ul>
                <button class="sub"
                    style="padding-left: 25px; padding-right: 25px; margin: 5px 25px; color: black; border: solid black 2px; background-color: yellow;"
                    onclick="signOut()">SIGN OUT</button>
            </div>
        </nav>

        <footer>
            <div class="footer-content"
                style="background-color: rgba(0, 0, 0, 0); flex-direction: column; margin-top: 200px; margin-left: auto; margin-right: auto; margin-bottom: 40px; width: 95%;">
                <h3 style="color: yellow; text-align: left;">FOLLOWING ARE BOOKINGS DETAILS PROVIDED BY YOUR CUSTOMERS:
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
                        
                        int count =0;
                        try
                        {
                            Class.forName("com.mysql.jdbc.Driver");
                            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tbw?useSSL=false","root","");
                            pst = con.prepareStatement("select * from package");
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
                            if( count<=1){
                                request.setAttribute("status", "failed");
                                dispatcher=request.getRequestDispatcher("Orders.jsp");
                            }
                            dispatcher.forward(request, response);
                        } catch(Exception e){
                                
                        } 
                    %>
                </table>
            </div>
        </footer>

</body>

<script>
    var status = document.getElementById("status").value;
        if(status=="failed"){
            swal("Oops!", "No Orders found :(","error")
        }
</script>
</html>