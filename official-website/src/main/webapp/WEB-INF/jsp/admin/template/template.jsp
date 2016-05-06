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
<html lang="zh">
<head>
<title>Insert title here</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap core CSS -->

<link href="<%=contextPath%>/resources/admin/css/bootstrap.min.css"
	rel="stylesheet">

<link
	href="<%=contextPath%>/resources/admin/fonts/css/font-awesome.min.css"
	rel="stylesheet">
<link href="<%=contextPath%>/resources/admin/css/animate.min.css"
	rel="stylesheet">

<!-- Custom styling plus plugins -->
<link href="<%=contextPath%>/resources/admin/css/custom.css"
	rel="stylesheet">
<link href="<%=contextPath%>/resources/admin/css/icheck/flat/green.css"
	rel="stylesheet">

<link
	href="<%=contextPath%>/resources/admin/js/datatables/jquery.dataTables.min.css"
	rel="stylesheet" type="text/css" />
<link
	href="<%=contextPath%>/resources/admin/js/datatables/buttons.bootstrap.min.css"
	rel="stylesheet" type="text/css" />
<link
	href="<%=contextPath%>/resources/admin/js/datatables/fixedHeader.bootstrap.min.css"
	rel="stylesheet" type="text/css" />
<link
	href="<%=contextPath%>/resources/admin/js/datatables/responsive.bootstrap.min.css"
	rel="stylesheet" type="text/css" />
<link
	href="<%=contextPath%>/resources/admin/js/datatables/scroller.bootstrap.min.css"
	rel="stylesheet" type="text/css" />
<link href="<%=contextPath%>/resources/admin/js/toastr/toastr.min.css"
	rel="stylesheet" type="text/css" />

<script src="<%=contextPath%>/resources/admin/js/jquery.min.js"></script>

<!--[if lt IE 9]>
        <script src="../assets/js/ie8-responsive-file-warning.js"></script>
        <![endif]-->

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->
</head>
<body class="nav-md">
	<div class="container body">


		<div class="main_container">

			<jsp:include page="navbar.jsp" />
			<!-- /top navigation -->

			<!-- page content -->
			<div class="right_col" role="main">
			
				<!-- footer content -->
				<footer> <jsp:include page="footer.jsp" />
				</footer>
				<!-- /footer content -->
			</div>
			<!-- /page content -->


		</div>

	</div>
	<script src="<%=contextPath%>/resources/admin/js/bootstrap.min.js"></script>

	<!-- bootstrap progress js -->
	<script
		src="<%=contextPath%>/resources/admin/js/progressbar/bootstrap-progressbar.min.js"></script>
	<!-- icheck -->
	<script src="<%=contextPath%>/resources/admin/js/icheck/icheck.min.js"></script>

	<script src="<%=contextPath%>/resources/admin/js/custom.js"></script>


	<!-- Datatables -->
	<!-- <script src="js/datatables/js/jquery.dataTables.js"></script>
  <script src="js/datatables/tools/js/dataTables.tableTools.js"></script> -->

	<!-- Datatables-->
	<script
		src="<%=contextPath%>/resources/admin/js/datatables/jquery.dataTables.min.js"></script>
	<script
		src="<%=contextPath%>/resources/admin/js/datatables/dataTables.bootstrap.js"></script>
	<script
		src="<%=contextPath%>/resources/admin/js/datatables/dataTables.buttons.min.js"></script>
	<script
		src="<%=contextPath%>/resources/admin/js/datatables/buttons.bootstrap.min.js"></script>
	<script
		src="<%=contextPath%>/resources/admin/js/datatables/jszip.min.js"></script>
	<script
		src="<%=contextPath%>/resources/admin/js/datatables/pdfmake.min.js"></script>
	<script
		src="<%=contextPath%>/resources/admin/js/datatables/vfs_fonts.js"></script>
	<script
		src="<%=contextPath%>/resources/admin/js/datatables/buttons.html5.min.js"></script>
	<script
		src="<%=contextPath%>/resources/admin/js/datatables/buttons.print.min.js"></script>
	<script
		src="<%=contextPath%>/resources/admin/js/datatables/dataTables.fixedHeader.min.js"></script>
	<script
		src="<%=contextPath%>/resources/admin/js/datatables/dataTables.keyTable.min.js"></script>
	<script
		src="<%=contextPath%>/resources/admin/js/datatables/dataTables.responsive.min.js"></script>
	<script
		src="<%=contextPath%>/resources/admin/js/datatables/responsive.bootstrap.min.js"></script>
	<script
		src="<%=contextPath%>/resources/admin/js/datatables/dataTables.scroller.min.js"></script>
	<script
		src="<%=contextPath%>/resources/admin/js/datatables/fnReloadAjax.js"></script>

	<!-- pace -->
	<script src="<%=contextPath%>/resources/admin/js/pace/pace.min.js"></script>
	<script src="<%=contextPath%>/resources/admin/js/toastr/toastr.min.js"></script>
	<script
		src="<%=contextPath%>/resources/admin/js/official/official-common.js"></script>
</body>
</html>