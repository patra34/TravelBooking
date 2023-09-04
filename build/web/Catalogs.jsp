<%@page contentType="text/html" pageEncoding="UTF-8"%>


<% 
    if(session.getAttribute("name")==null){
        response.sendRedirect("login.jsp");
    }
%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Catalog</title>
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

<body style="background-image: url('SOURCES/IMG/catalog.jpg'); background-size: cover; background-position: center;
background-attachment: fixed;">
    <header style="background-color: #001764; position: fixed; z-index: 1; top: 0; left: 0;">
        <div class="header-content">
            <div class="logo">
                <img width="20%" height="20%" src="SOURCES/IMG/logo.png" alt="Background Image">
            </div>
            <h1 class="website-name" style="color: white;">INDI-TRAVELS</h1>
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

    <footer>
        <div class="footer-content"
            style="background-color: rgba(0, 0, 0, 0); flex-direction: column; margin-top: 200px; margin-left: auto; margin-right: auto; margin-bottom: 40px; width: 95%;">
            <h3 style="color: yellow; margin-top: 35px; font-size: 30px; -webkit-text-stroke-width: 1px; -webkit-text-stroke-color: black; text-align: center;">
                FEEL FREE TO EXPLORE OUR CATALOG:
            </h3>
            <main>
                <section class="carousel-section">
                    <h1 class="section-title"
                        style="color: rgb(0, 247, 255); font-size: 50px; -webkit-text-stroke-width: 2px; -webkit-text-stroke-color: black;">
                        North India</h1>
                    <div class="north-card">
                        <div class="card">
                            <img src="SOURCES/IMG/manali.jpg" alt="MANALI" style="width:100%;">
                            <div class="container1">
                                <h4><b>MANALI</b></h4>
                                <a href="Bookings.jsp"><button type="submit">Book Now</button></a>
                            </div>
                        </div>
                        <div class="card">
                            <img src="SOURCES/IMG/jaipur.jpg" alt="JAIPUR" style="width:100%;">
                            <div class="container1">
                                <h4><b>JAIPUR</b></h4>
                                <a href="Bookings.jsp"><button type="submit">Book Now</button></a>
                            </div>
                        </div>
                        <div class="card">
                            <img src="SOURCES/IMG/ladakh.jpg" alt="LADAKH" style="width:100%;">
                            <div class="container1">
                                <h4><b>LADAKH</b></h4>
                                <a href="Bookings.jsp"><button type="submit">Book Now</button></a>
                            </div>
                        </div>
                        <div class="card">
                            <img src="SOURCES/IMG/varanasi.png" alt="VARANASI" style="width:100%;">
                            <div class="container1">
                                <h4><b>VARANASI</b></h4>
                                <a href="Bookings.jsp"><button type="submit">Book Now</button></a>
                            </div>
                        </div>
                    </div>

                </section>


                

                <section class="carousel-section">
                    <h1 class="section-title"
                        style="color: rgb(0, 247, 255); margin-top: 55px; font-size: 50px; -webkit-text-stroke-width: 2px; -webkit-text-stroke-color: black;">
                        West India</h1>
                    <div class="north-card">
                        <div class="card">
                            <img src="SOURCES/IMG/lonavala.jpg" alt="LONAVALA" style="width:100%;">
                            <div class="container1">
                                <h4><b>LONAVALA</b></h4>
                                <a href="Bookings.jsp"><button type="submit">Book Now</button></a>
                            </div>
                        </div>
                        <div class="card">
                            <img src="SOURCES/IMG/statue-of-unity.jpg" alt="KEVADIA" style="width:100%;">
                            <div class="container1">
                                <h4><b>GUJARAT</b></h4>
                                <a href="Bookings.jsp"><button type="submit">Book Now</button></a>
                            </div>
                        </div>
                        <div class="card">
                            <img src="SOURCES/IMG/dwarika.jpg" alt="DWARKA" style="width:100%;">
                            <div class="container1">
                                <h4><b>DWARKA</b></h4>
                                <a href="Bookings.jsp"><button type="submit">Book Now</button></a>
                            </div>
                        </div>
                    </div>
                </section>

                <section class="carousel-section">
                    <h1 class="section-title"
                        style="color: rgb(0, 247, 255); margin-top: 55px; font-size: 50px; -webkit-text-stroke-width: 2px; -webkit-text-stroke-color: black;">
                        East India</h1>
                    <div class="north-card">
                        <div class="card">
                            <img src="SOURCES/IMG/konark.png" alt="KONARK" style="width:100%;">
                            <div class="container1">
                                <h4><b>KONARK</b></h4>
                                <a href="Bookings.jsp"><button type="submit">Book Now</button></a>
                            </div>
                        </div>
                        <div class="card">
                            <img src="SOURCES/IMG/darjeeling.jpg" alt="DARJEELING" style="width:100%;">
                            <div class="container1">
                                <h4><b>DARJEELING</b></h4>
                                <a href="Bookings.jsp"><button type="submit">Book Now</button></a>
                            </div>
                        </div>
                        <div class="card">
                            <img src="SOURCES/IMG/kolkata.jpg" alt="KOLKATA" style="width:100%;">
                            <div class="container1">
                                <h4><b>KOLKATA</b></h4>
                                <a href="Bookings.jsp"><button type="submit">Book Now</button></a>
                            </div>
                        </div>
                        <div class="card">
                            <img src="SOURCES/IMG/meghalaya.jpg" alt="EASTERN-7" style="width:100%;">
                            <div class="container1">
                                <h4><b>EASTERN-7</b></h4>
                                <a href="Bookings.jsp"><button type="submit">Book Now</button></a>
                            </div>
                        </div>
                    </div>
                    
                </section>
                <section class="carousel-section">
                    <h1 class="section-title"
                        style="color: rgb(0, 247, 255); margin-top: 55px; font-size: 50px; -webkit-text-stroke-width: 2px; -webkit-text-stroke-color: black;">
                        South India</h1>
                    <div class="north-card">
                        <div class="card">
                            <img src="SOURCES/IMG/ooty.jpg" alt="OOTY" style="width:100%;">
                            <div class="container1">
                                <h4><b>OOTY</b></h4>
                                <a href="Bookings.jsp"><button type="submit">Book Now</button></a>
                            </div>
                        </div>
                        <div class="card">
                            <img src="SOURCES/IMG/mysuru.jpg" alt="MYSURU" style="width:100%;">
                            <div class="container1">
                                <h4><b>MYSURU</b></h4>
                                <a href="Bookings.jsp">
                                <button type="submit">Book Now</button></a>
                            </div>
                        </div>
                        <div class="card">
                            <img src="SOURCES/IMG/tirupati.jpg" alt="TIRUPATI" style="width:100%;">
                            <div class="container1">
                                <h4><b>TIRUPATI</b></h4>
                                <a href="Bookings.jsp"><button type="submit">Book Now</button></a>
                            </div>
                        </div>
                    </div>
                </section>
            </main>
        </div>
    </footer>

    <footer>
        <div class="footer-content">
            <ul class="footer-list">
                <li><a href="AboutUs1.jsp">About Us</a></li>
                <li><a href="ContactUs.jsp">Contact Us</a></li>
            </ul>
        </div>
    </footer>

</body>

</html>
