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

  <title>DataTables | Gentallela</title>

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
  <link href="<%=contextPath%>/resources/admin/js/toastr/toastr.min.css" rel="stylesheet" type="text/css" />



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

<jsp:include page="../admin/template/navbar.jsp"/> 
      <!-- /top navigation -->

      <!-- page content -->
      <div class="right_col" role="main">
        <div class="">
          <div class="page-title">
            <div class="title_left">
              <h3>
                    标签管理
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
                  <h2>标签管理 <small>Users</small></h2>
                  <ul class="nav navbar-right panel_toolbox">
                    <li><a href="#"><i class="fa fa-chevron-up"></i></a>
                    </li>
                    <li><a href="<%=contextPath%>/admin/config/tags/create"  data-toggle="modal" data-target="#tagsModal" ><i class="fa fa-plus"></i></a>
                    <li><a href="#"><i class="fa fa-close"></i></a>
                    </li>
                  </ul>
                  <div class="clearfix"></div>
                </div>
                <div class="x_content">
                  <table id="datatable" class="table table-striped table-bordered dt-responsive nowrap" cellspacing="0" width="100%">
                    <thead>
                      <tr>
                        <th>序号</th>
                        <th>标签类型</th>
                        <th>标签名称</th>
                        <th>标签描述</th>
                        <th>状态</th>
                        <th>操作</th>
                      </tr>
                    </thead>
                  </table>
                </div>
              </div>
            </div>
<!-- end -->
                  <!-- end -->
                </div>
              </div>
              <!-- footer content -->
              <footer>
               <jsp:include page="../admin/template/footer.jsp"/> 
              </footer>
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
<div class="modal fade" id="tagsModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->
<div class="modal fade" id="tagsDelModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
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
        <!-- icheck -->
        <script src="<%=contextPath%>/resources/admin/js/icheck/icheck.min.js"></script>

        <script src="<%=contextPath%>/resources/admin/js/custom.js"></script>


        <!-- Datatables -->
        <!-- <script src="js/datatables/js/jquery.dataTables.js"></script>
  <script src="js/datatables/tools/js/dataTables.tableTools.js"></script> -->

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
        <script src="<%=contextPath%>/resources/admin/js/datatables/fnReloadAjax.js"></script>


        <!-- pace -->
        <script src="<%=contextPath%>/resources/admin/js/pace/pace.min.js"></script>
        <script src="<%=contextPath%>/resources/admin/js/toastr/toastr.min.js"></script>
	<script type="text/javascript">
	var contextPath="<%=contextPath%>";
		function delTag(id) {
			var $btn = $("#deltag_id").button('loading')
			$.ajax({
				url:contextPath+'/admin/config/tags/del/ajax',
				async:true,
				contentType: "application/json; charset=utf-8",
				dataType:'json',
				type:'POST',
				data:JSON.stringify({id:id}),
				success:function(data , textStatus){
					 $('#tagsDelModal').modal('hide');
					 $btn.button('reset');
					 toastr["success"]("删除成功！");
					 $('#datatable').DataTable().ajax.reload();
				},
				error: function(jqXHR , textStatus , errorThrown){
			          $('#tagsDelModal').modal('hide')
			          $btn.button('reset');
			          toastr["error"]("删除失败")
			    },
			});
		};
	</script>
	<script type="text/javascript">
	var globleTagsTable;
        $(document).ready(function() {
           var tagsTable= $('#datatable').dataTable({
            	"processing": true,
                "serverSide": true,
                "ordering":false,
                "ajax" : "tags/list/ajax",
                "language": { "url": contextPath+"/resources/admin/js/datatables/language/zh_CN.lang" } ,
                "columns": [
                  {"data": "id", "bSortable": false},
                  {"data": "tagType",render: function ( data, type, row ) {
                	  if(data==1){
                		  return "用户标签";
                	  }else if(data==2){
                		  return "文章标签";
                	  }
                      return "未知类型"+data;
                  }},
                  {"data": "tagName"},
                  {"data": "tagDesc"},
                  {"data": "status",render: function ( data, type, row ) {
                	  if(data==1){
                		  return "禁用";
                	  }else if(data==2){
                		  return "启用";
                	  }
                      return "未知类型"+data;
                  }}
                ],
                "columnDefs": [
					{
					    "targets": [0],
					    "data": "id",
					    "render": function(data, type, row, meta ) {
					    	return meta.row+1 ;
					    }
					  },
                  {
                    "targets": [5],
                    "data": "id",
                    "render": function(data, type, full) {
                    	var view="<a href=# class=\"btn btn-primary btn-xs\"><i class=\"fa fa-folder\"></i> View </a>";
                    	var edit="<a href=\'<%=contextPath%>/admin/config/tags/modify/"+full.id+"\' class=\"btn btn-info btn-xs\" data-toggle=\"modal\" data-whatever=\""+full+"\" data-target=\"#tagsModal\" ><i class=\"fa fa-pencil\"></i> Edit </a>";
                    	var del="<a href=# class=\"btn btn-danger btn-xs\"  data-toggle=\"modal\" data-whatever=\""+full.id+"\" data-target=\"#tagsDelModal\" ><i class=\"fa fa-trash-o\"></i> Delete </a>";
                    	return  edit+del;
                    }
                  }
                ]
            });
           globleTagsTable= tagsTable;
           $('#tagsDelModal').on('show.bs.modal', function (event) {
        	   var button = $(event.relatedTarget) // Button that triggered the modal
        	   var id = button.data('whatever') // Extract info from data-* attributes
        	   // If necessary, you could initiate an AJAX request here (and then do the updating in a callback).
        	   // Update the modal's content. We'll use jQuery here, but you could use a data binding library or other methods instead.
        	   var modal = $(this);
        	   modal.find("#deltag_id").attr("onClick","delTag("+id+")");
        	 });
          });
        </script>
</body>

</html>
