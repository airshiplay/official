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
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
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

</head>
<body>
	<jsp:include page="template/navbar.jsp">
		<jsp:param name="catalog_active_index" value="1" />
	</jsp:include>
	<div id="container">
		<article> <header class="post-head">
		<h1 class="post-title">关于 Ghost 中文网</h1>
		</header> <section class="post-content">
		<blockquote>
			<p>
				官网 是。。。。。。。。。。。。。。。。。。。。。。
			</p>
		</blockquote>
		<p>
			<img style="max-width: 100%;"
				src="http://static.ghostchina.com/image/b/5e/877fa798be75dbe791dba07ac4811.jpg"
				alt="John O’Nolan 和 Hannah Wolfe" />
		</p>
		<p>
			技巧。
		</p></article>


		<div id="mapContainer" class="col-md-8" style="height: 200px"></div>
	</div>
	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script
		src="<%=contextPath%>/resources/jquery/jquery-1.12.3.min.js"></script>
	<script src="<%=contextPath%>/resources/bootstrap/js/bootstrap.min.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script
		src="<%=contextPath%>/resources/bootstrap/js/ie10-viewport-bug-workaround.js"></script>
	
	<script type="text/javascript"
		src="<%=contextPath%>/resources/admin/js/official/official-common.js"></script>
	<script type="text/javascript"
		src="http://api.map.baidu.com/api?v=2.0&ak=${baiduMapAk}">
		//v2.0版本的引用方式：src="http://api.map.baidu.com/api?v=2.0&ak=您的密钥"
		//v1.4版本及以前版本的引用方式：src="http://api.map.baidu.com/api?v=1.4&key=您的密钥&callback=initialize"
	</script>
	<script type="text/javascript">
		// 百度地图API功能	
		map = new BMap.Map("mapContainer");
		map.centerAndZoom(new BMap.Point(116.417854, 39.921988), 15);
		var data_info = [
				[ 116.417854, 39.921988, "地址：北京市东城区王府井大街88号乐天银泰百货八层" ],
				[ 116.406605, 39.921585, "地址：北京市东城区东华门大街" ],
				[ 116.412222, 39.912345, "地址：北京市东城区正义路甲5号" ] ];
		var opts = {
			width : 250, // 信息窗口宽度
			height : 80, // 信息窗口高度
			title : "信息窗口", // 信息窗口标题
			enableMessage : true
		//设置允许信息窗发送短息
		};
		for (var i = 0; i < data_info.length; i++) {
			var marker = new BMap.Marker(new BMap.Point(data_info[i][0],
					data_info[i][1])); // 创建标注
			var content = data_info[i][2];
			map.addOverlay(marker); // 将标注添加到地图中
			addClickHandler(content, marker);
		}
		function addClickHandler(content, marker) {
			marker.addEventListener("click", function(e) {
				openInfo(content, e)
			});
		}
		function openInfo(content, e) {
			var p = e.target;
			var point = new BMap.Point(p.getPosition().lng, p.getPosition().lat);
			var infoWindow = new BMap.InfoWindow(content, opts); // 创建信息窗口对象 
			map.openInfoWindow(infoWindow, point); //开启信息窗口
		}
	</script>
</body>
</html>