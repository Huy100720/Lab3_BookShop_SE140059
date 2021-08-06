<%-- 
    Document   : productDetail
    Created on : Jun 16, 2021, 8:19:40 PM
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

        <title>Book Detail Page</title>

        <!-- Google font -->
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,500,700" rel="stylesheet">

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

        <script>
            function roundTotal() {
                var num = document.getElementById("totalPrice").value;
                var n = parseFloat(num).toFixed(2);
                document.getElementById("round").innerHTML = "SUBTOTAL: $" + n;
            }
        </script>

    </head>
    <body>
        <!-- HEADER -->
        <header>
            <!-- TOP HEADER -->
            <div id="top-header">
                <div class="container">
                    <ul class="header-links pull-left">
                        <li><i class="fa fa-user-o"></i>Welcome: ${sessionScope.USER.userName}</li>
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
                            <div class="header-ctn">
                                <!-- Cart -->
                                <div class="dropdown" >
                                    <c:set var="totalQuantity" value="${0}"/>
                                    <c:set var="total" value="${0}"/> 
                                    <a class="dropdown-toggle" data-toggle="dropdown" aria-expanded="true">
                                        <i class="fa fa-shopping-cart" onclick="roundTotal()"></i>
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
                                                            <img src="img/${bookInCart.bookImage}" alt="">
                                                        </div>
                                                        <div class="product-body">
                                                            <h3 class="product-name"><a href="#">${bookInCart.bookTitle}</a></h3>
                                                            <h4 class="product-price"><span class="qty">${bookInCart.quantity}x</span>$${bookInCart.price}</h4>
                                                        </div>
                                                        <form action="MainController">
                                                            <input type="hidden" name="bookID" value="${bookInCart.bookID}">
                                                            <input type="hidden" name="page" value="bookDetail">
                                                            <input type="hidden" name="bookID" value="${param.bookID}">
                                                            <input type="hidden" name="bookTitle" value="${param.bookTitle}">
                                                            <input type="hidden" name="bookImage" value="${param.bookImage}">
                                                            <input type="hidden" name="description" value="${param.description}">
                                                            <input type="hidden" name="price" value="${param.price}">
                                                            <input type="hidden" name="quantity" value="${param.quantity}">
                                                            <input type="hidden" name="author" value="${param.author}">
                                                            <input type="hidden" name="createDate" value="${param.createDate}">
                                                            <input type="hidden" name="categoryID" value="${param.categoryID}">                   f                                        
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
                </div>
                <!-- /responsive-nav -->
            </div>
            <!-- /container -->
        </nav>
        <!-- /NAVIGATION -->

        <!-- SECTION -->
        <div class="section">
            <!-- container -->
            <div class="container">
                <!-- row -->
                <div class="row">
                    <!-- Product main img -->
                    <div class="col-md-5 col-md-push-2">
                        <div id="product-main-img">
                            <div >
                                <img src="img/${param.bookImage}" width="262" height="400" alt="">
                            </div>
                        </div>
                    </div>
                    <!-- /Product main img -->

                    <!-- Product thumb imgs -->
                    <div class="col-md-2  col-md-pull-5">

                    </div>
                    <!-- /Product thumb imgs -->

                    <!-- Product details -->

                    <div class="col-md-5">
                        <div class="product-details">
                            <h2 class="product-name">${param.bookTitle}</h2>
                            <div>
                                <div class="product-rating">
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                </div>
                            </div>
                            <div>
                                <h3 class="product-price">$${param.price}</h3>								
                            </div>

                            <ul class="product-links">
                                <li>Quantity :  ${param.quantity}</li>
                            </ul>

                            <ul class="product-links">
                                <li>Category :  ${param.categoryID}</li>
                            </ul>

                            <ul class="product-links">
                                <li>Author :  ${param.author}  </li>
                            </ul>
                            <br/>
                            <div class="add-to-cart">
                                <c:url var="addToCart" value="MainController">
                                    <c:param name="action" value="AddToCart"></c:param>
                                    <c:param name="bookID" value="${param.bookID}"></c:param>
                                    <c:param name="bookTitle" value="${param.bookTitle}"></c:param>
                                    <c:param name="bookImage" value="${param.bookImage}"></c:param>
                                    <c:param name="description" value="${param.description}"></c:param>
                                    <c:param name="price" value="${param.price}"></c:param>
                                    <c:param name="quantity" value="${param.quantity}"></c:param>
                                    <c:param name="author" value="${param.author}"></c:param>
                                    <c:param name="createDate" value="${param.createDate}"></c:param>    
                                    <c:param name="categoryID" value="${param.categoryID}"></c:param> 
                                </c:url>
                                <a href="${addToCart}">
                                    <button class="add-to-cart-btn"><i class="fa fa-shopping-cart"></i> add to cart</button>
                                </a>
                            </div>

                            <ul class="product-links">
                                <li>Share:</li>
                                <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                                <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                                <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
                                <li><a href="#"><i class="fa fa-envelope"></i></a></li>
                            </ul>

                        </div>
                    </div>
                    <!-- /Product details -->

                    <!-- Product tab -->
                    <div class="col-md-12">
                        <div id="product-tab">
                            <!-- product tab nav -->
                            <ul class="tab-nav">
                                <li class="active"><a data-toggle="tab" href="#tab1">Description</a></li>
                            </ul>
                            <!-- /product tab nav -->

                            <!-- product tab content -->
                            <div class="tab-content">
                                <!-- tab1  -->
                                <div id="tab1" class="tab-pane fade in active">
                                    <div class="row">
                                        <div class="col-md-12">
                                            <p>${param.description}</p>
                                        </div>
                                    </div>
                                </div>
                                <!-- /tab1  -->

                            </div>
                            <!-- /product tab content  -->
                        </div>
                    </div>
                    <!-- /product tab -->
                </div>
                <!-- /row -->
            </div>
            <!-- /container -->
        </div>
        <!-- /SECTION -->

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

