<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String contextPath = request.getContextPath();
	String fullUrl = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ contextPath;
<<<<<<< HEAD
	request.getRequestURI();
=======
>>>>>>> da40ddad45f4884ddb338b4ca2b72658d1839d3f
	String catalogActiveIndex = request
			.getParameter("catalog_active_index");
%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/page" prefix="page"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
	<!-- Fixed navbar -->
	<nav class="navbar navbar-default navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">大易</a>
		</div>
		<div id="navbar" class="navbar-collapse collapse">
			<ul class="nav navbar-nav navbar-right">
<<<<<<< HEAD
				<li><a href="<%=contextPath%>/">Home</a></li>
				<c:forEach items="${navbar}" var="nav">
					<c:choose>
						<c:when test="${nav.level==1}">
							<c:if test="${nav.subNavbar==null}">
								<li><a href="<%=contextPath%>/${nav.urlPath}">${nav.catalogName }
								</a></li>
							</c:if>
							<!-- 含有子目录 -->
							<c:if test="${nav.subNavbar!=null}">
								<li class="dropdown"><a href="#" class="dropdown-toggle"
														data-toggle="dropdown" role="button" aria-haspopup="true"
														aria-expanded="false">${nav.catalogName } <span
										class="caret"></span></a>
									<ul class="dropdown-menu">
										<c:forEach items="${nav.subNavbar}" var="subnav">
											<li><a href="<%=contextPath%>/${subnav.urlPath}">${subnav.catalogName }</a></li>
										</c:forEach>
									</ul></li>
							</c:if>
=======
				<li class="active"><a href="<%=contextPath%>">Home</a></li>
				<c:forEach items="${navbar}" var="nav">
					<c:choose>
						<c:when test="${nav.level==1}">
							<li><a href="<%=contextPath%>/${nav.urlPath}">${nav.catalogName }
							</a></li>
>>>>>>> da40ddad45f4884ddb338b4ca2b72658d1839d3f
						</c:when>
						<c:otherwise>
						</c:otherwise>
					</c:choose>
				</c:forEach>
			</ul>
		</div>
		<!--/.nav-collapse -->
	</div>
	</nav>
</body>
</html>