<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String contextPath = request.getContextPath();
	String fullUrl = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ contextPath;
%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <!-- Meta, title, CSS, favicons, etc. -->
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <title>后台管理平台</title>

  <!-- Bootstrap core CSS -->

  <link href="<%=fullUrl %>/resources/admin/css/bootstrap.min.css" rel="stylesheet">

  <link href="<%=fullUrl %>/resources/admin/fonts/css/font-awesome.min.css" rel="stylesheet">
  <link href="<%=fullUrl %>/resources/admin/css/animate.min.css" rel="stylesheet">

  <!-- Custom styling plus plugins -->
  <link href="<%=fullUrl %>/resources/admin/css/custom.css" rel="stylesheet">
  <link href="<%=fullUrl %>/resources/admin/css/icheck/flat/green.css" rel="stylesheet">
  <link href="<%=fullUrl %>/resources/admin/js/datatables/jquery.dataTables.min.css" rel="stylesheet" type="text/css" />
  <link href="<%=fullUrl %>/resources/admin/js/datatables/buttons.bootstrap.min.css" rel="stylesheet" type="text/css" />
  <link href="<%=fullUrl %>/resources/admin/js/datatables/fixedHeader.bootstrap.min.css" rel="stylesheet" type="text/css" />
  <link href="<%=fullUrl %>/resources/admin/js/datatables/responsive.bootstrap.min.css" rel="stylesheet" type="text/css" />
  <link href="<%=fullUrl %>/resources/admin/js/datatables/scroller.bootstrap.min.css" rel="stylesheet" type="text/css" />

  <script src="<%=fullUrl %>/resources/admin/js/jquery.min.js"></script>

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
			<jsp:include page="../template/admin/navbar.jsp" />
			<!-- page content -->
			<div class="right_col" role="main">

