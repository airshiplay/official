<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String contextPath = request.getContextPath();
	String fullUrl = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ contextPath;
%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/page" prefix="page" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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
				<a class="navbar-brand" href="#">${company.siteTitle}</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="<%=fullUrl%>">Home</a></li>
					<c:forEach items="${navbar}" var="nav">
						<c:choose>
							<c:when test="${nav.level==1}">
								<c:if test="${nav.subNavbar==null}">
									<li><a href="<%=fullUrl%>/catalog/${nav.type}/${nav.id}">${nav.catalogName }
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
												<li><a href="<%=fullUrl%>/catalog/${subnav.urlPath}/${subnav.id}">${subnav.catalogName }</a></li>
											</c:forEach>
										</ul></li>
								</c:if>
							</c:when>
							<c:otherwise>
							</c:otherwise>
						</c:choose>
					</c:forEach>
					<li class="dropdown" style="display: none"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown" role="button"
						aria-haspopup="true" aria-expanded="false">Dropdown <span
							class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="#">Action</a></li>
							<li><a href="#">Another action</a></li>
							<li><a href="#">Something else here</a></li>
							<li role="separator" class="divider"></li>
							<li class="dropdown-header">Nav header</li>
							<li><a href="#">Separated link</a></li>
							<li><a href="#">One more separated link</a></li>
						</ul></li>
				</ul>
				<ul class="nav navbar-nav navbar-right" style="display: none">
					<li><a href="../navbar/">Default</a></li>
					<li><a href="../navbar-static-top/">Static top</a></li>
					<li class="active"><a href="./">Fixed top <span
							class="sr-only">(current)</span></a></li>
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</nav>
</body>
</html>