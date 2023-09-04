<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Login Form</title>
    <link rel="icon" type="image/x-icon" href="SOURCES/IMG/favicon_io/favicon.ico">
    <link rel="stylesheet" href="SOURCES/CSS/styles.css">
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
    <link rel="stylesheet" href="alert/dist/sweetalert.css">
</head>

<body>
    <input type="hidden" id="status" value="<%= request.getAttribute("status") %>">
    <header style="background-color: black;">
        <div class="header-content">
            <div class="logo">
                <img width="20%" height="20%" src="SOURCES/IMG/logo.png" alt="Background Image">
            </div>
            <h1 class="website-name">INDI-TRAVELS</h1>
        </div>
    </header>

    <main>
        <div class="container" style="height: 625px;">
            <img src="SOURCES/IMG/AdminBG.jpg" alt="Background Image">
            <div class="centered-text">
                <h2 style="color: yellow;">Admin Login Form</h2>
                <form class="login-form" style="width: 450px;" method="post" action="alogin">
                    <div style="display: flex; align-items: center;">
                        <span style="color: yellow; margin-right: 30px;">ADMINISTRATOR:</span>
                        <input type="text" name="admin" placeholder="root" oninput="validateUsername(this)" required>
                    </div>
                    <div style="display: flex; align-items: center;">
                        <span style="color: yellow; margin-right: 68px;">PASSWORD:</span>
                        <div style="position: relative; width: 90%;">
                            <input type="password" name="password" id="password" placeholder="1234" oninput="validatePassword(this)" required>
                            <span id="toggle-icon"
                                style="position: absolute; top: 40%; right: 10px; transform: translateY(-50%); cursor: pointer; font-size: 13px; font-weight: bold;"
                                onclick="togglePasswordVisibility()">Show</span>
                        </div>
                    </div>
                    <button type="submit" style="margin-top: 20px;">Login</button>
                </form>
            </div>
        </div>
    </main>

    
</body>
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
        swal("Sorry", "Authorized Personel Only","error");
    }
        
    function validateUsername(input) {
        var inputValue = input.value;
        var pattern = /^[a-zA-Z0-9@_.]+$/;

        if (!pattern.test(inputValue)) {
            input.setCustomValidity("Username can only contain letters, numbers, and '@','_'");
        } else {
            input.setCustomValidity("");
        }
    }

    function validatePassword(input) {
        var inputValue = input.value;
        var pattern = /^[a-zA-Z0-9@#$%.!_]+$/;

        if (!pattern.test(inputValue)) {
            input.setCustomValidity("Password can only contain letters, numbers, and special characters @, #, $, %, !,_, and .");
        } else {
            input.setCustomValidity("");
        }
    }

    function validateForm(event) {
        var usernameInput = document.getElementsByName("admin")[0];
        var passwordInput = document.getElementsByName("password")[0];

        validateUsername(usernameInput);
        validatePassword(passwordInput);

        if (!usernameInput.checkValidity() || !passwordInput.checkValidity()) {
            event.preventDefault();
        }
    }
    </script>
</html>