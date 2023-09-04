<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Form</title>
    <link rel="icon" type="image/x-icon" href="SOURCES/IMG/favicon_io/favicon.ico">
    <link rel="stylesheet" href="SOURCES/CSS/styles.css">
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
    <link rel="stylesheet" href="alert/dist/sweetalert.css">
</head>

<body>
    <input type="hidden" id="status" value="<%= request.getAttribute("status") %>">
    <header>
        <div class="header-content">
            <div class="logo">
                <img width="20%" height="20%" src="SOURCES/IMG/logo.png" alt="Background Image">
            </div>
            <h1 class="website-name">INDI-TRAVELS</h1>
        </div>
    </header>

    <main>
        <div class="container">
            <img src="SOURCES/IMG/bg-image.png" alt="Background Image">
            <div class="centered-text">
                <h2>Login Form</h2>
                <form class="login-form" method="post" action="login" onsubmit="validateForm(event)">
                    <input type="text" name="username" placeholder="username" required>
                    <div style="position: relative;">
                        <input type="password" name="password" id="password" placeholder="Password"  required>
                        <span id="toggle-icon" style="position: absolute; top: 50%; right: 10px; transform: translateY(-50%); cursor: pointer; font-size: 13px; font-weight: bold;" onclick="togglePasswordVisibility()">Show</span>
                      </div>
                    <button type="submit">Login</button>
                  </form>
                  <p>New User? <a href="Signup.jsp">Sign Up</a></p>
            </div>
        </div>
    </main>

    <footer>
        <div class="footer-content">
            <ul class="footer-list">
                <li><a href="AboutUs.html">About Us</a></li>
                <li><a href="ContactUs1.html">Contact Us</a></li>
            </ul>
        </div>
    </footer>

    <script>
        function togglePasswordVisibility() {
          const passwordInput = document.getElementById('password');
          const toggleIcon = document.getElementById('toggle-icon');
          if (passwordInput.type === 'password') {
            passwordInput.type = 'text';
            toggleIcon.innerText = 'Hide';
          } else {
            passwordInput.type = 'password';
            toggleIcon.innerText = 'Show';
          }
        }
        var status = document.getElementById("status").value;
        if(status=="failed"){
            swal("Sorry", "Invalid Username or Password","error");
        }
        
        
    </script>
</body>

</html>