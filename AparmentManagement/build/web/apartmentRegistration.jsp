<%-- 
    Document   : apartmentRegistration
    Created on : 2 Mar, 2020, 3:11:22 PM
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
        <link rel="stylesheet" href="css/header.css">
        <link rel="stylesheet" href="css/apartmentRegistration.css">
          <link rel="stylesheet" href="css/ownerDashboard.css">
          <link rel="stylesheet" href="css/main.css">
    </head>
    <body>
      <div class="container-fluid sidebrPadMar">
            <div class="header">
                <jsp:include page="dashboardHeader.jsp"></jsp:include>
            </div>
            
            <div class="row">
                <div class="col-md-2 sidebrPadMar">
                     <jsp:include page="dashboardSideBar.jsp"/>
                </div>
            <div class="row-2 col-md-10">
                      
                <% 
                   String status = (String)request.getAttribute("STATUS");
                   System.out.println("status "+status);
               %>
               <c:set var="status" value="<%=status %>" />
               
            
             <!--  <c:if test="${( status == 'FAILED')}">
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
               </c:if>-->
                    
            <div class="row apartment-registration-form ">
                <div class="apartment-registration-form-child-div col-md-12">
                     <div class="row">
                        <div class="text">
                           <h1>REGISTRATION FORM</h1>
                        </div>
                    </div>
                <form action="/apartment_registration" method="POST" enctype="multipart/form-data">
                    
                <div class="col-md-12">
                     <div class="col-md-6">
                        <div class="form-group">
                                 <label>Apartment Name</label>
                                 <label>
                                    <input type="text" name="apartmentName" placeholder="apartment name" class="form-control registration-form-field">
                                 </label>
                        </div>
                        <div class="form-group">
                                 <label>Start Flat No</label>
                                 <label>
                                    <input type="number" name="startNo" class="form-control registration-form-field">
                                 </label>
                        </div>
                   
                </div>
                <div class="col-md-6">
                    <div class="form-group">
                             <label>email</label>
                             <label>
                                <input type="email" name="email" placeholder="enter email" class="form-control registration-form-field">
                             </label>
                        </div>
             
                     <div class="form-group">
                             <label>End Flat No</label>
                             <label>
                                <input type="number" name="flateEndNo" class="form-control registration-form-field">
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
                       
                             <label>Total Flats</label>
                             <label>
                                <input type="number" name="totalflat" class="form-control registration-form-field">
                             </label>
                        </div>
                    
                </div>
                <div class="col-md-6">
                     <div class="form-group">
                             <label>Contact No</label>
                             <label>
                                <input type="number" name="contact" placeholder="enter contect" class="form-control registration-form-field">
                             </label>
                     </div>
                    <div class="form-group">
                             <label>NO Of Floors</label>
                             <label>
                                <input type="number" name="floors" class="form-control registration-form-field">
                             </label>
                    </div>
                </div>
                     <div class="row">
                        <div class="form-group col-md-12">
                            <input type="file" size="100" name="flatesImage">
                        </div>
                     </div>
                    <div class="row">
                        <div class="col-md-2">
                            <input type="submit" value="Save" class="btn btn-primary">
                        </div> 
                        <div class="col-md-2">
                            <input type="hidden" class="form-control" name="CMD" value="apartment_registration"/>
                            <input type="reset" value="Reset" class="btn btn-primary">
                        </div> 
                    </div>
                </div>
            </form>
                </div>
              </div>
            </div>
               
        </div>
            </div>
    </body>
</html>
