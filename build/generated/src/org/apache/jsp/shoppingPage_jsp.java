package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class shoppingPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_var_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_param_value_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_var_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_param_value_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_url_var_value.release();
    _jspx_tagPool_c_param_value_name_nobody.release();
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("\n");
      out.write("        <title>Shopping Page</title>\n");
      out.write("\n");
      out.write("        <!-- Google font -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,500,700\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\n");
      out.write("\n");
      out.write("        <!-- Slick -->\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/slick.css\"/>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/slick-theme.css\"/>\n");
      out.write("\n");
      out.write("        <!-- nouislider -->\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/nouislider.min.css\"/>\n");
      out.write("\n");
      out.write("        <!-- Font Awesome Icon -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("        <!-- Custom stlylesheet -->\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/style.css\"/>\n");
      out.write("\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/edit.css\"/>\n");
      out.write("        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("        \n");
      out.write("        <!-- /Function to round total to xx.xx -->\n");
      out.write("        <script>\n");
      out.write("            function roundTotal() {\n");
      out.write("                var num = document.getElementById(\"totalPrice\").value;\n");
      out.write("                var n = parseFloat(num).toFixed(2);\n");
      out.write("                document.getElementById(\"round\").innerHTML = \"SUBTOTAL: $\" + n;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body onload=\"roundTotal()\">\n");
      out.write("        <!-- HEADER -->\n");
      out.write("        <header>\n");
      out.write("            <!-- TOP HEADER -->\n");
      out.write("            <div id=\"top-header\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <ul class=\"header-links pull-left\">\n");
      out.write("                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("                       \n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"header-links pull-right\">\n");
      out.write("                        <!-- LOGIN AND REGISTER CHECK -->\n");
      out.write("                        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        <!-- /LOGIN AND REGISTER CHECK -->\n");
      out.write("\n");
      out.write("                        <!-- LOGOUT CHECK -->\n");
      out.write("                        ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        <!-- /LOGOUT AND VIEW HISTORY CHECK -->\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- /TOP HEADER -->\n");
      out.write("\n");
      out.write("            <!-- MAIN HEADER -->\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <!-- container -->\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <!-- row -->\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <!-- LOGO -->\n");
      out.write("                        <div class=\"col-md-2\">\n");
      out.write("                            <div class=\"header-logo\">\n");
      out.write("                                <a href=\"SearchBookController\" class=\"logo\">\n");
      out.write("                                    <img src=\"./img/logo.png\" alt=\"\">\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /LOGO -->\n");
      out.write("                        <!-- SEARCH BAR -->\n");
      out.write("                        <div class=\"col-md-9\">\n");
      out.write("                            <div class=\"header-search\">\n");
      out.write("                                <form action=\"MainController\">\n");
      out.write("                                    <select class=\"input-select\" name=\"categorySearch\">\n");
      out.write("                                        <option value=\"ALL\">All Categories</option>\n");
      out.write("                                        <option value=\"C001\">Art & Photography</option>\n");
      out.write("                                        <option value=\"C002\">Graphic Novels, Anime & Manga</option>\n");
      out.write("                                        <option value=\"C003\">Children's Books</option>\n");
      out.write("                                        <option value=\"C004\">Science Fiction, Fantasy & Horror</option>\n");
      out.write("                                        <option value=\"C005\">Computing</option>\n");
      out.write("                                    </select>                                    \n");
      out.write("                                    <input class=\"input\" name=\"bookTitleSearch\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.bookTitleSearch}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"bookTitle\">\n");
      out.write("                                    <input class=\"input\" name=\"priceSearch\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.priceSearch}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Price more than\">\n");
      out.write("                                    <button type=\"submit\" class=\"search-btn\" name=\"action\" value=\"Search\">Search</button> \n");
      out.write("\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /SEARCH BAR -->\n");
      out.write("\n");
      out.write("                        <!-- ACCOUNT -->\n");
      out.write("                        <div class=\"col-md-1 clearfix\">\n");
      out.write("                            <div class=\"header-ctn\">\n");
      out.write("                                <!-- Cart -->\n");
      out.write("                                <div class=\"dropdown\">\n");
      out.write("                                    ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    ");
      if (_jspx_meth_c_set_1(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("                                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"true\">\n");
      out.write("                                        <i class=\"fa fa-shopping-cart\" ></i>\n");
      out.write("                                        <span>Your Cart</span>\n");
      out.write("                                        ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </a>\n");
      out.write("                                    <div class=\"cart-dropdown\">\n");
      out.write("                                        <div class=\"cart-list\">\n");
      out.write("                                            ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <!-- Total -->\n");
      out.write("                                        <div class=\"cart-summary\">\n");
      out.write("                                            <small>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalQuantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" Item(s) selected</small>\n");
      out.write("                                            <h4 class=\"product-price\" id=\"round\">TOTAL: $");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h4>\n");
      out.write("                                            <input id=\"totalPrice\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>                                            \n");
      out.write("                                        </div>\n");
      out.write("                                        <!-- /Total -->\n");
      out.write("                                        \n");
      out.write("                                        <div class=\"cart-btns\">\n");
      out.write("                                            <a href=\"checkout.jsp\">View Cart</a>\n");
      out.write("                                            <a href=\"#\">Checkout<i class=\"fa fa-arrow-circle-right\"></i></a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /Cart -->\n");
      out.write("\n");
      out.write("                                <!-- Menu Toogle -->\n");
      out.write("                                <div class=\"menu-toggle\">\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <i class=\"fa fa-bars\"></i>\n");
      out.write("                                        <span>Menu</span>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /Menu Toogle -->\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /ACCOUNT -->\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    <!-- row -->\n");
      out.write("                </div>\n");
      out.write("                <!-- container -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /MAIN HEADER -->\n");
      out.write("        </header>\n");
      out.write("        <!-- /HEADER -->\n");
      out.write("\n");
      out.write("        <!-- NAVIGATION -->\n");
      out.write("        \n");
      out.write("        <nav id=\"navigation\">\n");
      out.write("            <!-- container -->          \n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h4> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.MSG}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h4>\n");
      out.write("                <!-- responsive-nav -->\n");
      out.write("                <div id=\"responsive-nav\">\n");
      out.write("                    <!-- NAV -->                 \n");
      out.write("                    <ul class=\"main-nav nav navbar-nav\">\n");
      out.write("                        <li class=\"active\"><a href=\"#\">Home</a></li>\n");
      out.write("                        <li><a href=\"#\">All Categories</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    \n");
      out.write("                    <!-- /NAV -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /responsive-nav -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /container -->\n");
      out.write("        </nav>\n");
      out.write("        <!-- /NAVIGATION -->\n");
      out.write("\n");
      out.write("        <!-- SECTION -->\n");
      out.write("        <div class=\"section\">\n");
      out.write("            <!-- container -->\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <!-- row -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                    <!-- section title -->\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"section-title\">\n");
      out.write("                            <h3 class=\"title\">New Book</h3>\n");
      out.write("                            <div class=\"section-nav\">\n");
      out.write("                                <ul class=\"section-tab-nav tab-nav\">\n");
      out.write("\n");
      out.write("                                    <li class=\"active\"><a data-toggle=\"tab\" href=\"#tab1\">All Categories</a></li>\n");
      out.write("                                    <li><a data-toggle=\"tab\" href=\"#tab1\">Art & Photography</a></li>\n");
      out.write("                                    <li><a data-toggle=\"tab\" href=\"#tab1\">Science Fiction, Fantasy & Horror</a></li>\n");
      out.write("                                    <li><a data-toggle=\"tab\" href=\"#tab1\">Computing</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /section title -->\n");
      out.write("\n");
      out.write("                    <!-- Products tab & slick -->\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"products-tabs\">\n");
      out.write("                                <!-- tab -->\n");
      out.write("                                <div id=\"tab1\" class=\"tab-pane active\">\n");
      out.write("                                    <div class=\"products-slick\" data-nav=\"#slick-nav-1\">\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <div id=\"slick-nav-1\" class=\"products-slick-nav\"></div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /tab -->\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Products tab & slick -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /row -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /container -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /SECTION -->\n");
      out.write("\n");
      out.write("        <!-- HOT DEAL SECTION -->\n");
      out.write("        <div id=\"hot-deal\" class=\"section\">\n");
      out.write("            <!-- container -->\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <!-- row -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"hot-deal\">\n");
      out.write("                            <ul class=\"hot-deal-countdown\">\n");
      out.write("                                <li>\n");
      out.write("                                    <div>\n");
      out.write("                                        <h3>02</h3>\n");
      out.write("                                        <span>Days</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <div>\n");
      out.write("                                        <h3>10</h3>\n");
      out.write("                                        <span>Hours</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <div>\n");
      out.write("                                        <h3>34</h3>\n");
      out.write("                                        <span>Mins</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <div>\n");
      out.write("                                        <h3>60</h3>\n");
      out.write("                                        <span>Secs</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                            <h2 class=\"text-uppercase\">hot deal this week</h2>\n");
      out.write("                            <p>New Collection Up to 50% OFF</p>\n");
      out.write("                            <a class=\"primary-btn cta-btn\" href=\"#\">Shop now</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- /row -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /container -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /HOT DEAL SECTION -->\n");
      out.write("\n");
      out.write("        <!-- SECTION -->\n");
      out.write("        <div class=\"section\">\n");
      out.write("            <!-- container -->\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <!-- row -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                    <!-- section title -->\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"section-title\">\n");
      out.write("                            <h3 class=\"title\">Top selling</h3>\n");
      out.write("                            <div class=\"section-nav\">\n");
      out.write("                                <ul class=\"section-tab-nav tab-nav\">\n");
      out.write("                                    <li class=\"active\"><a data-toggle=\"tab\" href=\"#tab2\">Laptops</a></li>\n");
      out.write("                                    <li><a data-toggle=\"tab\" href=\"#tab2\">Smartphones</a></li>\n");
      out.write("                                    <li><a data-toggle=\"tab\" href=\"#tab2\">Cameras</a></li>\n");
      out.write("                                    <li><a data-toggle=\"tab\" href=\"#tab2\">Accessories</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /section title -->\n");
      out.write("\n");
      out.write("                    <!-- Products tab & slick -->\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"products-tabs\">\n");
      out.write("                                <!-- tab -->\n");
      out.write("                                <div id=\"tab2\" class=\"tab-pane fade in active\">\n");
      out.write("                                    <div class=\"products-slick\" data-nav=\"#slick-nav-2\">\n");
      out.write("                                        <!-- product -->\n");
      out.write("                                        <div class=\"product\">\n");
      out.write("                                            <div class=\"product-img\">\n");
      out.write("                                                <img src=\"./img/product06.png\" alt=\"\">\n");
      out.write("                                                <div class=\"product-label\">\n");
      out.write("                                                    <span class=\"sale\">-30%</span>\n");
      out.write("                                                    <span class=\"new\">NEW</span>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"product-body\">\n");
      out.write("                                                <p class=\"product-category\">Category</p>\n");
      out.write("                                                <h3 class=\"product-name\"><a href=\"#\">product name goes here</a></h3>\n");
      out.write("                                                <h4 class=\"product-price\">$980.00 <del class=\"product-old-price\">$990.00</del></h4>\n");
      out.write("                                                <div class=\"product-rating\">\n");
      out.write("                                                    <i class=\"fa fa-star\"></i>\n");
      out.write("                                                    <i class=\"fa fa-star\"></i>\n");
      out.write("                                                    <i class=\"fa fa-star\"></i>\n");
      out.write("                                                    <i class=\"fa fa-star\"></i>\n");
      out.write("                                                    <i class=\"fa fa-star\"></i>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"product-btns\">\n");
      out.write("                                                    <button class=\"quick-view\"><i class=\"fa fa-eye\"></i><span class=\"tooltipp\">quick view</span></button>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"add-to-cart\">\n");
      out.write("                                                <button class=\"add-to-cart-btn\"><i class=\"fa fa-shopping-cart\"></i> add to cart</button>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <!-- /product -->\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <div id=\"slick-nav-2\" class=\"products-slick-nav\"></div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /tab -->\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /Products tab & slick -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /row -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /container -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /SECTION -->\n");
      out.write("\n");
      out.write("        <!-- SECTION -->\n");
      out.write("        <div class=\"section\">\n");
      out.write("            <!-- container -->\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <!-- row -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-4 col-xs-6\">\n");
      out.write("                        <div class=\"section-title\">\n");
      out.write("                            <h4 class=\"title\">Top selling</h4>\n");
      out.write("                            <div class=\"section-nav\">\n");
      out.write("                                <div id=\"slick-nav-3\" class=\"products-slick-nav\"></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"products-widget-slick\" data-nav=\"#slick-nav-3\">\n");
      out.write("                            <div>\n");
      out.write("                                <!-- product widget -->\n");
      out.write("                                <div class=\"product-widget\">\n");
      out.write("                                    <div class=\"product-img\">\n");
      out.write("                                        <img src=\"./img/product07.png\" alt=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"product-body\">\n");
      out.write("                                        <p class=\"product-category\">Category</p>\n");
      out.write("                                        <h3 class=\"product-name\"><a href=\"#\">product name goes here</a></h3>\n");
      out.write("                                        <h4 class=\"product-price\">$980.00 <del class=\"product-old-price\">$990.00</del></h4>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /product widget -->\n");
      out.write("\n");
      out.write("                                <!-- product widget -->\n");
      out.write("                                <div class=\"product-widget\">\n");
      out.write("                                    <div class=\"product-img\">\n");
      out.write("                                        <img src=\"./img/product08.png\" alt=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"product-body\">\n");
      out.write("                                        <p class=\"product-category\">Category</p>\n");
      out.write("                                        <h3 class=\"product-name\"><a href=\"#\">product name goes here</a></h3>\n");
      out.write("                                        <h4 class=\"product-price\">$980.00 <del class=\"product-old-price\">$990.00</del></h4>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /product widget -->\n");
      out.write("\n");
      out.write("                                <!-- product widget -->\n");
      out.write("                                <div class=\"product-widget\">\n");
      out.write("                                    <div class=\"product-img\">\n");
      out.write("                                        <img src=\"./img/product09.png\" alt=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"product-body\">\n");
      out.write("                                        <p class=\"product-category\">Category</p>\n");
      out.write("                                        <h3 class=\"product-name\"><a href=\"#\">product name goes here</a></h3>\n");
      out.write("                                        <h4 class=\"product-price\">$980.00 <del class=\"product-old-price\">$990.00</del></h4>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- product widget -->\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div>\n");
      out.write("                                <!-- product widget -->\n");
      out.write("                                <div class=\"product-widget\">\n");
      out.write("                                    <div class=\"product-img\">\n");
      out.write("                                        <img src=\"./img/product01.png\" alt=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"product-body\">\n");
      out.write("                                        <p class=\"product-category\">Category</p>\n");
      out.write("                                        <h3 class=\"product-name\"><a href=\"#\">product name goes here</a></h3>\n");
      out.write("                                        <h4 class=\"product-price\">$980.00 <del class=\"product-old-price\">$990.00</del></h4>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /product widget -->\n");
      out.write("\n");
      out.write("                                <!-- product widget -->\n");
      out.write("                                <div class=\"product-widget\">\n");
      out.write("                                    <div class=\"product-img\">\n");
      out.write("                                        <img src=\"./img/product02.png\" alt=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"product-body\">\n");
      out.write("                                        <p class=\"product-category\">Category</p>\n");
      out.write("                                        <h3 class=\"product-name\"><a href=\"#\">product name goes here</a></h3>\n");
      out.write("                                        <h4 class=\"product-price\">$980.00 <del class=\"product-old-price\">$990.00</del></h4>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /product widget -->\n");
      out.write("\n");
      out.write("                                <!-- product widget -->\n");
      out.write("                                <div class=\"product-widget\">\n");
      out.write("                                    <div class=\"product-img\">\n");
      out.write("                                        <img src=\"./img/product03.png\" alt=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"product-body\">\n");
      out.write("                                        <p class=\"product-category\">Category</p>\n");
      out.write("                                        <h3 class=\"product-name\"><a href=\"#\">product name goes here</a></h3>\n");
      out.write("                                        <h4 class=\"product-price\">$980.00 <del class=\"product-old-price\">$990.00</del></h4>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- product widget -->\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-4 col-xs-6\">\n");
      out.write("                        <div class=\"section-title\">\n");
      out.write("                            <h4 class=\"title\">Top selling</h4>\n");
      out.write("                            <div class=\"section-nav\">\n");
      out.write("                                <div id=\"slick-nav-4\" class=\"products-slick-nav\"></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"products-widget-slick\" data-nav=\"#slick-nav-4\">\n");
      out.write("                            <div>\n");
      out.write("                                <!-- product widget -->\n");
      out.write("                                <div class=\"product-widget\">\n");
      out.write("                                    <div class=\"product-img\">\n");
      out.write("                                        <img src=\"./img/product04.png\" alt=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"product-body\">\n");
      out.write("                                        <p class=\"product-category\">Category</p>\n");
      out.write("                                        <h3 class=\"product-name\"><a href=\"#\">product name goes here</a></h3>\n");
      out.write("                                        <h4 class=\"product-price\">$980.00 <del class=\"product-old-price\">$990.00</del></h4>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /product widget -->\n");
      out.write("\n");
      out.write("                                <!-- product widget -->\n");
      out.write("                                <div class=\"product-widget\">\n");
      out.write("                                    <div class=\"product-img\">\n");
      out.write("                                        <img src=\"./img/product05.png\" alt=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"product-body\">\n");
      out.write("                                        <p class=\"product-category\">Category</p>\n");
      out.write("                                        <h3 class=\"product-name\"><a href=\"#\">product name goes here</a></h3>\n");
      out.write("                                        <h4 class=\"product-price\">$980.00 <del class=\"product-old-price\">$990.00</del></h4>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /product widget -->\n");
      out.write("\n");
      out.write("                                <!-- product widget -->\n");
      out.write("                                <div class=\"product-widget\">\n");
      out.write("                                    <div class=\"product-img\">\n");
      out.write("                                        <img src=\"./img/product06.png\" alt=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"product-body\">\n");
      out.write("                                        <p class=\"product-category\">Category</p>\n");
      out.write("                                        <h3 class=\"product-name\"><a href=\"#\">product name goes here</a></h3>\n");
      out.write("                                        <h4 class=\"product-price\">$980.00 <del class=\"product-old-price\">$990.00</del></h4>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- product widget -->\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div>\n");
      out.write("                                <!-- product widget -->\n");
      out.write("                                <div class=\"product-widget\">\n");
      out.write("                                    <div class=\"product-img\">\n");
      out.write("                                        <img src=\"./img/product07.png\" alt=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"product-body\">\n");
      out.write("                                        <p class=\"product-category\">Category</p>\n");
      out.write("                                        <h3 class=\"product-name\"><a href=\"#\">product name goes here</a></h3>\n");
      out.write("                                        <h4 class=\"product-price\">$980.00 <del class=\"product-old-price\">$990.00</del></h4>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /product widget -->\n");
      out.write("\n");
      out.write("                                <!-- product widget -->\n");
      out.write("                                <div class=\"product-widget\">\n");
      out.write("                                    <div class=\"product-img\">\n");
      out.write("                                        <img src=\"./img/product08.png\" alt=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"product-body\">\n");
      out.write("                                        <p class=\"product-category\">Category</p>\n");
      out.write("                                        <h3 class=\"product-name\"><a href=\"#\">product name goes here</a></h3>\n");
      out.write("                                        <h4 class=\"product-price\">$980.00 <del class=\"product-old-price\">$990.00</del></h4>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /product widget -->\n");
      out.write("\n");
      out.write("                                <!-- product widget -->\n");
      out.write("                                <div class=\"product-widget\">\n");
      out.write("                                    <div class=\"product-img\">\n");
      out.write("                                        <img src=\"./img/product09.png\" alt=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"product-body\">\n");
      out.write("                                        <p class=\"product-category\">Category</p>\n");
      out.write("                                        <h3 class=\"product-name\"><a href=\"#\">product name goes here</a></h3>\n");
      out.write("                                        <h4 class=\"product-price\">$980.00 <del class=\"product-old-price\">$990.00</del></h4>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- product widget -->\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"clearfix visible-sm visible-xs\"></div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-4 col-xs-6\">\n");
      out.write("                        <div class=\"section-title\">\n");
      out.write("                            <h4 class=\"title\">Top selling</h4>\n");
      out.write("                            <div class=\"section-nav\">\n");
      out.write("                                <div id=\"slick-nav-5\" class=\"products-slick-nav\"></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"products-widget-slick\" data-nav=\"#slick-nav-5\">\n");
      out.write("                            <div>\n");
      out.write("                                <!-- product widget -->\n");
      out.write("                                <div class=\"product-widget\">\n");
      out.write("                                    <div class=\"product-img\">\n");
      out.write("                                        <img src=\"./img/product01.png\" alt=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"product-body\">\n");
      out.write("                                        <p class=\"product-category\">Category</p>\n");
      out.write("                                        <h3 class=\"product-name\"><a href=\"#\">product name goes here</a></h3>\n");
      out.write("                                        <h4 class=\"product-price\">$980.00 <del class=\"product-old-price\">$990.00</del></h4>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /product widget -->\n");
      out.write("\n");
      out.write("                                <!-- product widget -->\n");
      out.write("                                <div class=\"product-widget\">\n");
      out.write("                                    <div class=\"product-img\">\n");
      out.write("                                        <img src=\"./img/product02.png\" alt=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"product-body\">\n");
      out.write("                                        <p class=\"product-category\">Category</p>\n");
      out.write("                                        <h3 class=\"product-name\"><a href=\"#\">product name goes here</a></h3>\n");
      out.write("                                        <h4 class=\"product-price\">$980.00 <del class=\"product-old-price\">$990.00</del></h4>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /product widget -->\n");
      out.write("\n");
      out.write("                                <!-- product widget -->\n");
      out.write("                                <div class=\"product-widget\">\n");
      out.write("                                    <div class=\"product-img\">\n");
      out.write("                                        <img src=\"./img/product03.png\" alt=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"product-body\">\n");
      out.write("                                        <p class=\"product-category\">Category</p>\n");
      out.write("                                        <h3 class=\"product-name\"><a href=\"#\">product name goes here</a></h3>\n");
      out.write("                                        <h4 class=\"product-price\">$980.00 <del class=\"product-old-price\">$990.00</del></h4>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- product widget -->\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div>\n");
      out.write("                                <!-- product widget -->\n");
      out.write("                                <div class=\"product-widget\">\n");
      out.write("                                    <div class=\"product-img\">\n");
      out.write("                                        <img src=\"./img/product04.png\" alt=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"product-body\">\n");
      out.write("                                        <p class=\"product-category\">Category</p>\n");
      out.write("                                        <h3 class=\"product-name\"><a href=\"#\">product name goes here</a></h3>\n");
      out.write("                                        <h4 class=\"product-price\">$980.00 <del class=\"product-old-price\">$990.00</del></h4>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /product widget -->\n");
      out.write("\n");
      out.write("                                <!-- product widget -->\n");
      out.write("                                <div class=\"product-widget\">\n");
      out.write("                                    <div class=\"product-img\">\n");
      out.write("                                        <img src=\"./img/product05.png\" alt=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"product-body\">\n");
      out.write("                                        <p class=\"product-category\">Category</p>\n");
      out.write("                                        <h3 class=\"product-name\"><a href=\"#\">product name goes here</a></h3>\n");
      out.write("                                        <h4 class=\"product-price\">$980.00 <del class=\"product-old-price\">$990.00</del></h4>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /product widget -->\n");
      out.write("\n");
      out.write("                                <!-- product widget -->\n");
      out.write("                                <div class=\"product-widget\">\n");
      out.write("                                    <div class=\"product-img\">\n");
      out.write("                                        <img src=\"./img/product06.png\" alt=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"product-body\">\n");
      out.write("                                        <p class=\"product-category\">Category</p>\n");
      out.write("                                        <h3 class=\"product-name\"><a href=\"#\">product name goes here</a></h3>\n");
      out.write("                                        <h4 class=\"product-price\">$980.00 <del class=\"product-old-price\">$990.00</del></h4>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- product widget -->\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- /row -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /container -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /SECTION -->\n");
      out.write("\n");
      out.write("        <!-- NEWSLETTER -->\n");
      out.write("        <div id=\"newsletter\" class=\"section\">\n");
      out.write("            <!-- container -->\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <!-- row -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"newsletter\">\n");
      out.write("                            <p>Sign Up for the <strong>NEWSLETTER</strong></p>\n");
      out.write("                            <form>\n");
      out.write("                                <input class=\"input\" type=\"email\" placeholder=\"Enter Your Email\">\n");
      out.write("                                <button class=\"newsletter-btn\"><i class=\"fa fa-envelope\"></i> Subscribe</button>\n");
      out.write("                            </form>\n");
      out.write("                            <ul class=\"newsletter-follow\">\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-instagram\"></i></a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-pinterest\"></i></a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- /row -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /container -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /NEWSLETTER -->\n");
      out.write("\n");
      out.write("        <!-- FOOTER -->\n");
      out.write("        <footer id=\"footer\">\n");
      out.write("            <!-- top footer -->\n");
      out.write("            <div class=\"section\">\n");
      out.write("                <!-- container -->\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <!-- row -->\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-3 col-xs-6\">\n");
      out.write("                            <div class=\"footer\">\n");
      out.write("                                <h3 class=\"footer-title\">About Us</h3>\n");
      out.write("                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut.</p>\n");
      out.write("                                <ul class=\"footer-links\">\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-map-marker\"></i>1734 Stonecoal Road</a></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-phone\"></i>+021-95-51-84</a></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-envelope-o\"></i>email@email.com</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-md-3 col-xs-6\">\n");
      out.write("                            <div class=\"footer\">\n");
      out.write("                                <h3 class=\"footer-title\">Categories</h3>\n");
      out.write("                                <ul class=\"footer-links\">\n");
      out.write("                                    <li><a href=\"#\">Hot deals</a></li>\n");
      out.write("                                    <li><a href=\"#\">Laptops</a></li>\n");
      out.write("                                    <li><a href=\"#\">Smartphones</a></li>\n");
      out.write("                                    <li><a href=\"#\">Cameras</a></li>\n");
      out.write("                                    <li><a href=\"#\">Accessories</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"clearfix visible-xs\"></div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-md-3 col-xs-6\">\n");
      out.write("                            <div class=\"footer\">\n");
      out.write("                                <h3 class=\"footer-title\">Information</h3>\n");
      out.write("                                <ul class=\"footer-links\">\n");
      out.write("                                    <li><a href=\"#\">About Us</a></li>\n");
      out.write("                                    <li><a href=\"#\">Contact Us</a></li>\n");
      out.write("                                    <li><a href=\"#\">Privacy Policy</a></li>\n");
      out.write("                                    <li><a href=\"#\">Orders and Returns</a></li>\n");
      out.write("                                    <li><a href=\"#\">Terms & Conditions</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-md-3 col-xs-6\">\n");
      out.write("                            <div class=\"footer\">\n");
      out.write("                                <h3 class=\"footer-title\">Service</h3>\n");
      out.write("                                <ul class=\"footer-links\">\n");
      out.write("                                    <li><a href=\"#\">My Account</a></li>\n");
      out.write("                                    <li><a href=\"#\">View Cart</a></li>\n");
      out.write("                                    <li><a href=\"#\">Wishlist</a></li>\n");
      out.write("                                    <li><a href=\"#\">Track My Order</a></li>\n");
      out.write("                                    <li><a href=\"#\">Help</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /row -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /container -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /top footer -->\n");
      out.write("\n");
      out.write("            <!-- bottom footer -->\n");
      out.write("            <div id=\"bottom-footer\" class=\"section\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <!-- row -->\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12 text-center\">\n");
      out.write("                            <ul class=\"footer-payments\">\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-cc-visa\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-credit-card\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-cc-paypal\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-cc-mastercard\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-cc-discover\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-cc-amex\"></i></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                            <span class=\"copyright\">\n");
      out.write("                                <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("                                Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class=\"fa fa-heart-o\" aria-hidden=\"true\"></i> by <a href=\"https://colorlib.com\" target=\"_blank\">Colorlib</a>\n");
      out.write("                                <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("                            </span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /row -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /container -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /bottom footer -->\n");
      out.write("        </footer>\n");
      out.write("        <!-- /FOOTER -->\n");
      out.write("\n");
      out.write("        <!-- jQuery Plugins -->\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/slick.min.js\"></script>\n");
      out.write("        <script src=\"js/nouislider.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.zoom.min.js\"></script>\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.USER != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <li><i class=\"fa fa-user-o\"></i>Welcome: ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.USER.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</li>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.USER == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <!-- LOGIN -->\n");
        out.write("                            ");
        if (_jspx_meth_c_url_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            <li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${login}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"><i class=\"fa fa-user-o\"></i>Login</a></li>\n");
        out.write("                                 <!-- REGISTER -->\n");
        out.write("                                ");
        if (_jspx_meth_c_url_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            <li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${register}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"><i class=\"fa fa-user-o\"></i>Register</a></li>  \n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_url_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_url_0.setVar("login");
    _jspx_th_c_url_0.setValue("MainController");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_eval_c_url_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_url_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_c_url_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_url_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_c_param_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_url_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_url_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_param_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_0 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_0.setPageContext(_jspx_page_context);
    _jspx_th_c_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_0);
    _jspx_th_c_param_0.setName("action");
    _jspx_th_c_param_0.setValue("Login");
    int _jspx_eval_c_param_0 = _jspx_th_c_param_0.doStartTag();
    if (_jspx_th_c_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_0);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_0);
    return false;
  }

  private boolean _jspx_meth_c_url_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_1.setPageContext(_jspx_page_context);
    _jspx_th_c_url_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_url_1.setVar("register");
    _jspx_th_c_url_1.setValue("MainController");
    int _jspx_eval_c_url_1 = _jspx_th_c_url_1.doStartTag();
    if (_jspx_eval_c_url_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_url_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_c_url_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_url_1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                    ");
        if (_jspx_meth_c_param_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_url_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_url_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_c_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_1);
      return true;
    }
    _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_1);
    return false;
  }

  private boolean _jspx_meth_c_param_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_1 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_1.setPageContext(_jspx_page_context);
    _jspx_th_c_param_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_1);
    _jspx_th_c_param_1.setName("action");
    _jspx_th_c_param_1.setValue("Register");
    int _jspx_eval_c_param_1 = _jspx_th_c_param_1.doStartTag();
    if (_jspx_th_c_param_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_1);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.USER != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <!-- LOGOUT AND VIEW HISTORY CHECK-->\n");
        out.write("                            ");
        if (_jspx_meth_c_url_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            <li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${logout}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"><i class=\"fa fa-user-o\"></i>Logout</a></li>\n");
        out.write("                            <!-- VIEW HISTORY -->\n");
        out.write("                            ");
        if (_jspx_meth_c_url_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            <li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${history}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"><i class=\"fa fa-user-o\"></i>History</a></li>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_url_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_2.setPageContext(_jspx_page_context);
    _jspx_th_c_url_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
    _jspx_th_c_url_2.setVar("logout");
    _jspx_th_c_url_2.setValue("MainController");
    int _jspx_eval_c_url_2 = _jspx_th_c_url_2.doStartTag();
    if (_jspx_eval_c_url_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_url_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_c_url_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_url_2.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_c_param_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_url_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_url_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_c_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_2);
      return true;
    }
    _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_2);
    return false;
  }

  private boolean _jspx_meth_c_param_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_2 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_2.setPageContext(_jspx_page_context);
    _jspx_th_c_param_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_2);
    _jspx_th_c_param_2.setName("action");
    _jspx_th_c_param_2.setValue("Logout");
    int _jspx_eval_c_param_2 = _jspx_th_c_param_2.doStartTag();
    if (_jspx_th_c_param_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_2);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_2);
    return false;
  }

  private boolean _jspx_meth_c_url_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_3.setPageContext(_jspx_page_context);
    _jspx_th_c_url_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
    _jspx_th_c_url_3.setVar("history");
    _jspx_th_c_url_3.setValue("MainController");
    int _jspx_eval_c_url_3 = _jspx_th_c_url_3.doStartTag();
    if (_jspx_eval_c_url_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_url_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_c_url_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_url_3.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_c_param_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_url_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_url_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_c_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_3);
      return true;
    }
    _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_3);
    return false;
  }

  private boolean _jspx_meth_c_param_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_3 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_3.setPageContext(_jspx_page_context);
    _jspx_th_c_param_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_3);
    _jspx_th_c_param_3.setName("action");
    _jspx_th_c_param_3.setValue("History");
    int _jspx_eval_c_param_3 = _jspx_th_c_param_3.doStartTag();
    if (_jspx_th_c_param_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_3);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_3);
    return false;
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("totalQuantity");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${0}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_set_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent(null);
    _jspx_th_c_set_1.setVar("total");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${0}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.CART.getCart().values() != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_c_forEach_0.setVar("bookInCart");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.CART.getCart().values()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                ");
          if (_jspx_meth_c_set_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                                <div class=\"qty\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalQuantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>\n");
          out.write("                                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_set_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_2.setVar("totalQuantity");
    _jspx_th_c_set_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalQuantity + bookInCart.quantity}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
    return false;
  }

  private boolean _jspx_meth_c_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(null);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.CART != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("                                    \n");
        out.write("                                                ");
        if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_4, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_4);
    _jspx_th_c_forEach_1.setVar("bookInCart");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.CART.getCart().values()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                    ");
          if (_jspx_meth_c_set_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\n");
          out.write("                                                    <div class=\"product-widget\">\n");
          out.write("                                                        <div class=\"product-img\">\n");
          out.write("                                                            <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bookInCart.bookImage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\">\n");
          out.write("                                                        </div>\n");
          out.write("                                                        <div class=\"product-body\">\n");
          out.write("                                                            <h3 class=\"product-name\"><a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bookInCart.bookTitle}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h3>\n");
          out.write("                                                            <h4 class=\"product-price\"><span class=\"qty\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bookInCart.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("x</span>$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bookInCart.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4>\n");
          out.write("                                                        </div>\n");
          out.write("                                                        <form action=\"MainController\">\n");
          out.write("                                                            <input type=\"hidden\" name=\"bookID\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bookInCart.bookID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                                            <input type=\"hidden\" name=\"page\" value=\"shopping\">\n");
          out.write("                                                            <button type=\"submit\" name=\"action\" value=\"DeleteBookInCart\" class=\"delete\" \n");
          out.write("                                                                    onclick=\"return confirm('Are you sure you want to delete this book from cart?');\"><i class=\"fa fa-close\"></i></button>\n");
          out.write("                                                        </form>                                                        \n");
          out.write("                                                    </div>\n");
          out.write("                                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_set_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_3 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_3.setPageContext(_jspx_page_context);
    _jspx_th_c_set_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_set_3.setVar("total");
    _jspx_th_c_set_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total + bookInCart.price* bookInCart.quantity}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_3 = _jspx_th_c_set_3.doStartTag();
    if (_jspx_th_c_set_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setVar("book");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.BOOK_LIST}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <!-- product -->\n");
          out.write("                                            <div class=\"product\">\n");
          out.write("                                                <div class=\"product-img\">\n");
          out.write("                                                    <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.bookImage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\">\n");
          out.write("                                                    <div class=\"product-label\">\n");
          out.write("                                                        <span class=\"new\">NEW</span>\n");
          out.write("                                                    </div>\n");
          out.write("                                                </div>\n");
          out.write("                                                <div class=\"product-body\">\n");
          out.write("                                                    <p class=\"product-category\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.categoryID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                                    <h3 class=\"product-name\"><a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.bookTitle}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h3>\n");
          out.write("                                                    <h4 class=\"product-price\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4>\n");
          out.write("                                                    <div class=\"product-rating\">\n");
          out.write("                                                        <i class=\"fa fa-star\"></i>\n");
          out.write("                                                        <i class=\"fa fa-star\"></i>\n");
          out.write("                                                        <i class=\"fa fa-star\"></i>\n");
          out.write("                                                        <i class=\"fa fa-star\"></i>\n");
          out.write("                                                        <i class=\"fa fa-star\"></i>\n");
          out.write("                                                    </div>\n");
          out.write("                                                    <div class=\"product-btns\">\n");
          out.write("                                                        ");
          if (_jspx_meth_c_url_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("                                                      \n");
          out.write("                                                        <a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${viewDetail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                                            <button class=\"quick-view\"><i class=\"fa fa-eye\"></i><span class=\"tooltipp\">View Detail</span></button>\n");
          out.write("                                                        </a>\n");
          out.write("                                                    </div>\n");
          out.write("                                                </div>\n");
          out.write("                                                <div class=\"add-to-cart\">\n");
          out.write("                                                    ");
          if (_jspx_meth_c_url_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\n");
          out.write("                                                    <a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${addToCart}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                                        <button class=\"add-to-cart-btn\"><i class=\"fa fa-shopping-cart\"></i> add to cart</button>\n");
          out.write("                                                    </a>\n");
          out.write("                                                </div>\n");
          out.write("                                            </div>\n");
          out.write("                                            <!-- /product -->\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_url_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_4.setPageContext(_jspx_page_context);
    _jspx_th_c_url_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_url_4.setVar("viewDetail");
    _jspx_th_c_url_4.setValue("MainController");
    int _jspx_eval_c_url_4 = _jspx_th_c_url_4.doStartTag();
    if (_jspx_eval_c_url_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_url_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_2[0]++;
        _jspx_th_c_url_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_url_4.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                                            ");
        if (_jspx_meth_c_param_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_4, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("\n");
        out.write("                                                            ");
        if (_jspx_meth_c_param_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_4, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("\n");
        out.write("                                                            ");
        if (_jspx_meth_c_param_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_4, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("\n");
        out.write("                                                            ");
        if (_jspx_meth_c_param_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_4, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("\n");
        out.write("                                                            ");
        if (_jspx_meth_c_param_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_4, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("\n");
        out.write("                                                            ");
        if (_jspx_meth_c_param_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_4, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("\n");
        out.write("                                                            ");
        if (_jspx_meth_c_param_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_4, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("\n");
        out.write("                                                            ");
        if (_jspx_meth_c_param_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_4, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("\n");
        out.write("                                                            ");
        if (_jspx_meth_c_param_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_4, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("    \n");
        out.write("                                                            ");
        if (_jspx_meth_c_param_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_4, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write(" \n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_url_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_url_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_2[0]--;
    }
    if (_jspx_th_c_url_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_4);
      return true;
    }
    _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_4);
    return false;
  }

  private boolean _jspx_meth_c_param_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_4 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_4.setPageContext(_jspx_page_context);
    _jspx_th_c_param_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_4);
    _jspx_th_c_param_4.setName("action");
    _jspx_th_c_param_4.setValue("ViewDetail");
    int _jspx_eval_c_param_4 = _jspx_th_c_param_4.doStartTag();
    if (_jspx_th_c_param_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_4);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_4);
    return false;
  }

  private boolean _jspx_meth_c_param_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_5 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_5.setPageContext(_jspx_page_context);
    _jspx_th_c_param_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_4);
    _jspx_th_c_param_5.setName("bookID");
    _jspx_th_c_param_5.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.bookID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_5 = _jspx_th_c_param_5.doStartTag();
    if (_jspx_th_c_param_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_5);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_5);
    return false;
  }

  private boolean _jspx_meth_c_param_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_6 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_6.setPageContext(_jspx_page_context);
    _jspx_th_c_param_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_4);
    _jspx_th_c_param_6.setName("bookTitle");
    _jspx_th_c_param_6.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.bookTitle}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_6 = _jspx_th_c_param_6.doStartTag();
    if (_jspx_th_c_param_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_6);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_6);
    return false;
  }

  private boolean _jspx_meth_c_param_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_7 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_7.setPageContext(_jspx_page_context);
    _jspx_th_c_param_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_4);
    _jspx_th_c_param_7.setName("bookImage");
    _jspx_th_c_param_7.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.bookImage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_7 = _jspx_th_c_param_7.doStartTag();
    if (_jspx_th_c_param_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_7);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_7);
    return false;
  }

  private boolean _jspx_meth_c_param_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_8 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_8.setPageContext(_jspx_page_context);
    _jspx_th_c_param_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_4);
    _jspx_th_c_param_8.setName("description");
    _jspx_th_c_param_8.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_8 = _jspx_th_c_param_8.doStartTag();
    if (_jspx_th_c_param_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_8);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_8);
    return false;
  }

  private boolean _jspx_meth_c_param_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_9 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_9.setPageContext(_jspx_page_context);
    _jspx_th_c_param_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_4);
    _jspx_th_c_param_9.setName("price");
    _jspx_th_c_param_9.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_9 = _jspx_th_c_param_9.doStartTag();
    if (_jspx_th_c_param_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_9);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_9);
    return false;
  }

  private boolean _jspx_meth_c_param_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_10 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_10.setPageContext(_jspx_page_context);
    _jspx_th_c_param_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_4);
    _jspx_th_c_param_10.setName("quantity");
    _jspx_th_c_param_10.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_10 = _jspx_th_c_param_10.doStartTag();
    if (_jspx_th_c_param_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_10);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_10);
    return false;
  }

  private boolean _jspx_meth_c_param_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_11 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_11.setPageContext(_jspx_page_context);
    _jspx_th_c_param_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_4);
    _jspx_th_c_param_11.setName("author");
    _jspx_th_c_param_11.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.author}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_11 = _jspx_th_c_param_11.doStartTag();
    if (_jspx_th_c_param_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_11);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_11);
    return false;
  }

  private boolean _jspx_meth_c_param_12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_12 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_12.setPageContext(_jspx_page_context);
    _jspx_th_c_param_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_4);
    _jspx_th_c_param_12.setName("createDate");
    _jspx_th_c_param_12.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.createDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_12 = _jspx_th_c_param_12.doStartTag();
    if (_jspx_th_c_param_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_12);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_12);
    return false;
  }

  private boolean _jspx_meth_c_param_13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_13 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_13.setPageContext(_jspx_page_context);
    _jspx_th_c_param_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_4);
    _jspx_th_c_param_13.setName("categoryID");
    _jspx_th_c_param_13.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.categoryID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_13 = _jspx_th_c_param_13.doStartTag();
    if (_jspx_th_c_param_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_13);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_13);
    return false;
  }

  private boolean _jspx_meth_c_url_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_5.setPageContext(_jspx_page_context);
    _jspx_th_c_url_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_url_5.setVar("addToCart");
    _jspx_th_c_url_5.setValue("MainController");
    int _jspx_eval_c_url_5 = _jspx_th_c_url_5.doStartTag();
    if (_jspx_eval_c_url_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_url_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_2[0]++;
        _jspx_th_c_url_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_url_5.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                                        ");
        if (_jspx_meth_c_param_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_5, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("\n");
        out.write("                                                        ");
        if (_jspx_meth_c_param_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_5, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("\n");
        out.write("                                                        ");
        if (_jspx_meth_c_param_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_5, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("\n");
        out.write("                                                        ");
        if (_jspx_meth_c_param_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_5, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("\n");
        out.write("                                                        ");
        if (_jspx_meth_c_param_18((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_5, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("\n");
        out.write("                                                        ");
        if (_jspx_meth_c_param_19((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_5, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("  \n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_url_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_url_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_2[0]--;
    }
    if (_jspx_th_c_url_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_5);
      return true;
    }
    _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_5);
    return false;
  }

  private boolean _jspx_meth_c_param_14(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_14 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_14.setPageContext(_jspx_page_context);
    _jspx_th_c_param_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_5);
    _jspx_th_c_param_14.setName("action");
    _jspx_th_c_param_14.setValue("AddToCart");
    int _jspx_eval_c_param_14 = _jspx_th_c_param_14.doStartTag();
    if (_jspx_th_c_param_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_14);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_14);
    return false;
  }

  private boolean _jspx_meth_c_param_15(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_15 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_15.setPageContext(_jspx_page_context);
    _jspx_th_c_param_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_5);
    _jspx_th_c_param_15.setName("bookID");
    _jspx_th_c_param_15.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.bookID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_15 = _jspx_th_c_param_15.doStartTag();
    if (_jspx_th_c_param_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_15);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_15);
    return false;
  }

  private boolean _jspx_meth_c_param_16(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_16 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_16.setPageContext(_jspx_page_context);
    _jspx_th_c_param_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_5);
    _jspx_th_c_param_16.setName("bookTitle");
    _jspx_th_c_param_16.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.bookTitle}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_16 = _jspx_th_c_param_16.doStartTag();
    if (_jspx_th_c_param_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_16);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_16);
    return false;
  }

  private boolean _jspx_meth_c_param_17(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_17 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_17.setPageContext(_jspx_page_context);
    _jspx_th_c_param_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_5);
    _jspx_th_c_param_17.setName("bookImage");
    _jspx_th_c_param_17.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.bookImage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_17 = _jspx_th_c_param_17.doStartTag();
    if (_jspx_th_c_param_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_17);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_17);
    return false;
  }

  private boolean _jspx_meth_c_param_18(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_18 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_18.setPageContext(_jspx_page_context);
    _jspx_th_c_param_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_5);
    _jspx_th_c_param_18.setName("price");
    _jspx_th_c_param_18.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_18 = _jspx_th_c_param_18.doStartTag();
    if (_jspx_th_c_param_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_18);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_18);
    return false;
  }

  private boolean _jspx_meth_c_param_19(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_19 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_19.setPageContext(_jspx_page_context);
    _jspx_th_c_param_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_5);
    _jspx_th_c_param_19.setName("quantity");
    _jspx_th_c_param_19.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_19 = _jspx_th_c_param_19.doStartTag();
    if (_jspx_th_c_param_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_19);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_19);
    return false;
  }
}
