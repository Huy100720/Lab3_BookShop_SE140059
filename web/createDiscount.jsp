<%-- 
    Document   : createDiscount
    Created on : Jun 26, 2021, 6:43:54 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Discount Page</title>
    </head>
    <body>
        <form action="MainController">
            Discount ID <input type="text" name="discountID" placeholder="Discount ID"/>
            ${requestScope.ERROR.discountIDError}<br/>
            Discount Percent <input type="number" name="discPercent" placeholder="Discount Percent" />
            ${requestScope.ERROR.discountPercentError}<br/>
            <input type="submit" name="action" value="Create Discount"/>
        </form>
    </body>
</html>
