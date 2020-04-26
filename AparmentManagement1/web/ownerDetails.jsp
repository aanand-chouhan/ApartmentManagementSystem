<%-- 
    Document   : ownerDetails
    Created on : 18 Mar, 2020, 10:56:40 PM
    Author     : av
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Owner Details</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="css/apartmentRegistration.css">
        <link rel="stylesheet" href="css/ownerDashboard.css">
        <link rel="stylesheet" href="css/main.css">
    </head>
    <body>
        <div class="container-fluid sidebrPadMar">
            <div class="row"> 
                <jsp:include page="dashboardHeader.jsp"/>
            </div>
            <div class="row">
                <div class="col-md-2 sidebrPadMar">
                    <jsp:include page="dashboardSideBar.jsp"/>
                </div>
                <div class="col-md-10">
                    <div class="row">
                        <div class="col-md-12">
                            <c:if test="${ownerDetails ne null}">
                                
                                <div class="row">
                                    <img src="data:image/jpg;base64,${ownerProfile}" alt="profile pic" width="100px" height="100px">
                                </div>
                                <div class="row">
                                    <div class="col-md-6">
                                        <label> Name :</label>
                                    </div>
                                    <div class="col-md-6">
                                        <p> ${ownerDetails.name} </p>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-6">
                                        <label>SurName :</label>
                                    </div>
                                    <div class="col-md-6">
                                        <p> ${ownerDetails.surName} </p>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-6">
                                        <label>Adhar card :</label>
                                    </div>
                                    <div class="col-md-6">
                                        <p> ${ownerDetails.adharcard} </p>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-6">
                                        <label>Pan card :</label>
                                    </div>
                                    <div class="col-md-6">
                                        <p> ${ownerDetails.pancard} </p>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-6">
                                        <label>Mobile NO:</label>
                                    </div>
                                    <div class="col-md-6">
                                        <p> ${ownerDetails.mobileNo} </p>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-6">
                                        <label>Age :</label>
                                    </div>
                                    <div class="col-md-6">
                                        <p> ${ownerDetails.age} </p>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-6">
                                        <label>DOB :</label>
                                    </div>
                                    <div class="col-md-6">
                                        <p> ${ownerDetails.dob} </p>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-6">
                                        <label>Address :</label>
                                    </div>
                                    <div class="col-md-6">
                                        <p> ${ownerDetails.address} </p>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-6">
                                        <label>Gender :</label>
                                    </div>
                                    <div class="col-md-6">
                                        <p> ${ownerDetails.gender} </p>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-6">
                                        <label>Language:</label>
                                    </div>
                                    <div class="col-md-6">
                                        <p> ${ownerDetails.language} </p>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-6">
                                        <label>Email :</label>
                                    </div>
                                    <div class="col-md-6">
                                        <p> ${ownerDetails.email} </p>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-6">
                                        <label>Adhar card :</label>
                                    </div>
                                    <div class="col-md-6">
                                        <p> ${ownerDetails.adharcard} </p>
                                    </div>
                                </div>
                                
                            </c:if>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        
    </body>
</html>
