<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String contextPath = request.getContextPath();
	String fullUrl = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ contextPath;
%>
<html>
<head>
<title>官网</title>
<link href="<%=fullUrl%>/resources/css/carousel.css"
	rel="stylesheet">
</head>

<body>

	<div class='date'><%=new java.util.Date()%></div>
	<div id="myCarousel" class="carousel slide">
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			<li data-target="#myCarousel" data-slide-to="1"></li>
			<li data-target="#myCarousel" data-slide-to="2"></li>
		</ol>
		<!-- Carousel items -->
		<div class="carousel-inner">
			<div class="active item">
				<img
					src="http://bootstrap.kinghack.com/assets/img/bootstrap-mdo-sfmoma-01.jpg"
					alt="">
			</div>

			<div class="item">
				<img
					src="http://bootstrap.kinghack.com/assets/img/bootstrap-mdo-sfmoma-02.jpg"
					alt="">
			</div>

			<div class="item">
				<img
					src="http://bootstrap.kinghack.com/assets/img/bootstrap-mdo-sfmoma-03.jpg"
					alt="">
				<div class="carousel-caption">
					<h4>Third Thumbnail label</h4>
					<p>Cras justo odio, dapibus ac facilisis in, egestas eget quam.
						Donec id elit non mi porta gravida at eget metus. Nullam id dolor
						id nibh ultricies vehicula ut id elit.</p>
				</div>
			</div>

		</div>
		<!-- Carousel nav -->
		<a class="carousel-control left" href="#myCarousel" data-slide="prev">&lsaquo;</a>
		<a class="carousel-control right" href="#myCarousel" data-slide="next">&rsaquo;</a>
	</div>
	<script src="<%=fullUrl%>/resources/jquery/jquery-1.12.3.min.js"></script>
	<script src="<%=fullUrl%>/resources/bootstrap/js/bootstrap.min.js"></script>
	<script type="text/javascript">
		$('.carousel').carousel()
	</script>
</body>
</html>