<div class="">

          <div class="page-title">
            <div class="title_left">
              <h3>Form Elements</h3>
            </div>
            <div class="title_right">
              <div class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
                <div class="input-group">
                  <input type="text" class="form-control" placeholder="Search for...">
                  <span class="input-group-btn">
                            <button class="btn btn-default" type="button">Go!</button>
                        </span>
                </div>
              </div>
            </div>
          </div>
          <div class="clearfix"></div>
          <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
              <div class="x_panel">
                <div class="x_title">
                  <h2>公司信息配置 <small>different form elements</small></h2>
                  <ul class="nav navbar-right panel_toolbox">
                    <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                    </li>
                    <li class="dropdown">
                      <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>
                      <ul class="dropdown-menu" role="menu">
                        <li><a href="#">修改公司信息</a>
                        </li>
                        <li><a href="#">Settings 2</a>
                        </li>
                      </ul>
                    </li>
                    <li><a class="close-link"><i class="fa fa-close"></i></a>
                    </li>
                  </ul>
                  <div class="clearfix"></div>
                </div>
                <div class="x_content">
                  <br />
                  <div id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">

                    <div class="form-group">
                      <label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name">公司名称
                      </label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <input type="text" id="first-name" required="required" class="form-control col-md-7 col-xs-12" value="${company.name }">
                      </div>
                    </div>
                    <div class="form-group">
                      <label class="control-label col-md-3 col-sm-3 col-xs-12" for="last-name">公司地址
                      </label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <input type="text" id="last-name" name="last-name" required="required" disabled="disabled" class="form-control col-md-7 col-xs-12 disable" value="${company.address}">
                      </div>
                    </div>
                    <div class="form-group">
                      <label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12">公司电话</label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <input id="middle-name" class="form-control col-md-7 col-xs-12" type="text" name="middle-name" value="${company.tel}">
                      </div>
                    </div>
                    <div class="form-group">
                      <label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12">公司邮编</label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <input id="middle-name" class="form-control col-md-7 col-xs-12" type="text" name="middle-name" value="${company.zipcode}">
                      </div>
                    </div>

                    <div class="ln_solid"></div>
                    <div class="form-group">
                      <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
                        <button type="submit" class="btn btn-primary">Cancel</button>
                        <button type="submit" class="btn btn-success">Submit</button>
                      </div>
                    </div>

                  </div>
                </div>
              </div>
            </div>
            <!-- 网站配置 -->
                        <div class="col-md-12 col-sm-12 col-xs-12">
              <div class="x_panel">
                <div class="x_title">
                  <h2>网站信息配置 <small>different form elements</small></h2>
                  <ul class="nav navbar-right panel_toolbox">
                    <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                    </li>
                    <li class="dropdown">
                      <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>
                      <ul class="dropdown-menu" role="menu">
                        <li><a href="#">Settings 1</a>
                        </li>
                        <li><a href="#">Settings 2</a>
                        </li>
                      </ul>
                    </li>
                    <li><a class="close-link"><i class="fa fa-close"></i></a>
                    </li>
                  </ul>
                  <div class="clearfix"></div>
                </div>
                <div class="x_content">
                  <br />
                  <div id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">

                    <div class="form-group">
                      <label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12">网站名称</label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <input id="middle-name" class="form-control col-md-7 col-xs-12" type="text" name="middle-name" value="${company.siteTitle}">
                      </div>
                    </div>
                    <div class="form-group">
                      <label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12">网站关键字</label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <input id="middle-name" class="form-control col-md-7 col-xs-12" type="text" name="middle-name" value="${company.metaKeyword}">
                      </div>
                    </div>
                    <div class="form-group">
                      <label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12">网站描述</label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <input id="middle-name" class="form-control col-md-7 col-xs-12" type="text" name="middle-name" value="${company.metaDescription}">
                      </div>
                    </div>
                    <div class="form-group">
                      <label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12">网站作者</label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <input id="middle-name" class="form-control col-md-7 col-xs-12" type="text" name="middle-name" value="${company.metaAuthor}">
                      </div>
                    </div>
                    <div class="form-group">
                      <label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12">网站ICP备案</label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <input id="middle-name" class="form-control col-md-7 col-xs-12" type="text" name="middle-name" value="${company.siteIcp}">
                      </div>
                    </div>
                    <div class="form-group">
                      <label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12">网站域名</label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <input id="middle-name" class="form-control col-md-7 col-xs-12" type="text" name="siteDomain" value="${company.siteDomain}">
                      </div>
                    </div>
                    <div class="form-group">
                      <label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12">网站favicon</label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <img type="text" name="siteFavicon" src="${company.siteFavicon}">
                      </div>
                    </div>

                    <div class="ln_solid"></div>
                    <div class="form-group">
                      <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
                        <button type="submit" class="btn btn-primary">Cancel</button>
                        <button type="submit" class="btn btn-success">Submit</button>
                      </div>
                    </div>

                  </div>
                </div>
              </div>
            </div>
          </div>
		</div>


				<!-- footer content -->
				<jsp:include page="../template/admin/footer.jsp" />
				<!-- /footer content -->

			</div>
			<!-- /page content -->
		</div>
	</div>

	<div id="custom_notifications" class="custom-notifications dsp_none">
          <ul class="list-unstyled notifications clearfix" data-tabbed_notifications="notif-group">
          </ul>
          <div class="clearfix"></div>
          <div id="notif-group" class="tabbed_notifications"></div>
        </div>

        <script src="<%=fullUrl %>/resources/admin/js/bootstrap.min.js"></script>

        <!-- bootstrap progress js -->
        <script src="<%=fullUrl %>/resources/admin/js/progressbar/bootstrap-progressbar.min.js"></script>
        <script src="<%=fullUrl %>/resources/admin/js/nicescroll/jquery.nicescroll.min.js"></script>
        <!-- icheck -->
        <script src="<%=fullUrl %>/resources/admin/js/icheck/icheck.min.js"></script>

        <script src="<%=fullUrl %>/resources/admin/js/custom.js"></script>


        <!-- Datatables -->
        <!-- <script src="<%=fullUrl %>/resources/admin/js/datatables/js/jquery.dataTables.js"></script>
  <script src="<%=fullUrl %>/resources/admin/js/datatables/tools/js/dataTables.tableTools.js"></script> -->

        <!-- Datatables-->
        <script src="<%=fullUrl %>/resources/admin/js/datatables/jquery.dataTables.min.js"></script>
        <script src="<%=fullUrl %>/resources/admin/js/datatables/dataTables.bootstrap.js"></script>
        <script src="<%=fullUrl %>/resources/admin/js/datatables/dataTables.buttons.min.js"></script>
        <script src="<%=fullUrl %>/resources/admin/js/datatables/buttons.bootstrap.min.js"></script>
        <script src="<%=fullUrl %>/resources/admin/js/datatables/jszip.min.js"></script>
        <script src="<%=fullUrl %>/resources/admin/js/datatables/pdfmake.min.js"></script>
        <script src="<%=fullUrl %>/resources/admin/js/datatables/vfs_fonts.js"></script>
        <script src="<%=fullUrl %>/resources/admin/js/datatables/buttons.html5.min.js"></script>
        <script src="<%=fullUrl %>/resources/admin/js/datatables/buttons.print.min.js"></script>
        <script src="<%=fullUrl %>/resources/admin/js/datatables/dataTables.fixedHeader.min.js"></script>
        <script src="<%=fullUrl %>/resources/admin/js/datatables/dataTables.keyTable.min.js"></script>
        <script src="<%=fullUrl %>/resources/admin/js/datatables/dataTables.responsive.min.js"></script>
        <script src="<%=fullUrl %>/resources/admin/js/datatables/responsive.bootstrap.min.js"></script>
        <script src="<%=fullUrl %>/resources/admin/js/datatables/dataTables.scroller.min.js"></script>


        <!-- pace -->
        <script src="<%=fullUrl %>/resources/admin/js/pace/pace.min.js"></script>
        <script>
          var handleDataTableButtons = function() {
              "use strict";
              0 !== $("#datatable-buttons").length && $("#datatable-buttons").DataTable({
                dom: "Bfrtip",
                buttons: [{
                  extend: "copy",
                  className: "btn-sm"
                }, {
                  extend: "csv",
                  className: "btn-sm"
                }, {
                  extend: "excel",
                  className: "btn-sm"
                }, {
                  extend: "pdf",
                  className: "btn-sm"
                }, {
                  extend: "print",
                  className: "btn-sm"
                }],
                responsive: !0
              })
            },
            TableManageButtons = function() {
              "use strict";
              return {
                init: function() {
                  handleDataTableButtons()
                }
              }
            }();
        </script>
        <script type="text/javascript">
          $(document).ready(function() {
            $('#datatable').dataTable({
            	"processing": true,
                "serverSide": true,
                "ajax" : "user/list/ajax",
                "columns": [
                  {"data": "id", "bSortable": false},
                  {"data": "username"},
                  {"data": "email"},
                  {"data": "nickname"},
                  {"data": "latestLoginTime"}
                ],
                "columnDefs": [
                  {
                    "targets": [5],
                    "data": "id",
                    "render": function(data, type, full) {
                      return "<a href='/update?id=" + data + "'>Update</a>";
                    }
                  }
                ]
            });
           /*  $('#datatable-keytable').DataTable({
              keys: true
            });
            $('#datatable-responsive').DataTable();
            $('#datatable-scroller').DataTable({
              ajax: "js/datatables/json/scroller-demo.json",
              deferRender: true,
              scrollY: 380,
              scrollCollapse: true,
              scroller: true
            });
            var table = $('#datatable-fixed-header').DataTable({
              fixedHeader: true
            }); */
          });
          TableManageButtons.init();
        </script>


</body>

</html>
