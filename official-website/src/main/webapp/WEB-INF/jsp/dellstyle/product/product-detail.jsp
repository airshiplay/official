<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String contextPath = request.getContextPath();
	String fullUrl = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ contextPath;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>${webSite.siteTitle}</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="${webSite.metaDescription}">
<meta name="author" content="${webSite.metaAuthor}">
<meta name="keyword" content="${webSite.metaKeyword}">
<link rel="icon" href="${webSite.siteFavicon}">

<!-- Bootstrap core CSS -->
<link href="<%=contextPath%>/resources/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href="<%=contextPath%>/resources/css/navbar-fixed-top.css"
	rel="stylesheet">

<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
<script
	src="<%=contextPath%>/resources/bootstrap/js/ie-emulation-modes-warning.js"></script>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
<link href="<%=contextPath%>/resources/css/carousel.css"
	rel="stylesheet">
</head>
<body>
	<jsp:include page="../template/navbar.jsp">
		<jsp:param name="catalog_active_index" value="1" />
	</jsp:include>
	<div class="container"></div>

	<jsp:include page="../template/footer.jsp">
		<jsp:param name="catalog_active_index" value="1" />
	</jsp:include>
	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="<%=contextPath%>/resources/jquery/jquery-1.12.3.min.js"></script>
	<script src="<%=contextPath%>/resources/bootstrap/js/bootstrap.min.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script
		src="<%=contextPath%>/resources/bootstrap/js/ie10-viewport-bug-workaround.js"></script>


</body>
</html>