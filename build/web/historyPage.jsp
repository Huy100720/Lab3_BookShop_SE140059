<%-- 
    Document   : historyPage
    Created on : Jun 23, 2021, 6:39:49 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

        <title>History Page</title>

        <!-- Google font -->
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,500,700" rel="stylesheet">

        <!-- Bootstrap -->
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
        <link type="text/css" rel="stylesheet" href="css/history.css"/>
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
                            <!-- LOGIN -->
                            <c:url var="login" value="MainController">
                                <c:param name="action" value="Login"></c:param>
                            </c:url>
                            <li><a href="${login}"><i class="fa fa-user-o"></i>Login</a></li>
                            <!-- REGISTER -->
                            <c:url var="register" value="MainController">
                                <c:param name="action" value="Register"></c:param>
                            </c:url>
                            <li><a href="${register}"><i class="fa fa-user-o"></i>Register</a></li>  
                            </c:if>
                        <!-- /LOGIN AND REGISTER CHECK -->

                        <!-- LOGOUT CHECK -->
                        <c:if test="${sessionScope.USER != null}">
                            <!-- LOGOUT AND VIEW HISTORY CHECK-->
                            <c:url var="logout" value="MainController">
                                <c:param name="action" value="Logout"></c:param>
                            </c:url>
                            <li><a href="${logout}"><i class="fa fa-user-o"></i>Logout</a></li>
                            <!-- VIEW HISTORY -->
                            <c:url var="history" value="MainController">
                                <c:param name="action" value="History"></c:param>
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
                                    <input class="input" name="bookTitleSearch" value="${param.bookTitleSearch}" placeholder="book Title">
                                    <input class="input" name="orderDateSearch" value="${param.orderDateSearch}" placeholder="yyyy-mm-dd">
                                    <input type="hidden" name="userID" value="${sessionScope.USER.userID}"/>
                                    <button type="submit" class="search-btn" name="action" value="Search History">Search</button> 
                                </form>
                            </div>
                        </div>
                        <!-- /SEARCH BAR -->

                        <!-- ACCOUNT -->
                        <div class="col-md-1 clearfix">
                            <div class="header-ctn">
                                <!-- Cart -->
                                <div class="dropdown">
                                    <c:set var="totalQuantity" value="${0}"/>
                                    <c:set var="total" value="${0}"/> 
                                    <a class="dropdown-toggle" data-toggle="dropdown" aria-expanded="true">
                                        <i class="fa fa-shopping-cart" ></i>
                                        <span>Your Cart</span>
                                        <c:if test="${sessionScope.CART.getCart().values() != null}">
                                            <c:forEach var="bookInCart" items="${sessionScope.CART.getCart().values()}">
                                                <c:set var="totalQuantity" value="${totalQuantity + bookInCart.quantity}"/>
                                                <div class="qty">${totalQuantity}</div>
                                            </c:forEach>
                                        </c:if>
                                    </a>
                                    <div class="cart-dropdown">
                                        <div class="cart-list">
                                            <c:if test="${sessionScope.CART != null}">                                    
                                                <c:forEach var="bookInCart" items="${sessionScope.CART.getCart().values()}">
                                                    <c:set var="total" value="${total + bookInCart.price* bookInCart.quantity}"/>
                                                    <div class="product-widget">
                                                        <div class="product-img">
                                                            <img src="${bookInCart.bookImage}" alt="">
                                                        </div>
                                                        <div class="product-body">
                                                            <h3 class="product-name"><a href="#">${bookInCart.bookTitle}</a></h3>
                                                            <h4 class="product-price"><span class="qty">${bookInCart.quantity}x</span>$${bookInCart.price}</h4>
                                                        </div>
                                                        <form action="MainController">
                                                            <input type="hidden" name="bookID" value="${bookInCart.bookID}">
                                                            <input type="hidden" name="page" value="history">
                                                            <button type="submit" name="action" value="DeleteBookInCart" class="delete" 
                                                                    onclick="return confirm('Are you sure you want to delete this book from cart?');"><i class="fa fa-close"></i></button>
                                                        </form>                                                        
                                                    </div>
                                                </c:forEach>
                                            </c:if>
                                        </div>

                                        <!-- Total -->
                                        <div class="cart-summary">
                                            <small>${totalQuantity} Item(s) selected</small>
                                            <h4 class="product-price" id="round">TOTAL: $${total}</h4>
                                            <input id="totalPrice" type="hidden" value="${total}"/>                                            
                                        </div>
                                        <!-- /Total -->

                                        <div class="cart-btns">
                                            <a href="checkout.jsp">View Cart</a>
                                            <a href="#">Checkout<i class="fa fa-arrow-circle-right"></i></a>
                                        </div>
                                    </div>
                                </div>
                                <!-- /Cart -->

                                <!-- Menu Toogle -->
                                <div class="menu-toggle">
                                    <a href="#">
                                        <i class="fa fa-bars"></i>
                                        <span>Menu</span>
                                    </a>
                                </div>
                                <!-- /Menu Toogle -->
                            </div>
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
                        <li class="active"><a href="SearchBookController">Home</a></li>
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
                        <h3 class="breadcrumb-header">Order History</h3>
                    </div>
                </div>
                <!-- /row -->
            </div>
            <!-- /container -->
        </div>
        <!-- /BREADCRUMB -->

        <!-- SECTION -->
        <h4> ${requestScope.MSG} </h4>
        <div class="section">
            <!-- container -->      
            <div class="container">
            <table id="cart" class="table table-hover table-condensed">
                <thead>
                    <tr>
                        <th style="width:12%">Order ID</th>
                        <th style="width:50%">Book Title</th>
                        <th style="width:10%">Price</th>
                        <th style="width:8%">Quantity</th>
                        <th style="width:10%" class="text-center">Total</th>
                        <th style="width:10%">Create Date</th>
                    </tr>
                </thead>
                    <c:forEach var="history" items="${requestScope.HISTORY_LIST}">                        
                            <tbody>
                                <tr>
                                    <td data-th="Price">${history.orderID}</td>
                                    <td data-th="Product">
                                        <div class="row">                                                
                                            <div class="col-sm-10">
                                                <h4 class="nomargin">${history.bookID}</h4>
                                                <p></p>
                                            </div>
                                        </div>
                                    </td>
                                    <td data-th="Price">${history.price} $</td>
                                    <td data-th="Price">${history.quantity}</td>
                                    <td data-th="Subtotal" class="text-center">${history.total} $</td>
                                    <td data-th="Price">${history.orderDate}</td>
                                </tr>
                            </tbody>                 
                    </c:forEach>
            </table>
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

