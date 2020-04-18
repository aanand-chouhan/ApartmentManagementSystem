<%-- 
    Document   : home
    Created on : 15 Feb, 2020, 6:58:40 PM
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
        <link rel="stylesheet" href="css/header.css">
        <link  rel="stylesheet" href="css/main.css">
        
    </head>
    <body>
        <div class="maincontainer">
            <div >
                <jsp:include page="header.jsp"></jsp:include>
            </div> <!--header section-->
            
                
            <div class="content">
                    <div id="myCarousel" class="carousel slide" data-ride="carousel">
                      <!-- Indicators -->
                      <ol class="carousel-indicators">
                        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                        <li data-target="#myCarousel" data-slide-to="1"></li>
                        <li data-target="#myCarousel" data-slide-to="2"></li>
                      </ol>
                      <!-- Wrapper for slides -->
                      <div class="carousel-inner">
                        <div class="item active">
                          <img src="img/building.jpg" alt="" style="width:100%;" class="banner-image">
                        </div>

                        <div class="item">
                          <img src="img/hall.jpg" alt="Chicago" style="width:100%;" class="banner-image">
                        </div>

                        <div class="item">
                          <img src="img/home.jpg" alt="New york" style="width:100%;" class="banner-image">
                        </div>
                      </div>

                      <!-- Left and right controls -->
                      <a class="left carousel-control" href="#myCarousel" data-slide="prev">
                        <span class="glyphicon glyphicon-chevron-left"></span>
                        <span class="sr-only">Previous</span>
                      </a>
                      <a class="right carousel-control" href="#myCarousel" data-slide="next">
                        <span class="glyphicon glyphicon-chevron-right"></span>
                        <span class="sr-only">Next</span>
                      </a>

                  </div>
            </div><!--content section-->
            <div class="section-2">
                <div class="row section-2-1">
                    <div class="col-lg-6 col-md-6 col-xs-6 col-sm-6">
                        <div>
                            <img src="img/kitchen.jpg" class="services-image">
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6 col-xs-6 col-sm-6">
                        <div>
                            <h1>your Security</h1>
                            <h3></h3>
                            <p>What is Lorem Ipsum?
                                Lorem Ipsum is simply dummy text of the printing and typesetting industry.
                                Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, 
                                when an unknown printer took a galley of type and scrambled it to make a type specimen book. 
                                It has survived not only five centuries, but also the leap into electronic typesetting,
                                remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets 
                                containing Lorem Ipsum passages, and more recently 
                                with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>
                        </div>
                    </div>
                </div>
                <div class="row section-2-2">
                    <div class="col-lg-6 col-md-6 col-xs-6 col-sm-6">
                        <div>
                            <h1>your Security</h1>
                            <h3></h3>
                            <p>What is Lorem Ipsum?
                                Lorem Ipsum is simply dummy text of the printing and typesetting industry.
                                Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, 
                                when an unknown printer took a galley of type and scrambled it to make a type specimen book. 
                                It has survived not only five centuries, but also the leap into electronic typesetting,
                                remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets 
                                containing Lorem Ipsum passages, and more recently 
                                with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>
                        </div>
                        
                    </div>
                    <div class="col-lg-6 col-md-6 col-xs-6 col-sm-6">
                        <div>
                            <img src="img/bedroom.jpg" class="services-image">
                        </div>
                    </div>
                </div>
                
                <div class="row section-2-3">
                    <div class="col-lg-6 col-md-6 col-xs-6 col-sm-6">
                        <div>
                            <img src="img/working.jpg" class="services-image">
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6 col-xs-6 col-sm-6">
                        <div>
                            <h1>your Security</h1>
                            <h3></h3>
                            <p>What is Lorem Ipsum?
                                Lorem Ipsum is simply dummy text of the printing and typesetting industry.
                                Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, 
                                when an unknown printer took a galley of type and scrambled it to make a type specimen book. 
                                It has survived not only five centuries, but also the leap into electronic typesetting,
                                remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets 
                                containing Lorem Ipsum passages, and more recently 
                                with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>
                        </div>
                    </div>
                </div>
                
            </div>
                 <div >
                     <jsp:include page="footer.jsp"></jsp:include>
                </div> <!--footer section-->
        </div>
    </body>
</html>
