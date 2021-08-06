<%-- 
    Document   : registerPage
    Created on : Jun 19, 2021, 6:38:09 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link rel="stylesheet" type="text/css" href="css/register.css">
    </head>
    <body>
        <div class="container register">

            <form action="MainController" method="POST">
                <div class="row">
                    <div class="col-md-3 register-left">
                        <img src="https://image.ibb.co/n7oTvU/logo_white.png" alt=""/>
                        <h3>Welcome</h3>
                        <p>You are 30 seconds away from earning your own money!</p>
                        <input type="submit" name="action" value="Back To Login Page"/><br/>
                    </div>
                    <div class="col-md-9 register-right">
                        <div class="tab-content" id="myTabContent">
                            <div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">
                                <h3 class="register-heading">Register Your Account </h3>
                                <div class="row register-form">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <input type="text" name="userID" class="form-control" placeholder="User ID"  />
                                            ${requestScope.ERROR.userIDError}
                                        </div>
                                        <div class="form-group">
                                            <input type="password" name="password" class="form-control" placeholder="Password"  />
                                            ${requestScope.ERROR.passwordError}
                                        </div>
                                        <div class="form-group">
                                            <input type="password" name="confirm" class="form-control"  placeholder="Confirm Password"  />
                                            ${requestScope.ERROR.confirmError}
                                        </div>
                                        <div class="form-group">
                                            <input type="text" name="userName" class="form-control" placeholder="User Name"  />
                                            ${requestScope.ERROR.userNameError}
                                        </div>
                                        <div class="form-group">
                                            <div class="maxl">
                                                <label class="radio inline"> 
                                                    <input type="radio" name="gender" value="Male" checked>
                                                    <span> Male </span> 
                                                </label>
                                                <label class="radio inline"> 
                                                    <input type="radio" name="gender" value="Female">
                                                    <span>Female </span> 
                                                </label>
                                                 ${requestScope.ERROR.genderError}
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <input type="email" name="email" class="form-control" placeholder="Your Email" value="" />
                                            ${requestScope.ERROR.emailError}
                                        </div>
                                        <div class="form-group">
                                            <input type="text" name="address" class="form-control" placeholder="Address" value="" />
                                            ${requestScope.ERROR.addressError}
                                        </div>
                                        <div class="form-group">
                                            <input type="text" name="phone" minlength="10" maxlength="10" class="form-control" placeholder="Your Phone Number" value="" />
                                            ${requestScope.ERROR.phoneError}
                                        </div>
                                        <div class="form-group">
                                            <input type="text" name="avatar" class="form-control" placeholder="Copy Your Image Link Here" value="" />
                                            ${requestScope.ERROR.avatarError}
                                        </div>
                                        <input type="submit" class="btnRegister" name="action" value="Finish"/>                                       
                                    </div>           
                                </div>
                                        <h4> ${requestScope.MSG}</h4>
                            </div>
                        </div>
                    </div>
                </div>
            </form>

        </div>
    </body>
</html>
