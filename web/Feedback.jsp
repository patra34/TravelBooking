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
    <title>Feedback</title>
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

<body style="background-image: url('SOURCES/IMG/catalog.jpg'); background-size: cover; background-position: center;
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
        <% String uname=(String)session.getAttribute("name");%>
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
            <div class="container">
                <div class="centered-text">
                    <h2 style="color: white;">Feedback Form</h2>
                    <form class="login-form" style="width: 450px;" method="post" action="feedback" onsubmit="validateForm(event)">
                        <div style="display: flex; align-items: center;">
                            <span style="color: white; margin-right: 30px;">USERNAME:</span>
                            <input type="text" name="username" placeholder="Username" value="<%= uname %>"  readonly>
                        </div>
                        <div style="display: flex; align-items: start; margin-top: 10px;">
                            <span style="color: white; margin-right: 34px;">FEEDBACK:</span>
                            <textarea name="feedback" id="feedback" placeholder="Feedback (max 200 characters)"
                                maxlength="200" oninput="validateFeedback(this)" required></textarea>
                        </div>
                        <button type="submit" style="margin-top: 20px;">Submit</button>
                    </form>
                </div>
            </div>
        </main>

        <footer>
            <div class="footer-content" style="margin-top: 30px;">
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
            swal("Alert", "Fill the form properly","error");
        }
        if(status=="success"){
            swal("Done", "Feedback Submitted","success");
        }
        
    function validateFeedback(input) {
        var inputValue = input.value;
        var pattern = /^[a-zA-Z0-9.,!]+$/;

        if (!pattern.test(inputValue)) {
            input.setCustomValidity("Please enter a valid input containing only letters, numbers, '.', ',', and '!'.");
        } else {
            input.setCustomValidity("");
        }
    }
        
     function validateForm(event) {
        var feedbackInput = document.getElementById("feedback");
        validateFeedback(feedbackInput);
        if (!feedbackInput.checkValidity()) {
            event.preventDefault();
        }
    }
</script>
</html>