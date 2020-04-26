<%-- 
    Document   : tenantRegistration
    Created on : 15 Mar, 2020, 11:36:41 PM
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
        <link rel="stylesheet" href="css/apartmentRegistration.css">
        <link rel="stylesheet" href="css/ownerDashboard.css">
        <link rel="stylesheet" href="css/main.css">
    </head>
    <body>
        <div class="header">
            <jsp:include page="dashboardHeader.jsp"></jsp:include>
            </div>
            <div class="row">
                <div class="col-md-2 sidebrPadMar">
                     <jsp:include page="dashboardSideBar.jsp"/>
                </div>
                <div class="row-2 col-md-10">
                    <div class="row tenant-registration-form ">
                        <div class="tenant-registration-form-child-div col-md-12">
                             <div class="row">
                                <div class="text">
                                   <h1>TENANT REGISTRATION FORM</h1>
                                </div>
                            </div>
                            <form action="apartmentUrl" method="POST" enctype="multipart/form-data">
                                <input type="hidden" name="CMD" value="tenant_registration"/>
                            <div class="col-md-12">
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>Name</label>
                                        <label>
                                            <input type="text" name="tenantName" placeholder="enter name" class="form-control registration-form-field">
                                        </label>
                                    </div>
                                    <div class="form-group">
                                        <label>SurName</label>
                                        <label>
                                            <input type="text" name="surName"  placeholder="enter surname" class="form-control registration-form-field">
                                        </label>
                                    </div>
                                    <div class="form-group">
                                        <label>Email</label>
                                        <label>
                                            <input type="email" name="email" placeholder="enter email" class="form-control registration-form-field">
                                        </label>
                                    </div>
                                    <div class="form-group">
                                        <label>Age</label>
                                        <label>
                                            <input type="number" name="age" class="form-control registration-form-field">
                                        </label>
                                    </div>
                                </div>
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label>Address</label>
                                            <label>
                                                <input type="text" name="address" placeholder="enter address" class="form-control registration-form-field">
                                            </label>
                                        </div>
                                        <div class="form-group">
                                            <label>Mobile No</label>
                                            <label>
                                                <input type="number" name="mobileNo" class="form-control registration-form-field">
                                            </label>
                                        </div>
                                        <div class="form-group">
                                            <label>Skills</label>
                                                <input type="text" name="workName" placeholder="" class="form-control registration-form-field">
                                        </div>
                                        <div class="form-group">
                                            <label>Password</label>
                                            <label>
                                            <input type="password" name="password" class="form-control registration-form-field">
                                            </label>
                                        </div>
                                    </div> 
                                <div class="row">
                                    <div class="form-group col-md-12">
                                        <input type="file" size="100" name="profileImage">
                                    </div>
                                </div>
                                    <div class="row">
                                        <div class="col-md-2">
                                            <input type="submit" value="Submit" class="btn btn-primary">
                                        </div>
                                    </div>
                            </div>
                       </form>
                        </div>
                    </div>
                </div>
    </body>
</html>
