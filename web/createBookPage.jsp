<%-- 
    Document   : createBookPage
    Created on : Jun 19, 2021, 5:58:47 PM
    Author     : Admin
--%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Book Page</title>
                <script>
            function myFunction() {
                var x = document.getElementById("textArea").value;
                document.getElementById("description").value = x;
            }
        </script>
    </head>
    <body>
        <form action="AddNewBookController" method="POST" enctype="multipart/form-data">
            Book ID <input type="text" name="bookID" required="true"/><br/>
            ${requestScope.ERROR.bookIDError}<br/>
            
            Book Title <input type="text" name="bookTitle" required="true"/><br/>
            ${requestScope.ERROR.bookTitleError}<br/>
            
            Book Image <input type="file" name="bookImage" required="true"/><br/>
            ${requestScope.ERROR.bookImageError}<br/>           
            
            Description: <br/>
            <textarea id="textArea" required="true" rows="6" cols="60" onkeyup="myFunction()" onclick="myFunction()">${param.description}</textarea><br/>   
            <input type="hidden" id="description" name="description"><br/>
            ${requestScope.ERROR.descriptionError}<br/>
            
            Price <input type="text" name="price" required="true"/><br/>
            ${requestScope.ERROR.priceError}<br/>
            
            Quantity <input type="text" name="quantity" required="true"/><br/>
            ${requestScope.ERROR.quantityError}<br/>
            
            Author <input type="text" name="author" required="true"/><br/>
            ${requestScope.ERROR.authorError}<br/>
            
            Category ID <input type="text" name="categoryID" required="true"/><br/>
            ${requestScope.ERROR.categoryIDError}<br/>   
            
            <input type="submit" value="Create Book" onclick="myFunction()"/>
            <input type="reset" value="Reset"/>
        </form>
    </body>
</html>
