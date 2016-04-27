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
  <title>${webSite.siteTitle}后台管理平台</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <!-- Meta, title, CSS, favicons, etc. -->
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="icon" href="${webSite.siteFavicon}">
  <!-- Bootstrap core CSS -->

  <link href="<%=contextPath%>/resources/admin/css/bootstrap.min.css" rel="stylesheet">

  <link href="<%=contextPath%>/resources/admin/fonts/css/font-awesome.min.css" rel="stylesheet">
  <link href="<%=contextPath%>/resources/admin/css/animate.min.css" rel="stylesheet">

  <!-- Custom styling plus plugins -->
  <link href="<%=contextPath%>/resources/admin/css/custom.css" rel="stylesheet">
  <link href="<%=contextPath%>/resources/admin/css/icheck/flat/green.css" rel="stylesheet">
  <link href="<%=contextPath%>/resources/admin/js/datatables/jquery.dataTables.min.css" rel="stylesheet" type="text/css" />
  <link href="<%=contextPath%>/resources/admin/js/datatables/buttons.bootstrap.min.css" rel="stylesheet" type="text/css" />
  <link href="<%=contextPath%>/resources/admin/js/datatables/fixedHeader.bootstrap.min.css" rel="stylesheet" type="text/css" />
  <link href="<%=contextPath%>/resources/admin/js/datatables/responsive.bootstrap.min.css" rel="stylesheet" type="text/css" />
  <link href="<%=contextPath%>/resources/admin/js/datatables/scroller.bootstrap.min.css" rel="stylesheet" type="text/css" />
  <link href="<%=contextPath%>/resources/admin/css/multiselect/bootstrap-multiselect.css" rel="stylesheet" type="text/css" />
  <link href="<%=contextPath%>/resources/admin/js/toastr/toastr.min.css" rel="stylesheet" type="text/css" />
  <script src="<%=contextPath%>/resources/admin/js/jquery.min.js"></script>
  <script src="<%=contextPath%>/resources/admin/js/jquery.cookie.js"></script>
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

      <jsp:include page="../admin/template/navbar.jsp"/> 
      <!-- page content -->
      <div class="right_col" role="main">
        <div class="">
          <div class="page-title">
            <div class="title_left">
              <h3>
                    用户管理
                    <small>
                        Some examples to get you started
                    </small>
                </h3>
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
                  <h2>Default Example <small>Users</small></h2>
                  <ul class="nav navbar-right panel_toolbox">
                    <li><a href="#"><i class="fa fa-chevron-up"></i></a>
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
                    <li><a href="#"  data-toggle="modal" data-target="#userModal" ><i class="fa fa-plus"></i></a>
                    <li><a href="#"><i class="fa fa-close"></i></a>
                    </li>
                  </ul>
                  <div class="clearfix"></div>
                </div>
                <div class="x_content">
                  <p class="text-muted font-13 m-b-30">
                    
                  </p>
                  <table id="datatable" class="table table-striped table-bordered">
                    <thead>
                      <tr>
                      	<th>序号</th>
                        <th>用户名</th>
                        <th>邮箱</th>
                        <th>昵称</th>
                        <th>角色</th>
                        <th>登录日期</th>
                        <th>操作</th>
                      </tr>
                    </thead>

                  </table>
                </div>
              </div>
            </div>

                </div>
              </div>
              <!-- footer content -->
             <jsp:include page="../admin/template/footer.jsp"/> 
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
<div class="modal fade" id="userModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="exampleModalLabel">新建修改用户</h4>
      </div>
      <div class="modal-body">
        <form id="companyForm" data-parsley-validate class="form-horizontal form-label-left" method="post">
           <div class="form-group">
                      <label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name">用户名
                      </label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <input type="text" id="username" required="required" name="username" class="form-control col-md-7 col-xs-12" value="">
                      </div>
                    </div>
                    <div class="form-group">
                      <label class="control-label col-md-3 col-sm-3 col-xs-12" for="last-name">用户昵称
                      </label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <input type="text" id="nickname"  name="nickname" required="required" class="form-control col-md-7 col-xs-12 disable" value="">
                      </div>
                    </div>
                    <div class="form-group">
                      <label for="tel" class="control-label col-md-3 col-sm-3 col-xs-12">用户邮箱</label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <input id="email" class="form-control col-md-7 col-xs-12" required="required" type="text" name="email" value="">
                      </div>
                    </div>
                    <div class="form-group">
                      <label for="tel" class="control-label col-md-3 col-sm-3 col-xs-12">密码</label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <input id="password" class="form-control col-md-7 col-xs-12" required="required" type="text" name="password">
                      </div>
                    </div>
                    <div class="form-group">
                      <label for="zipcode" class="control-label col-md-3 col-sm-3 col-xs-12">角色选择</label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <select id="roles" class= "form-control" ><!-- multiple="multiple" -->
                        </select>
                      </div>
                    </div>
                    <input type="hidden" id="id" name="id" value=""/>
        </form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="button" id="submit" class="btn btn-primary submit" onclick="updateUser();">保存</button>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->

