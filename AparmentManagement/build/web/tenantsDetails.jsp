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
        <title>Tenant Details</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
      
        
        <link rel="stylesheet" href="https://cdn.datatables.net/1.10.20/css/dataTables.bootstrap4.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.css">
        <script src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js"></script>
        <script src="https://cdn.datatables.net/1.10.20/js/dataTables.bootstrap4.min.js"></script>
        
        <link rel="stylesheet" href="css/apartmentRegistration.css">
        <link rel="stylesheet" href="css/ownerDashboard.css">
        <link rel="stylesheet" href="css/main.css">
        <script src="js/main.js" type="text/javascript"></script>
        <style>
            a{
                color:inherit ;
            }
            .side-bar-item{
                color: #475F77;
            }
        </style>
    </head>
    <body style="font-size: 14px !important">
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
                        <div class="col-md-12 tenant_info_container">
                            <table id="tenant-info" class="table table-striped table-bordered" style="width:100%">
                                    <thead>
                                        <th>Name</th>
                                        <th>Surname</th>
                                        <th>Flore No</th>
                                        <th>Flate No</th>
                                        <th>Action</th>
                                    </thead>
                                <tbody>
                            <c:if test="${tenantDetails ne null}">
                                <c:forEach var="tenantDto" items="${tenantDetails}"> 
                                    <tr>
                                        <td>${tenantDto.tenantName}</td>
                                        <td>${tenantDto.surName}</td>
                                        <td>${tenantDto.flateNo}</td>
                                        <td>${tenantDto.florNo}</td>
                                        <td></td>
                                    </tr>
                                </c:forEach>
                            </c:if>
                                </tbody>
                           </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        
    </body>
</html>
