<%-- 
    Document   : regist
    Created on : 18 Feb, 2020, 1:00:26 AM
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
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style type="text/css">
            .bg{
               background:url('img/regist.jpg');
               background-size: cover;
               width: 100%;
               height:100%;
              }
              .box{
                  -webkit-box-shadow: -23px 20px 5px 3px rgba(0,0,0,0.75);
                  -moz-box-shadow: -23px 20px 5px 3px rgba(0,0,0,0.75);
                  box-shadow: -23px 20px 5px 3px rgba(0,0,0,0.75);

                  padding: 30px;
                  margin-top: 90px;
                  height: 836px;
                  padding-left: 45px;
              }
              .img{
                  
                  background-repeat: no-repeat;
                  height: 807px;
                  width: 631px;
              }
              
              #regist{
                      padding: 31px 88px;
                       margin-top: 90px;
                      -webkit-box-shadow: 17px 13px 5px 3px rgba(0,0,0,0.75);
                      -moz-box-shadow: 17px 13px 5px 3px rgba(0,0,0,0.75);
                      box-shadow: 17px 13px 5px 3px rgba(0,0,0,0.75);

              }
              .form-group{
                      width: 250px;
                      padding-right: 55px;
              }
              .row{
                  margin:0;
              }
        </style>
    </head>
    <body>
           <div class="container-fluid bg">
               <% 
                   String status = (String)request.getAttribute("STATUS");
                   System.out.println("status "+status);
               %>
               
               
               <div class="row">
                   <div class="col-md-6 col-sm-6 col-xs-12">
                       <div class="box">
                           <div >
                               <img src="img/A.jpg" class="img">
                           </div>
                          
                       </div>
                   </div>
                   <div class="col-md-6 col-sm-6 col-xs-12">
                       <form id="regist" action="apartmentUrl" method="POST">
                           <input type="hidden" name="CMD" value="owner_registration_form">
                           <h1>Registration Form</h1>
                     
                           <div class="form-group">
                               <label>Name</label>
                               <input type="text" class="form-control" name="name" placeholder="Enter Name">
                           </div>
                           <div class="form-group">
                               <label>Surname</label>
                               <input type="text" class="form-control" name="surname" placeholder="Enter Surname">
                           </div>
                           <div class="form-group">
                               <label>Age</label>
                               <input type="age" class="form-control" name="age" placeholder="Enter Surname">
                           </div>
                           <div class="form-group">
                               <label>Mb.Number</label>
                               <input type="number" class="form-control" name="number" placeholder="Enter Mb.Number">
                           </div>
                           <div class="form-group">
                               <label>Address</label>
                               <input type="Address" class="form-control" name="address" placeholder="Write the Address">
                           </div>
                           <div class="form-group">
                               <label>AdharCard</label>
                               <input type="number" class="form-control" name="adharcard" placeholder="Enter AdharCard">
                           </div>
                           <div class="form-group">
                               <label>PanCard</label>
                               <input type="text" class="form-control" name="pancard" placeholder="Enter Pancard">
                           </div>
                           
                            <div class="DOB">
                               <lable>DOB</lable>
                               <input type="date" class="form-control" name="dob">
                           </div>
                           <div class="form-group">
                               <label>Email</label>
                               <input type="email" class="form-control" name="email" placeholder="Enter Email">
                           </div>
                           
                           <div class="form-group">
                               <label>Password</label>
                               <input type="password" class="form-control" name="pwd" placeholder="Enter password">
                           </div>
                           
                           <div class="checkbox">
                               <label>Language</label>
                               <label><input type="checkbox" name="language" value="Hindi">Hindi 
                              <input type="checkbox" name="language">Other</label>
                                   <input type="checkbox" name="language" value="English">English &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                              <input type="checkbox" name="language">Other</label>
                           </div>
                           <div class="radio">
                               <label>Gender &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</label>
                               
                               <label><input type="radio" name="gender" value="male">Male 
                               <input type="radio" name="gender" value="Female">Female 
                               <input type="radio" name="gender" value="other">Other</label>
                           </div>
                                        <div class="form-group col-md-12">
                                            <input type="file" size="100" name="profile">
                                        </div>
                           <button type="submit" class="btn btn-success  btn-block">Submit</button>
                       </form>
                   </div>
               </div>
           </div>
    </body>
</html>
