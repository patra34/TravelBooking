<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% session.invalidate(); %>
<!DOCTYPE html>
<html lang="en">
<head>
    
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign Out</title>
    <link rel="icon" type="image/x-icon" href="SOURCES/IMG/favicon_io/favicon.ico">
    <link rel="stylesheet" href="SOURCES/CSS/styles.css">
    <script>
        function preventBack() {
            window.history.forward();
        }

        setTimeout("preventBack()", 0);
        window.onunload = function() {
            null;
        };
</script>
</head>

<body>
    <header style="background-color: rgb(255, 106, 0);">
        <div class="header-content">
            <div class="logo">
                <img width="20%" height="20%" src="SOURCES/IMG/logo.png" alt="Background Image">
            </div>
            <h1 class="website-name">INDI-TRAVELS</h1>
        </div>
    </header>

    <main>
        <div class="container">
            <img src="SOURCES/IMG/SignOut.jpg" alt="Background Image">
            <div class="centered-text">
                <h2>THANKS FOR VISITING!</h2>
                <button onclick="window.location.href = 'login.jsp';">GO TO HOME</button></a
            </div>
        </div>
    </main>

    <footer>
        <div class="footer-content" style="background-color: rgb(255, 68, 0);">
            <ul class="footer-list">
                <li><a href="AboutUs.html">About Us</a></li>
                <li><a href="ContactUs1.html">Contact Us</a></li>
            </ul>
        </div>
    </footer>
</body>

</html>
