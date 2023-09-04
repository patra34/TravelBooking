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
    <title>Contact Us</title>
    <link rel="icon" type="image/x-icon" href="SOURCES/IMG/favicon_io/favicon.ico">
    <link rel="stylesheet" href="SOURCES/CSS/styles.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
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

<body>
    <header style="background-color: rgb(202, 22, 22);">
        <div class="header-content">
            <div class="logo">
                <img width="20%" height="20%"
                    src="SOURCES/IMG/logo.png"
                    alt="Background Image">
            </div>
            <h1 class="website-name">INDI-TRAVELS</h1>
        </div>
    </header>

    <nav>
        <div class="nav-content" style="background-color: red; display: flex; justify-content: space-between;">
            <ul class="footer-list">
                <li><a href="Catalogs.jsp">CATALOG</a></li>
                <li><a href="Orders.jsp">MY ORDERS</a></li>
                <li><a href="AboutUs1.jsp">ABOUT US</a></li>
                <li><a href="Feedback.jsp">FEEDBACK</a></li>
            </ul>
            <button class="sub" style="padding-left: 25px; padding-right: 25px; margin: 5px 25px;" onclick="signOut()">SIGN OUT</button>
        </div>
    </nav>

    <main>
        <div class="contact-container">
            <img src="SOURCES/IMG/contact.jpg" alt="Background Image">
            <div class="contact-centered-text">
                <p style="font-size: x-large;"><b>HOW CAN WE HELP YOU?</b><br>Email us with any questions and enquiry
                </p>
                <hr class="bar">
                <div class="box">
                    <div class="icon">
                        <i class="fa fa-map-marker"></i>
                    </div>
                    <div class="text" style="margin-left: 54px;">
                        <p>Address:<br> A-1,High Offices, Akash Nagar, GC Road, Mumbai</p>
                    </div>
                </div>
                <div class="box">
                    <div class="icon">
                        <i class="fa fa-phone"></i>
                    </div>
                    <div class="text" style="margin-left: 44px;">
                        <p>Phone:<br> 91-9876501234, 91-7894560123</p>
                    </div>
                </div>
                <div class="box">
                    <div class="icon">
                        <i class="fa fa-envelope"></i>
                    </div>
                    <div class="text" style="margin-left: 35px;">
                        <p>Email: <br>inditravels@tours.in</p>
                    </div>
                </div>
            </div>
        </div>
    </main>

    <footer>
        <div class="footer-content" style="background-color: rgb(202, 22, 22);">
            <ul class="footer-list">
                <li><a href="AboutUs1.jsp">About Us</a></li>
                <li><a href="ContactUs.jsp">Contact Us</a></li>
            </ul>
        </div>
    </footer>
</body>

</html>