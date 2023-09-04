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
    <title>Booking</title>
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
                    <img width="20%" height="20%" src="SOURCES/IMG/logo.png" alt="logo">
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
        
        <% String uname=(String)session.getAttribute("name");%>
        
        <main style="margin-top: 200px;">
            <div class="container">
                <div class="centered-text">
                    <h2 style="color: white;">Booking Form</h2>
                    <form class="login-form" method="post" action="Booking" style="width: 450px;" onsubmit="validateForm(event)">
                        <div style="display: flex; align-items: center;">
                            <span style="color: white; margin-right: 121px;">USERNAME:</span>
                            <input type="text" name="username" placeholder="Username" style="width: 46.7%;" value="<%= uname %>"  readonly>
                        </div>
                        <div style="display: flex; align-items: center;">
                            <span style="color: white; margin-right: 105px;">DESTINATION:</span>
                            <select name="destination" id="destination" style="width: 55%;" required>
                                <option value="" disabled selected>Select Destination</option>
                                <option value="MANALI">MANALI</option>
                                <option value="JAIPUR">JAIPUR</option>
                                <option value="LADAKH">LADAKH</option>
                                <option value="VARANASI">VARANASI</option>
                                <option value="LONAVALA">LONAVALA</option>
                                <option value="GUJARAT">GUJARAT</option>
                                <option value="DWARKA">DWARKA</option>
                                <option value="KONARK">KONARK</option>
                                <option value="DARJEELING">DARJEELING</option>
                                <option value="KOLKATA">KOLKATA</option>
                                <option value="EASTERN-7">EASTERN-7</option>
                                <option value="OOTY">OOTY</option>
                                <option value="MYSURU">MYSURU</option>
                                <option value="TIRUPATI">TIRUPATI</option>
                              </select>
                        </div>
                        <div style="display: flex; align-items: center;">
                            <span style="color: white; margin-right: 109px;">HOTELCHAIN:</span>
                            <select name="hotel" id="hotel-select" style="width: 55%;" required>
                                <option value="" disabled selected>Select Hotel</option>
                                <option value="OYO">OYO</option>
                                <option value="ROYAL ORCHID">ROYAL ORCHID</option>
                                <option value="Marriott ">MARRIOTT</option>
                                <option value="Taj">TAJ</option>
                                <option value="Golden Tulip">GOLDEN TULIP</option>
                                <option value="ITC">ITC</option>
                                <option value="LOCAL">LOCAL</option>
                              </select>
                        </div>
                        <div style="display: flex; align-items: center;">
                            <span style="color: white; margin-right: 50px; margin-left: -0.4px;">NUMBER OF ADULTS:</span>
                            <input type="text" name="adults" placeholder="No of Adults (Max. 20)" style="width: 46.7%;" oninput="validateNumberInput(this)" required>
                        </div>
                        <div style="display: flex; align-items: center;">
                            <span style="color: white; margin-right: 30px; margin-left: -0.8px;">NUMBER OF CHILDREN:</span>
                            <input type="text" name="children" placeholder="No of Children (Max. 20)" style="width: 46.7%;"  oninput="validateNumberInput(this)" required>
                        </div>
                        <div style="display: flex; align-items: center;">
                            <span style="color: white; margin-right: 69px; margin-left: -0.4px;">NUMBER OF DAYS:</span>
                            <input type="text" name="days" placeholder="No of Days (Max. 20)" style="width: 46.7%;" oninput="validateNumberInput(this)" required>
                        </div>
                        <div style="display: flex; align-items: center;">
                            <span style="color: white; margin-right: 62px; margin-left: -0.4px;">CONTACT NUMBER:</span>
                            <input type="text" name="phone" placeholder="Contact No" style="width: 46.7%;" oninput="validateContact(this)" required>
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
    if(status=="success"){
        swal("Booking Successful", "Our agent will contact you shortly.","success")
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
    
    function validateNumberInput(input) {
        var inputValue = input.value;
        var pattern = /^[0-9]{1,2}$/; 

        if (!pattern.test(inputValue) || inputValue < 0 || inputValue > 20) {
            input.setCustomValidity("Please enter a valid number between 0 and 20.");
        } else {
            input.setCustomValidity("");
        }
    }
    
    function validateForm(event) {
        var contactInput = document.getElementById("contact");
        var daysInput = document.getElementsByName("days")[0];
        var adultsInput = document.getElementsByName("adults")[0];
        var childrenInput = document.getElementsByName("children")[0];
        
        validateNumberInput(daysInput);
        validateNumberInput(adultsInput);
        validateNumberInput(childrenInput);
        
        if (!contactInput.checkValidity() || !daysInput.checkValidity() || !adultsInput.checkValidity() || !childrenInput.checkValidity()) {
            event.preventDefault(); 
        }
    }
          
</script>
</html>
