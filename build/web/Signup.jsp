<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Signup Form</title>
    <link rel="stylesheet" href="SOURCES/CSS/styles.css">
    <link rel="icon" type="image/x-icon" href="SOURCES/IMG/favicon_io/favicon.ico">
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
    <link rel="stylesheet" href="alert/dist/sweetalert.css">
</head>

<body>
    <input type="hidden" id="status" value="<%= request.getAttribute("status") %>">
    <header>
        <div class="header-content">
            <div class="logo">
                <img width="20%" height="20%"
                    src="SOURCES/IMG/logo.png"
                    alt="logo">
            </div>
            <h1 class="website-name">INDI-TRAVELS</h1>
        </div>
    </header>

    <main>
        <div class="container">
            <img src="SOURCES/IMG/bg-image.png" alt="Background Image">
            <div class="centered-text">
                <h2>Signup Form</h2>
                <form class="login-form" method="post" action="register" onsubmit="validateForm(event)">
                    <input type="text" name="username" placeholder="Username" required>
                    <input type="text" name="phone" placeholder="Phone No" oninput="validateContact(this)" required>
                    <input type="text" name="email" placeholder="Email Id" oninput="validateEmail(this)" required>
                    <div style="position: relative;">
                        <input type="password" name="password" id="password" placeholder="Password" oninput="validatePass(this)" required>
                        <span id="toggle-icon"
                            style="position: absolute; top: 50%; right: 10px; transform: translateY(-50%); cursor: pointer; font-size: 13px; font-weight: bold;"
                            onclick="togglePasswordVisibility()">Show</span>
                    </div>
                    <div style="position: relative;">
                        <input type="password" name="cpassword" id="cpassword" placeholder="Confirm password" oninput="validatePassword(this)" required>
                        <span id="toggle-icon1"
                            style="position: absolute; top: 50%; right: 10px; transform: translateY(-50%); cursor: pointer; font-size: 13px; font-weight: bold;"
                            onclick="togglePasswordVisibility1()">Show</span>
                    </div>
                    <button type="submit" >Signup</button>
                </form>
                <p>Already a User? <a href="login.jsp">Login</a></p>
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

    <script type="text/javascript">
        function togglePasswordVisibility() {
            passwordInput = document.getElementById('password');
            toggleIcon = document.getElementById('toggle-icon');
            if (passwordInput.type === 'password') {
                passwordInput.type = 'text';
                toggleIcon.innerText = 'Hide';
            } else {
                passwordInput.type = 'password';
                toggleIcon.innerText = 'Show';
            }
        }
        function togglePasswordVisibility1() {
             passwordInput1 = document.getElementById('cpassword');
             toggleIcon1 = document.getElementById('toggle-icon1');
            if (passwordInput1.type === 'password') {
                passwordInput1.type = 'text';
                toggleIcon1.innerText = 'Hide';
            } else {
                passwordInput1.type = 'password';
                toggleIcon1.innerText = 'Show';
            }
        }
        
        function validateContact(input) {
            var contactNumber = input.value;
            var pattern = /^[0-9]{10}$/; 

            if (!pattern.test(contactNumber)) {
                input.setCustomValidity("Contact number must contain 10 digits.");
            } else {
                input.setCustomValidity("");
            }
        }
        
        function validatePass(input) {
            var password = document.getElementById("password").value;
            var confirmPasswordInput = document.getElementById("cpassword");

            if (confirmPasswordInput.value !== password) {
                confirmPasswordInput.setCustomValidity("Passwords do not match.");
            } else {
                confirmPasswordInput.setCustomValidity("");
            }
        }
        
        function validatePassword(input) {
            var password = document.getElementById("password").value;
            var confirmPasswordInput = document.getElementById("cpassword");

            if (password !== confirmPasswordInput.value) {
                confirmPasswordInput.setCustomValidity("Passwords do not match.");
            } else {
                confirmPasswordInput.setCustomValidity("");
            }
        }
        
        function validateEmail(input) {
            var email = input.value;
            var atIndex = email.indexOf("@");
            var dotIndex = email.lastIndexOf(".");
        
            if (atIndex === -1 || atIndex !== email.lastIndexOf("@") || dotIndex !== email.length - 3 && dotIndex !== email.length - 4) {
                input.setCustomValidity("Invalid email format.");
            } else {
                input.setCustomValidity("");
            }
        }
        
        function validateForm(event) {
            var passwordInput = document.getElementById("password");
            var confirmPasswordInput = document.getElementById("cPassword");
            var contactInput = document.getElementById("contact");
            var emailInput = document.getElementsByName("email")[0];

            if (!passwordInput.checkValidity() || !confirmPasswordInput.checkValidity() || !contactInput.checkValidity() || !emailInput.checkValidity()) {
                event.preventDefault(); 
            }
        }
        
        var status = document.getElementById("status").value;
        if(status=="success"){
            swal("Congrats", "Account Created Successfully","success")
        } 
        if(status=="failed"){
            swal("Oops!", "Something went wrong","error")
        }
    </script>
</body>

</html>