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

        <main style="margin-top: 200px;">
            <div class="container" style="height: 429px;">
                <div class="centered-text">
                    <h2 style="color: white;">Cancellation Form</h2>
                    <form class="login-form" style="width: 450px;" method="post" action="Cancel">
                        <div style="display: flex;">
                            <span style="color: white; margin-right: 30px; width: 280px; margin-top: 10px;">ENTER BOOKING ID:</span>
                            <input type="text" name="bid" placeholder="eg:-101" width="30%" required>
                        </div>
                        <button type="submit" style="margin-top: 20px;">Cancel Booking</button>
                    </form>
                </div>
            </div>
        </main>

        <footer>
            <div class="footer-content" style="margin-top: 40px;">
                <ul class="footer-list">
                    <li><a href="AboutUs1.jsp">About Us</a></li>
                    <li><a href="ContactUs.jsp">Contact Us</a></li>
                </ul>
            </div>
        </footer>

</body>
<script>
    var status = document.getElementById("status").value;
        if(status=="success"){
            swal("Don't Worry", "Order cancelled successfully","success")
        } else if(status=="failed") {
            swal("Oops", "Order not found","error")
        } else {
            //nothing
        }
</script>
</html>
