<%-- 
    Document   : updatePage
    Created on : Jun 18, 2021, 5:21:23 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Page</title>
        <script>
            function myFunction() {
                var x = document.getElementById("textArea").value;
                document.getElementById("description").value = x;
            }
        </script>

    </head>
    <body>
        <form action="MainController">
            Book ID <input type="text" name="bookID" value="${param.bookID}" readonly="true"/><br/>
            Book Title <input type="text" name="bookTitle" value="${param.bookTitle}" required="true"/><br/>
            Book Image <input type="text" name="bookImage" value="${param.bookImage}" required="true"/><br/>
                    
            Description: <br/>
            <textarea id="textArea" required="true" rows="6" cols="60" onkeyup="myFunction()" onclick="myFunction()">${param.description}</textarea><br/>   
            <input type="hidden" id="description" name="description"><br/>   
            
            Price <input type="text" name="price" value="${param.price}" required="true"/><br/>
            Quantity <input type="text" name="quantity" value="${param.quantity}" required="true"/><br/>
            Author <input type="text" name="author" value="${param.author}" required="true"/><br/>
            Category ID <input type="text" name="categoryID" value="${param.categoryID}" required="true"/><br/>
            <input type="hidden" name="search" value="${param.search}"/><br/>
            <input type="submit" name="action" value="Confirm" onclick="myFunction()"/>
        </form>
        <a href="SearchBookController">Cancel</a>
    </body>
</html>