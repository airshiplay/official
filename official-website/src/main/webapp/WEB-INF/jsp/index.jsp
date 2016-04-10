<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String contextPath = request.getContextPath();
	String fullUrl = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ contextPath;
%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/page" prefix="page" %>
<html>
<head>
<title>官网</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="${company.metaDescription}">
<meta name="author" content="${company.metaAuthor}">
<meta name="keyword" content="${company.metaKeyword}">
<link rel="icon" href="${company.siteFavicon}">

<title>${company.siteTitle}</title>

<!-- Bootstrap core CSS -->
<link href="<%=fullUrl%>/resources/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href="<%=fullUrl%>/resources/css/navbar-fixed-top.css"
	rel="stylesheet">

<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
<script
	src="<%=fullUrl%>/resources/bootstrap/js/ie-emulation-modes-warning.js"></script>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
<link href="<%=fullUrl%>/resources/css/carousel.css"
	rel="stylesheet">
</head>

<body>

<jsp:include page="template/navbar.jsp"/> 
	
	<div class="container">
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
	</div>
	
	
	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script
		src="<%=fullUrl%>/resources/jquery/jquery-1.12.3.min.js"></script>
	<script src="<%=fullUrl%>/resources/bootstrap/js/bootstrap.min.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script
		src="<%=fullUrl%>/resources/bootstrap/js/ie10-viewport-bug-workaround.js"></script>
	

	<script type="text/javascript">
		$('.carousel').carousel()
	</script>
</body>
</html>