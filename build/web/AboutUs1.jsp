<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<% 
    if(session.getAttribute("name")==null){
        response.sendRedirect("login.jsp");
    }
%>
<head>
    <title>About Us</title>
    <meta charset="UTF-8">
    <link rel="icon" type="image/x-icon" href="SOURCES/IMG/favicon_io/favicon.ico">
    <link rel="stylesheet" href="SOURCES/CSS/aboutus.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
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
    <div class="header">
        <div class="logo">
            <img src="SOURCES/IMG/logo.png" alt="Logo">
        </div>
        <div class="company-name">INDI-TRAVELS</div>
    </div>

    <nav>
        <div class="nav-content"
            style="background-color: rgb(0, 247, 255); display: flex; margin-left: -9px; justify-content: space-between; width: 100.85%; z-index: 1; margin-top: 100px;">
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

    <div class="image">
        <img class="img" src="SOURCES/IMG/logo.png" alt="Logo">
    </div>
    <div class="container">
        <div class="CNAME">
            <h1>INDI-TRAVELS</h1><br>
        </div>
        <div class="about">
            <br>
            <p>&emsp;&emsp;Welcome to our site, your gateway to boundless explorations and unforgettable adventures.
                Established with a fervent passion for wanderlust, We stands as a beacon for globetrotters seeking
                authentic and transformative travel experiences. We understand that traveling is not just about visiting
                new places. it's about forging connections, embracing diverse cultures, and collecting stories that
                become woven into the tapestry of your life.</p>
            <p>&emsp;&emsp;Here, we believe that every journey is a story waiting to be told. Our mission is to empower
                you to create your own narratives by curating journeys that transcend the ordinary. With a team of avid
                travelers and seasoned experts, we meticulously handpick destinations and design itineraries that cater
                to all types of adventurers. Whether you're a thrill-seeker yearning for adrenaline-pumping escapades, a
                culture enthusiast eager to immerse yourself in the local way of life, or a leisure traveler seeking
                relaxation in picturesque settings, Our company has something special for you.</p>
            <p>&emsp;&emsp;Our commitment goes beyond just planning trips. it's about fostering a sense of wonder and
                fostering connections. We collaborate with local communities to ensure that your travels leave a
                positive footprint, supporting sustainable tourism and ethical practices. As you explore the world
                through INDI-TRAVELS, be prepared to be inspired, enlightened, and transformed. Join us in traversing
                states, delving into the heart of destinations, and embracing the unknown. Your story is out there - let
                us be your trusted companion in scripting the chapters of your extraordinary journey.</p>
            <br>
        </div>
    </div>

    <div class="footer">
        <a href="AboutUs1.jsp">About Us</a>
        <a href="ContactUs.jsp">Contact Us</a>
    </div>
</body>

</html>
