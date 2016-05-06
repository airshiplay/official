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
<title>服务地图</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
    <style type="text/css">
.scrollspy-example {
height: 300px;
overflow: auto;
position: relative;
}
</style>
</head>
<body style=" position: relative;" >
	<jsp:include page="template/navbar.jsp">
		<jsp:param name="catalog_active_index" value="1" />
	</jsp:include>
	<div class="container">
		<div>
			<img
				src="http://bootstrap.kinghack.com/assets/img/bootstrap-mdo-sfmoma-03.jpg"
				alt="" style="width: 100%">
		</div>


		<div id="districtContainer" style="margin-top: 40px">
			<div class="panel panel-default col-md-4" style="height: 500px">
				<div class="panel-heading">
					<label>级联的支持</label>
				</div>
				<div class="panel-body">
					<form action="#" id="formContainer" class="form form-horizontal">
					
					<div class="form-group col-md-12">
					<div class="col-md-8 col-sm-8"><input type="text" class="form-control"/></div>
					<div class="col-md-4 col-sm-8"><button class="form-control btn btn-default" onclick="javascript:void(0)">搜索</button></div>
					</div>
					
					</form>
					<!-- <input type="text" > -->
				</div>
				<div data-spy="scroll" data-offset="0" class="scrollspy-example">
				<h4 id="fat" class="list-group">@fat</h4>
      <p class="list-group-item">Ad leggings keytar, brunch id art party dolor labore. Pitchfork yr enim lo-fi before they sold out qui. Tumblr farm-to-table bicycle rights whatever. Anim keffiyeh carles cardigan. Velit seitan mcsweeney's photo booth 3 wolf moon irure. Cosby sweater lomo jean shorts, williamsburg hoodie minim qui you probably haven't heard of them et cardigan trust fund culpa biodiesel wes anderson aesthetic. Nihil tattooed accusamus, cred irony biodiesel keffiyeh artisan ullamco consequat.</p>
      <h4 id="mdo" class="list-group">@mdo</h4>
      <p class="list-group-item">Veniam marfa mustache skateboard, adipisicing fugiat velit pitchfork beard. Freegan beard aliqua cupidatat mcsweeney's vero. Cupidatat four loko nisi, ea helvetica nulla carles. Tattooed cosby sweater food truck, mcsweeney's quis non freegan vinyl. Lo-fi wes anderson +1 sartorial. Carles non aesthetic exercitation quis gentrify. Brooklyn adipisicing craft beer vice keytar deserunt.</p>
      <h4 id="one">one</h4>
      <p>Occaecat commodo aliqua delectus. Fap craft beer deserunt skateboard ea. Lomo bicycle rights adipisicing banh mi, velit ea sunt next level locavore single-origin coffee in magna veniam. High life id vinyl, echo park consequat quis aliquip banh mi pitchfork. Vero VHS est adipisicing. Consectetur nisi DIY minim messenger bag. Cred ex in, sustainable delectus consectetur fanny pack iphone.</p>
      <h4 id="two">two</h4>
      <p>In incididunt echo park, officia deserunt mcsweeney's proident master cleanse thundercats sapiente veniam. Excepteur VHS elit, proident shoreditch +1 biodiesel laborum craft beer. Single-origin coffee wayfarers irure four loko, cupidatat terry richardson master cleanse. Assumenda you probably haven't heard of them art party fanny pack, tattooed nulla cardigan tempor ad. Proident wolf nesciunt sartorial keffiyeh eu banh mi sustainable. Elit wolf voluptate, lo-fi ea portland before they sold out four loko. Locavore enim nostrud mlkshk brooklyn nesciunt.</p>
      <h4 id="three">three</h4>
      <p>Ad leggings keytar, brunch id art party dolor labore. Pitchfork yr enim lo-fi before they sold out qui. Tumblr farm-to-table bicycle rights whatever. Anim keffiyeh carles cardigan. Velit seitan mcsweeney's photo booth 3 wolf moon irure. Cosby sweater lomo jean shorts, williamsburg hoodie minim qui you probably haven't heard of them et cardigan trust fund culpa biodiesel wes anderson aesthetic. Nihil tattooed accusamus, cred irony biodiesel keffiyeh artisan ullamco consequat.</p>
      <p>Keytar twee blog, culpa messenger bag marfa whatever delectus food truck. Sapiente synth id assumenda. Locavore sed helvetica cliche irony, thundercats you probably haven't heard of them consequat hoodie gluten-free lo-fi fap aliquip. Labore elit placeat before they sold out, terry richardson proident brunch nesciunt quis cosby sweater pariatur keffiyeh ut helvetica artisan. Cardigan craft beer seitan readymade velit. VHS chambray laboris tempor veniam. Anim mollit minim commodo ullamco thundercats.
      </p>
				</div>
			</div>
			<div id="mapContainer" class="col-md-8" style="height: 500px"></div>
		</div>




	</div>

	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="<%=contextPath%>/resources/jquery/jquery-1.12.3.min.js"></script>
	<script src="<%=contextPath%>/resources/bootstrap/js/bootstrap.min.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script
		src="<%=contextPath%>/resources/bootstrap/js/ie10-viewport-bug-workaround.js"></script>
	<script type="text/javascript"
		src="<%=contextPath%>/resources/js/smartform/jquery.smart-form.js"></script>
	<script type="text/javascript"
		src="<%=contextPath%>/resources/js/smartform/global.js"></script>
	<script type="text/javascript"
		src="<%=contextPath%>/resources/admin/js/official/official-common.js"></script>
	<script>
		$(function() {
			var eles = [ [ {
				ele : {
					type : 'select',
					name : 'province',
					title : '省',
					withNull : true,
					label:false,
					items : [ {
						text : '广东',
						value : 'GuangDong',
						extendAttr : {
							id : 1000
						}
					}, {
						text : '湖南',
						value : 'HuNan',
						extendAttr : {
							id : 2000
						}
					} ]
				}
			}, {
				ele : {
					type : 'select',
					name : 'city',
					title : '',
					withNull : true,
					items : [ {
						"text" : "广州",
						"value" : "GuangZhou",
						"extendAttr" : {
							"id" : "1000001",
							"parentId" : "1000"
						}
					}, {
						"text" : "花都",
						"value" : "HuaDu",
						"extendAttr" : {
							"id" : "1000002",
							"parentId" : "1000"
						}
					}, {
						"text" : "邵阳",
						"value" : "ShaoYang",
						"extendAttr" : {
							"id" : "2000001",
							"parentId" : "2000"
						}
					}, {
						"text" : "长沙",
						"value" : "ChangSha",
						"extendAttr" : {
							"id" : "2000002",
							"parentId" : "2000"
						}
					} ]
				}
			}
			
/* 			, {
				ele : {
					type : 'select',
					name : 'region',
					title : '',
					withNull : true,
					items : [ {
						"text" : "天河区",
						"value" : "TH",
						"extendAttr" : {
							"id" : "1000001001",
							"parentId" : "1000001"
						}
					}, {
						"text" : "海珠区",
						"value" : "HZ",
						"extendAttr" : {
							"id" : "1000001002",
							"parentId" : "1000001"
						}
					}, {
						"text" : "越秀区",
						"value" : "YX",
						"extendAttr" : {
							"id" : "1000001003",
							"parentId" : "1000001"
						}
					}, {
						"text" : "白云区",
						"value" : "BY",
						"extendAttr" : {
							"id" : "1000001004",
							"parentId" : "1000001"
						}
					}, {
						"text" : "花都区",
						"value" : "HD",
						"extendAttr" : {
							"id" : "1000002001",
							"parentId" : "1000002"
						}
					}, {
						"text" : "aa县",
						"value" : "aa",
						"extendAttr" : {
							"id" : "2000001001",
							"parentId" : "2000001"
						}
					}, {
						"text" : "望城区",
						"value" : "wc",
						"extendAttr" : {
							"id" : "2000002001",
							"parentId" : "2000002"
						}
					}, {
						"text" : "雨花区",
						"value" : "yh",
						"extendAttr" : {
							"id" : "2000002002",
							"parentId" : "2000002"
						}
					} ]
				}
			} */
			
			, ] ];
			var bsForm = new BSForm({
				eles : eles,
				autoLayout : true
			}).Render('formContainer', function(sf) {
				//编辑页面的绑定
				sf.InitFormData({
					province : '',
					city : ''/* ,
					region : '' */
				});
				//必须先赋值再生成插件
				global.Fn.CascadeSelect({
					targets : [ 'province', 'city', 'region' ],
					primaryKey : 'data-id',
					relativeKey : 'data-parentId'
				});
			});
		});
	</script>
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
		$('[data-spy="scroll"]').each(function () {
			  var $spy = $(this).scrollspy('refresh');
			});
		$('[data-spy="scroll"]').scrollspy('refresh');
	</script>
</body>
</html>