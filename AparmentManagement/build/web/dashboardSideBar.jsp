<%-- 
    Document   : dashboardSideBar
    Created on : 15 Mar, 2020, 6:58:06 PM
    Author     : av
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

        <% //session = request.getSession();
        String userName = (String)session.getAttribute("currentUserName"); %>

                <div class="owner-sidebar ">
                        <h3></h3>
                        <a href="#"><img class="admin-profile-img" src="data:image/jpeg;base64,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"> <%=userName%> </a>
                        <a class="side-bar-item selected" href="apartmentUrl?CMD=view_owner_details">Owner Information</a>
                        <a class="side-bar-item" href="#">Tenants Information</a>
                        <a class="side-bar-item" href="">Apartment Information</a>
                        <a class="side-bar-item" href="#">Staff</a>
                        <a class="side-bar-item" href="#">Booking Information</a>
                        <a class="side-bar-item" href="#">Cancel Booking</a>
                        <a class="side-bar-item" href="#">Facility</a>
                        <a class="side-bar-item" href="#">Available Flat</a>
                        <a class="side-bar-item" href="#">Maintenance</a>
                        <a class="side-bar-item" href="#">Complain Box</a>
                        <a class="side-bar-item" href="#">Setting</a>
                        
                    </div>