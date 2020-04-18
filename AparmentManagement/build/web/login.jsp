  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- 
    Document   : Login
    Created on : 16 Feb, 2020, 9:37:20 PM
    Author     : av
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <link  rel="stylesheet" href="css/main.css">
  <link rel="stylesheet" href="css/header.css">
  
  
    </head>
    <body>
           <div class="container-fluid login">
               <div class="row">
                   <div class="header">
                       <jsp:include page="header.jsp"></jsp:include>
                   </div>
               </div>
               
               <% 
                   String status = (String)request.getAttribute("STATUS");
                   System.out.println("status "+status);
               %>
               <c:set var="status" value="<%=status %>" />
               
            
               <c:if test="${( status == 'FAILED')}">
                    <div class="alert alert-danger alert-dismissible">
                        <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                        <strong>Wrong Credential try again !!!</strong>
                    </div>
               </c:if>
               <c:if test="${( status == 'SUCCESS')}">
                    <div class="alert alert-success alert-dismissible">
                        <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                        <strong>Successfully register please log in to continue </strong>
                    </div>
               </c:if>
              
               <div class="row">
                   <div class="col-md-4"></div>
                   <div class="col-md-8 login-right">
                    <div class="login-right-child-div col-md-12">
                     <ul class="nav nav-tabs" >
                            <li class="nav-item">
                                <a class="nav-link"   href="#home" >Back</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link"   href="#home" >LogOut</a>
                            </li>
                        </ul>
                   
                       <div class="col-md-12">
                       <form id="log" action="apartmentUrl" method="POST" enctype="multipart">
                            <input type="hidden" name="CMD" value="login_form">
                           <h1>Login Form</h1>
                           <div class="form-group">
                               <label>Email</label>
                               <input type="email" class="form-control" name="email" placeholder="Enter Email">
                           </div>
                           
                           <div class="form-group">
                               <label>Password</label>
                               <input type="password" class="form-control" name="pwd" placeholder="Enter password">
                           </div>
                           <div class="checkbox">
                               <label><input type="checkbox">Remember Me</label>
                           </div>
                           <div class="row">                   
                                <div class="col-md-2">
                                    <input type="submit" value="Save" class="btn btn-primary">
                                </div> 
                               <div class="col-md-5">
                                   <label><a  class="nav-link" href="#">Forget your password</a></label>
                               </div>
                           </div>
                          
                       </form>
                       </div>
                   </div>
                   
               </div>
           </div>
    </body>
</html>
