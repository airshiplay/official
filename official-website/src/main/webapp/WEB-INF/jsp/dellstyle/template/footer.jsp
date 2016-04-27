<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String contextPath = request.getContextPath();
	String fullUrl = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ contextPath;
	String catalogActiveIndex = request
			.getParameter("catalog_active_index");
%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/page" prefix="page"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>

	<nav class="navbar navbar-default">
	<div id="footer" class="container">
		<div class="navbar-inner navbar-content-center">
			<ul class="nav navbar-nav navbar-right">
				<li class="active"><a href="#">大易</a></li>
				<c:forEach items="${navbar}" var="nav">
					<c:choose>
						<c:when test="${nav.level==1}">
							<c:if test="${nav.subNavbar==null}">
								<li><a href="#">${nav.catalogName } </a></li>
							</c:if>
							<!-- 含有二级子目录 -->
							<c:if test="${nav.subNavbar!=null}">
								<li><a href="#">${nav.catalogName } <span></span></a>
									<ul>
										<c:forEach items="${nav.subNavbar}" var="subnav">
											<li><a
												href="<%=contextPath%>/catalog/${subnav.urlPath}/${subnav.id}">${subnav.catalogName }</a></li>
										</c:forEach>
									</ul></li>
							</c:if>
						</c:when>
						<c:otherwise>
						</c:otherwise>
					</c:choose>
				</c:forEach>
			</ul>
		</div>
	</div>
	</nav>
</body>
</html>