<div class="modal fade" id="delUserModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
    <div class="modal-header">
		<button type="button" class="close" data-dismiss="modal"
			aria-label="Close">
			<span aria-hidden="true">&times;</span>
		</button>
		<h4 class="modal-title" id="exampleModalLabel"> <c:if test="${cfgTag==null }">删除标签</c:if> <c:if test="${cfgTag!=null }">修改标签</c:if></h4>
	</div>
	<div class="modal-body">
		确认删除此标签？
	</div>
	<div class="modal-footer">
		<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
		<button id="deltag_id" type="button" class="btn btn-primary submit" data-loading-text="Loading..."
			onclick="delTag()">删除</button>
	</div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->
        <script src="<%=contextPath%>/resources/admin/js/bootstrap.min.js"></script>

        <!-- bootstrap progress js -->
        <script src="<%=contextPath%>/resources/admin/js/progressbar/bootstrap-progressbar.min.js"></script>
        <script src="<%=contextPath%>/resources/admin/js/nicescroll/jquery.nicescroll.min.js"></script>
        <!-- icheck -->
        <script src="<%=contextPath%>/resources/admin/js/icheck/icheck.min.js"></script>

        <script src="<%=contextPath%>/resources/admin/js/custom.js"></script>


        <!-- Datatables -->
        <!-- <script src="<%=contextPath%>/resources/admin/js/datatables/js/jquery.dataTables.js"></script>
  <script src="<%=contextPath%>/resources/admin/js/datatables/tools/js/dataTables.tableTools.js"></script> -->

        <!-- Datatables-->
        <script src="<%=contextPath%>/resources/admin/js/datatables/jquery.dataTables.min.js"></script>
        <script src="<%=contextPath%>/resources/admin/js/datatables/dataTables.bootstrap.js"></script>
        <script src="<%=contextPath%>/resources/admin/js/datatables/dataTables.buttons.min.js"></script>
        <script src="<%=contextPath%>/resources/admin/js/datatables/buttons.bootstrap.min.js"></script>
        <script src="<%=contextPath%>/resources/admin/js/datatables/jszip.min.js"></script>
        <script src="<%=contextPath%>/resources/admin/js/datatables/pdfmake.min.js"></script>
        <script src="<%=contextPath%>/resources/admin/js/datatables/vfs_fonts.js"></script>
        <script src="<%=contextPath%>/resources/admin/js/datatables/buttons.html5.min.js"></script>
        <script src="<%=contextPath%>/resources/admin/js/datatables/buttons.print.min.js"></script>
        <script src="<%=contextPath%>/resources/admin/js/datatables/dataTables.fixedHeader.min.js"></script>
        <script src="<%=contextPath%>/resources/admin/js/datatables/dataTables.keyTable.min.js"></script>
        <script src="<%=contextPath%>/resources/admin/js/datatables/dataTables.responsive.min.js"></script>
        <script src="<%=contextPath%>/resources/admin/js/datatables/responsive.bootstrap.min.js"></script>
        <script src="<%=contextPath%>/resources/admin/js/datatables/dataTables.scroller.min.js"></script>
        <script src="<%=contextPath%>/resources/admin/js/multiselect/bootstrap-multiselect.js"></script>

        <script src="<%=contextPath%>/resources/admin/js/toastr/toastr.min.js"></script>

        <!-- pace -->
        <script src="<%=contextPath%>/resources/admin/js/pace/pace.min.js"></script>
        <script src="<%=contextPath%>/resources/admin/js/official/official-common.js"></script>
        <script src="<%=contextPath%>/resources/admin/js/official/official-user.js"></script>

</body>

</html>
