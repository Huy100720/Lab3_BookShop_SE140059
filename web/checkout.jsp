<%-- 
    Document   : checkout
    Created on : Jun 16, 2021, 8:19:55 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

        <title>Check Out Page</title>

        <!-- Google font -->
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,500,700" rel="stylesheet">
        <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">

        <!-- Bootstrap -->
        <link type="text/css" rel="stylesheet" href="css/bootstrap.min.css"/>

        <!-- Slick -->
        <link type="text/css" rel="stylesheet" href="css/slick.css"/>
        <link type="text/css" rel="stylesheet" href="css/slick-theme.css"/>

        <!-- nouislider -->
        <link type="text/css" rel="stylesheet" href="css/nouislider.min.css"/>

        <!-- Font Awesome Icon -->
        <link rel="stylesheet" href="css/font-awesome.min.css">

        <!-- Custom stlylesheet -->
        <link type="text/css" rel="stylesheet" href="css/style.css"/>

        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->

        <!-- /Function to round total to xx.xx -->
        <script>
            function roundTotal() {
                var num = document.getElementById("totalPrice").value;
                var n = parseFloat(num).toFixed(2);
                document.getElementById("round").innerHTML = "TOTAL: $" + n;
            }
        </script>

    </head>
    <body onload="roundTotal()">
        <!-- HEADER -->
        <header>
            <!-- TOP HEADER -->
            <div id="top-header">
                <div class="container">
                    <ul class="header-links pull-left">
                        <c:if test="${sessionScope.USER != null}">
                            <li><i class="fa fa-user-o"></i>Welcome: ${sessionScope.USER.userName}</li>
                            </c:if>                       
                    </ul>
                    <ul class="header-links pull-right">
                        <!-- LOGIN AND REGISTER CHECK -->
                        <c:if test="${sessionScope.USER == null}">               
                            <c:url var="login" value="MainController">
                                <c:param name="action" value="Login"></c:param>
                            </c:url>
                            <li><a href="${login}"><i class="fa fa-user-o"></i>Login</a></li>
                                <c:url var="register" value="MainController">
                                    <c:param name="action" value="Register"></c:param>
                                </c:url>
                            <li><a href="${register}"><i class="fa fa-user-o"></i>Register</a></li>  
                            </c:if>
                        <!-- /LOGIN AND REGISTER CHECK -->

                        <!-- LOGOUT AND VIEW HISTORY CHECK -->
                        <c:if test="${sessionScope.USER != null}">
                            <!-- LOGOUT CHECK-->
                            <c:url var="logout" value="MainController">
                                <c:param name="action" value="Logout"></c:param>
                            </c:url>
                            <li><a href="${logout}"><i class="fa fa-user-o"></i>Logout</a></li>

                            <!-- VIEW HISTORY -->
                            <c:url var="history" value="MainController">
                                <c:param name="action" value="History"></c:param>
                                <c:param name="userID" value="${sessionScope.USER.userID}"></c:param>
                            </c:url>
                            <li><a href="${history}"><i class="fa fa-user-o"></i>History</a></li>
                            </c:if>
                        <!-- /LOGOUT AND VIEW HISTORY CHECK -->
                    </ul>
                </div>
            </div>
            <!-- /TOP HEADER -->

            <!-- MAIN HEADER -->
            <div id="header">
                <!-- container -->
                <div class="container">
                    <!-- row -->
                    <div class="row">
                        <!-- LOGO -->
                        <div class="col-md-2">
                            <div class="header-logo">
                                <a href="SearchBookController" class="logo">
                                    <img src="./img/logo.png" alt="">
                                </a>
                            </div>
                        </div>
                        <!-- /LOGO -->

                        <!-- SEARCH BAR -->
                        <div class="col-md-9">
                            <div class="header-search">
                                <form action="MainController">
                                    <select class="input-select" name="categorySearch">
                                        <option value="ALL">All Categories</option>
                                        <option value="C001">Art & Photography</option>
                                        <option value="C002">Graphic Novels, Anime & Manga</option>
                                        <option value="C003">Children's Books</option>
                                        <option value="C004">Science Fiction, Fantasy & Horror</option>
                                        <option value="C005">Computing</option>
                                    </select>                                    
                                    <input class="input" name="bookTitleSearch" value="${param.bookTitleSearch}" placeholder="bookTitle">
                                    <input class="input" name="priceSearch" value="${param.priceSearch}" placeholder="Price more than">
                                    <button type="submit" class="search-btn" name="action" value="Search">Search</button> 
                                </form>
                            </div>
                        </div>
                        <!-- /SEARCH BAR -->

                        <!-- ACCOUNT -->
                        <div class="col-md-1 clearfix">
                        </div>
                        <!-- /ACCOUNT -->
                    </div>
                    <!-- row -->
                </div>
                <!-- container -->
            </div>
            <!-- /MAIN HEADER -->
        </header>
        <!-- /HEADER -->

        <!-- NAVIGATION -->
        <nav id="navigation">
            <!-- container -->
            <div class="container">
                <!-- responsive-nav -->
                <div id="responsive-nav">
                    <!-- NAV -->
                    <ul class="main-nav nav navbar-nav">
                    </ul>
                    <!-- /NAV -->
                </div>
                <!-- /responsive-nav -->
            </div>
            <!-- /container -->
        </nav>
        <!-- /NAVIGATION -->

        <!-- BREADCRUMB -->
        <div id="breadcrumb" class="section">
            <!-- container -->
            <div class="container">
                <!-- row -->
                <div class="row">
                    <div class="col-md-12">
                        <h3 class="breadcrumb-header">Checkout</h3>
                        <ul class="breadcrumb-tree">
                            <li><a href="SearchBookController">Home</a></li>
                            <li class="active">Checkout</li>
                        </ul>
                    </div>
                </div>
                <!-- /row -->
            </div>
            <!-- /container -->
        </div>
        <!-- /BREADCRUMB -->

        <!-- SECTION -->
        <div class="section">
            <!-- container -->
            <div class="container">
                <!-- row -->
                <div class="row">

                    <div class="col-md-6">
                        <!-- Billing Details -->
                        <div class="billing-details">
                            <div class="section-title">
                                <h3 class="title">Billing address</h3>
                            </div>
                            <div class="form-group">
                                <input class="input" type="text" name="userName" placeholder="User Name" value="${sessionScope.USER.userName}">
                            </div>
                            <div class="form-group">
                                <input class="input" type="text" name="gender" placeholder="Gender" value="${sessionScope.USER.gender}">
                            </div>
                            <div class="form-group">
                                <input class="input" type="email" name="email" placeholder="Email" value="${sessionScope.USER.email}">
                            </div>
                            <div class="form-group">
                                <input class="input" type="text" name="address" placeholder="Address" value="${sessionScope.USER.address}">
                            </div>
                            <div class="form-group">
                                <input class="input" type="text" name="phone" placeholder="Phone" value="${sessionScope.USER.phone}"> 
                            </div>                           
                            <div class="form-group">
                                <div class="input-checkbox">

                                </div>
                            </div>
                        </div>
                        <!-- /Billing Details -->

                        <!-- Order notes -->
                        <div class="order-notes">
                            <textarea class="input" placeholder="Order Notes"></textarea>
                        </div>
                        <!-- /Order notes -->
                    </div>

                    <!-- Order Details -->
                    <div class="col-md-6 order-details" onload="roundTotal()">
                        <div class="section-title text-center">
                            <h3 class="title" >Your Cart</h3>
                        </div>
                        <h5>${requestScope.MSG}</h5>
                        <div class="order-summary">
                            <div class="order-col">
                                <div><strong>BOOK</strong></div>
                                <div><strong>TOTAL</strong></div>
                            </div>
                            <div class="order-products" onload="roundTotal()">
                                <c:set var="subTotal" value="${0}"/>
                                <c:set var="total" value="${0}"/> 
                                <c:forEach var="book" items="${sessionScope.CART.getCart().values()}">
                                    <c:set var="total" value="${total + book.price* book.quantity}"/>
                                    <c:set var="subTotal" value="${book.price* book.quantity}"/>
                                    <div class="order-col"> 
                                        <div>
                                            <form action="MainController">
                                                <button type="submit" value="UpdateQuantity" name="action" class="btn btn-info btn-sm"><i class="fa fa-refresh"></i></button>
                                                <button type="submit" value="DeleteBookInCart" name="action" class="btn btn-danger btn-sm" 
                                                        onclick="return confirm('Are you sure you want to delete this book from cart?');"><i class="fa fa-trash-o"></i></button>
                                                <input type="hidden" name="bookID" value="${book.bookID}" />
                                                <input type="hidden" name="page" value="checkout" />
                                                <input style="width:50px" type="number" name="quantity" value="${book.quantity}">  x ${book.bookTitle}
                                            </form>                                          
                                        </div>
                                        <c:if test="${requestScope.DISC != null}">
                                            <c:set var="subTotal" value="${subTotal * requestScope.DISC}"/>
                                        </c:if>
                                        <div>${subTotal}</div>
                                    </div>
                                </c:forEach>
                            </div>
                            <div class="order-col">
                                <div>Shipping</div>
                                <div><strong>FREE</strong></div>
                            </div>
                            <c:if test="${requestScope.DISC != null}">
                                <c:set var="total" value="${total * requestScope.DISC}"/>
                            </c:if>
                            <div class="order-col">
                                <div><strong>TOTAL</strong></div>
                                <input id="totalPrice" type="hidden" value="${total}"/>
                                <div><strong id="round" class="order-total">${total}</strong></div>
                            </div>
                            <c:if test="${sessionScope.CART.getCart().values() != null}">
                                <form action="MainController">
                                    <input class="input" type="text" name="discountID" value="${param.DiscountID}" placeholder="Discount Code">
                                    <input type="hidden" name="userID" value="${sessionScope.USER.userID}"/>
                                    <input type="submit" name="action" value="Check Code"/>                          
                                    <h5>${requestScope.MSG_CHECK}</h5>
                                    
                                </form>
                            </c:if>
                        </div>

                        <c:if test="${sessionScope.CART.getCart().values() != null}">
                            <c:url var="pay" value="MainController">
                                <c:param name="action" value="Pay"></c:param>
                                <c:param name="userID" value="${sessionScope.USER.userID}"></c:param>
                                <c:param name="discountID" value="${param.discountID}"></c:param>
                                <c:param name="discPercent" value="${requestScope.DISC}"></c:param>
                                <c:param name="total" value="${total}"></c:param>
                            </c:url>
                            <a href="${pay}" class="primary-btn order-submit">Pay</a>
                        </c:if>
                            <h3>${requestScope.MSG}</h3>
                    </div>
                    <!-- /Order Details -->
                </div>
                <!-- /row -->
            </div>
            <!-- /container -->
        </div>
        <!-- /SECTION -->

        <!-- NEWSLETTER -->
        <div id="newsletter" class="section">
            <!-- container -->
            <div class="container">
                <!-- row -->
                <div class="row">
                    <div class="col-md-12">
                        <div class="newsletter">
                            <p>Sign Up for the <strong>NEWSLETTER</strong></p>
                            <form>
                                <input class="input" type="email" placeholder="Enter Your Email">
                                <button class="newsletter-btn"><i class="fa fa-envelope"></i> Subscribe</button>
                            </form>
                            <ul class="newsletter-follow">
                                <li>
                                    <a href="#"><i class="fa fa-facebook"></i></a>
                                </li>
                                <li>
                                    <a href="#"><i class="fa fa-twitter"></i></a>
                                </li>
                                <li>
                                    <a href="#"><i class="fa fa-instagram"></i></a>
                                </li>
                                <li>
                                    <a href="#"><i class="fa fa-pinterest"></i></a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
                <!-- /row -->
            </div>
            <!-- /container -->
        </div>
        <!-- /NEWSLETTER -->

        <!-- FOOTER -->
        <footer id="footer">
            <!-- top footer -->
            <div class="section">
                <!-- container -->
                <div class="container">
                    <!-- row -->
                    <div class="row">
                        <div class="col-md-3 col-xs-6">
                            <div class="footer">
                                <h3 class="footer-title">About Us</h3>
                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut.</p>
                                <ul class="footer-links">
                                    <li><a href="#"><i class="fa fa-map-marker"></i>1734 Stonecoal Road</a></li>
                                    <li><a href="#"><i class="fa fa-phone"></i>+021-95-51-84</a></li>
                                    <li><a href="#"><i class="fa fa-envelope-o"></i>email@email.com</a></li>
                                </ul>
                            </div>
                        </div>

                        <div class="col-md-3 col-xs-6">
                            <div class="footer">
                                <h3 class="footer-title">Categories</h3>
                                <ul class="footer-links">
                                    <li><a href="#">Hot deals</a></li>
                                    <li><a href="#">Laptops</a></li>
                                    <li><a href="#">Smartphones</a></li>
                                    <li><a href="#">Cameras</a></li>
                                    <li><a href="#">Accessories</a></li>
                                </ul>
                            </div>
                        </div>

                        <div class="clearfix visible-xs"></div>

                        <div class="col-md-3 col-xs-6">
                            <div class="footer">
                                <h3 class="footer-title">Information</h3>
                                <ul class="footer-links">
                                    <li><a href="#">About Us</a></li>
                                    <li><a href="#">Contact Us</a></li>
                                    <li><a href="#">Privacy Policy</a></li>
                                    <li><a href="#">Orders and Returns</a></li>
                                    <li><a href="#">Terms & Conditions</a></li>
                                </ul>
                            </div>
                        </div>

                        <div class="col-md-3 col-xs-6">
                            <div class="footer">
                                <h3 class="footer-title">Service</h3>
                                <ul class="footer-links">
                                    <li><a href="#">My Account</a></li>
                                    <li><a href="#">View Cart</a></li>
                                    <li><a href="#">Wishlist</a></li>
                                    <li><a href="#">Track My Order</a></li>
                                    <li><a href="#">Help</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <!-- /row -->
                </div>
                <!-- /container -->
            </div>
            <!-- /top footer -->

            <!-- bottom footer -->
            <div id="bottom-footer" class="section">
                <div class="container">
                    <!-- row -->
                    <div class="row">
                        <div class="col-md-12 text-center">
                            <ul class="footer-payments">
                                <li><a href="#"><i class="fa fa-cc-visa"></i></a></li>
                                <li><a href="#"><i class="fa fa-credit-card"></i></a></li>
                                <li><a href="#"><i class="fa fa-cc-paypal"></i></a></li>
                                <li><a href="#"><i class="fa fa-cc-mastercard"></i></a></li>
                                <li><a href="#"><i class="fa fa-cc-discover"></i></a></li>
                                <li><a href="#"><i class="fa fa-cc-amex"></i></a></li>
                            </ul>
                            <span class="copyright">
                                <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                                Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
                                <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                            </span>
                        </div>
                    </div>
                    <!-- /row -->
                </div>
                <!-- /container -->
            </div>
            <!-- /bottom footer -->
        </footer>
        <!-- /FOOTER -->

        <!-- jQuery Plugins -->
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/slick.min.js"></script>
        <script src="js/nouislider.min.js"></script>
        <script src="js/jquery.zoom.min.js"></script>
        <script src="js/main.js"></script>

    </body>
</html>

