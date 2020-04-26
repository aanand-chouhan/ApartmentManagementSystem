<%-- 
    Document   : ownerDashboard
    Created on : 28 Feb, 2020, 11:12:39 PM
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
        <link rel="stylesheet" href="css/ownerDashboard.css">
        <link rel="stylesheet" href="css/main.css">
        <script src="js/main.js" type="text/javascript"></script>
    </head>
    <body>
        <div>
            <div class="row">
                <jsp:include page="dashboardHeader.jsp"/>
            </div>
            <div class="row">
                <div class="col-md-2 sidebrPadMar">
                    <jsp:include page="dashboardSideBar.jsp"/>
                </div>
                <div class="col-md-10">
                    <% session = request.getSession();
                    String userName = (String)session.getAttribute("currentUserName");
                    String email = (String)session.getAttribute("currentUserEmail");
                    String pwd = (String)session.getAttribute("currentUserPassword");
                    String status = request.getParameter("STATUS");
                    System.out.println("currentUserEmail "+email);
                    System.out.println("currentUserPassword "+ pwd);
                    System.out.println("status "+ status);
                    %>
                    
               <!--<c:set var="status" value="<%=status %>" />
               <c:if test="${(status != null)}">
                    <div class="alert alert-danger alert-dismissible">
                        <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                        <strong>Server error please contact your Administrator !!!</strong>
                    </div>
               </c:if>-->
                    
                    <div class="row">
                        <div class="col-md-3 dashboard-box"><i class="glyphicon glyphicon-check"></i>5 Bookings</div>
                        <div class="col-md-3 dashboard-box"><i class="glyphicon glyphicon-signal"></i>AVAILABLE</div>
                        <div class="col-md-3 dashboard-box"><i class="glyphicon glyphicon-user"></i>TOTAL TENANT</div>
                        <div class="col-md-3 dashboard-box">MANAGEMENT</div>    
                    </div>
                     <div class="row">
                <div class="col-md-6">
                   
                </div>
                         <div class="col-md-6">
                             <div class="flat-field">
                                 <h3>Flat Information</h3>
                                 <ul>
                                     <li><a href="#">Flat Type</a></li>
                                     <li><a href="#">Flat Facility</a></li>
                                     <li><a href="#">Flat Price</a></li>
                                 </ul>
                             </div>
                         </div>
            </div>
                </div>
                
            </div>
           
        </div>
    </body>
</html>
