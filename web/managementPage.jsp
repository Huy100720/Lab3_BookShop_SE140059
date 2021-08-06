<%-- 
    Document   : bookManagement
    Created on : Jun 14, 2021, 3:57:20 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Management Page </title>
        <link rel="stylesheet" href="css/managementPage.css">
    </head>
    <body>
        <header>
            <h1>Management Book</h1>
            <c:if test="${sessionScope.USER == null}">
                <nav>
                    <a href="login.jsp">Login</a> 
                    <a href="register.jsp">Register</a>
                </nav>
            </c:if>


            <c:if test="${sessionScope.USER != null}">
                <h3> Welcome: ${sessionScope.USER.userName}</h3>
                
                <nav>
                    <c:url var="logout" value="MainController">   
                        <c:param name="action" value="Logout"></c:param> 
                    </c:url>
                    <a href="${logout}">Logout</a> 
                    <a href="createBookPage.jsp">Create New Product</a>       
                    <a href="createDiscount.jsp">Create Discount</a>
                </nav>
                    
            </c:if>
        </header>


        <form action="MainController">
            Search Phone<input type="text" name="bookTitleSearch" value="${param.bookTitleSearch}"/>
            <input type="submit" name="action" value="Search Book"/>
        </form>

        <c:if test="${requestScope.MSG !=null}">
            <h4> ${requestScope.MSG}</h4>
        </c:if>    

        <c:if test="${requestScope.BOOK_LIST != null }">
            <c:if test="${not empty requestScope.BOOK_LIST}">
                <table border ="1" >                      
                    <tr>
                        <th>Book Id</th>
                        <th>Book Title</th>
                        <th>Book Image</th>
                        <th>description</th>
                        <th>price</th>
                        <th>quantity</th>
                        <th>author</th>
                        <th>create Date</th>
                        <th>category ID</th>
                        <th>Status</th>
                        <th>Delete</th> 
                        <th>Update</th>
                    </tr>
                    <c:forEach var="book" items="${requestScope.BOOK_LIST}">
                        <form action="MainController">                            
                            <tr>                               
                                <td>${book.bookID}</td>
                                <td>${book.bookTitle}</td>
                                <td>
                                    <img src="img/${book.bookImage}" alt="hinh anh 2">
                                </td>
                                <td>${book.description}</td>
                                <td>${book.price}</td>
                                <td>${book.quantity}</td>
                                <td>${book.author}</td> 
                                <td>${book.createDate}</td> 
                                <td>${book.categoryID}</td> 
                                <td>${book.bookStatus}</td> 
                                <td>
                                    <c:url var="delete" value="MainController">
                                        <c:param name="action" value="Delete"></c:param>                                      
                                        <c:param name="search" value="${param.search}"></c:param>
                                        <c:param name="bookID" value="${book.bookID}"></c:param> 
                                    </c:url>
                                    <a href="${delete}" onclick="return confirm('Are you sure you want to delete this item?');">Delete</a>                                   
                                </td>
                                <td>
                                    <c:url var="update" value="MainController">
                                        <c:param name="action" value="Update Book"></c:param>
                                        <c:param name="search" value="${param.seacrh}}"></c:param> 
                                        <c:param name="bookID" value="${book.bookID}"></c:param>
                                        <c:param name="bookTitle" value="${book.bookTitle}"></c:param>
                                        <c:param name="bookImage" value="${book.bookImage}"></c:param>
                                        <c:param name="description" value="${book.description}"></c:param>
                                        <c:param name="price" value="${book.price}"></c:param>
                                        <c:param name="quantity" value="${book.quantity}"></c:param>
                                        <c:param name="author" value="${book.author}"></c:param>  
                                        <c:param name="categoryID" value="${book.categoryID}"></c:param> 
                                    </c:url>
                                    <a href="${update}">Update</a>
                                </td>
                            </tr>
                        </form>
                    </c:forEach>

                </table>
            </c:if>
        </c:if>



    </body>
</html>