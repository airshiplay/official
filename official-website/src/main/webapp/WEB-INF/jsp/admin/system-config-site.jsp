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
			<jsp:include page="../admin/template/navbar.jsp" />
			<!-- page content -->
			<div class="right_col" role="main">

<div class="">

          <div class="page-title">
            <div class="title_left">
              <h3>公司信息配置</h3>
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
            <!-- 网站配置 -->
                        <div class="col-md-12 col-sm-12 col-xs-12">
              <div class="x_panel">
                <div class="x_title">
                  <h2>网站信息配置 <small>different form elements</small></h2>
                  <ul class="nav navbar-right panel_toolbox">
                    <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                    </li>
                     <li><a href="#" data-toggle="modal" data-whatever="${company.siteFavicon}" data-target="#siteModal" ><i class="fa fa-edit"></i></a>
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
                        <input type="text" id="first-name" required="required" disabled="disabled" class="form-control col-md-7 col-xs-12" value="${company.name }">
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
                        <input id="middle-name" class="form-control col-md-7 col-xs-12" type="text" disabled="disabled" name="middle-name" value="${company.tel}">
                      </div>
                    </div>
                    <div class="form-group">
                      <label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12">公司邮编</label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <input id="middle-name" class="form-control col-md-7 col-xs-12" type="text" disabled="disabled" name="middle-name" value="${company.zipcode}">
                      </div>
                    </div>
                    <!--  -->
                     <div class="ln_solid"></div>
                    <div class="form-group">
                      <label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12">网站名称</label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <input id="middle-name" class="form-control col-md-7 col-xs-12" type="text" disabled="disabled" name="middle-name" value="${company.siteTitle}">
                      </div>
                    </div>
                    <div class="form-group">
                      <label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12">网站关键字</label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <input id="middle-name" class="form-control col-md-7 col-xs-12" type="text" disabled="disabled" name="middle-name" value="${company.metaKeyword}">
                      </div>
                    </div>
                    <div class="form-group">
                      <label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12">网站描述</label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <input id="middle-name" class="form-control col-md-7 col-xs-12" type="text" disabled="disabled" name="middle-name" value="${company.metaDescription}">
                      </div>
                    </div>
                    <div class="form-group">
                      <label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12">网站作者</label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <input id="middle-name" class="form-control col-md-7 col-xs-12" type="text" disabled="disabled" name="middle-name" value="${company.metaAuthor}">
                      </div>
                    </div>
                    <div class="form-group">
                      <label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12">网站ICP备案</label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <input id="middle-name" class="form-control col-md-7 col-xs-12" type="text" disabled="disabled" name="middle-name" value="${company.siteIcp}">
                      </div>
                    </div>
                    <div class="form-group">
                      <label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12">网站域名</label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <input id="middle-name" class="form-control col-md-7 col-xs-12" type="text" disabled="disabled" name="siteDomain" value="${company.siteDomain}">
                      </div>
                    </div>
                    <div class="form-group">
                      <label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12">网站favicon</label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <img type="text" name="siteFavicon" src="${company.siteFavicon}">
                      </div>
                    </div>

                    <!-- <div class="ln_solid"></div>
                    <div class="form-group">
                      <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
                        <button type="submit" class="btn btn-primary">Cancel</button>
                        <button type="submit" class="btn btn-success">Submit</button>
                      </div>
                    </div> -->

                  </div>
                </div>
              </div>
            </div>
            
            <div class="col-md-12 col-sm-12 col-xs-12">
              <div class="x_panel">
                <div class="x_title">
                  <h2>网站风格配置 <small>different form elements</small></h2>
                  <ul class="nav navbar-right panel_toolbox">
                    <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                    </li>
                    <li><a href="#" data-toggle="modal" data-target="#companyModal" ><i class="fa fa-edit"></i></a>
                    <li><a class="close-link"><i class="fa fa-close"></i></a>
                    </li>
                  </ul>
                  <div class="clearfix"></div>
                </div>
                <div class="x_content">
                  <br />
                  <div id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">

                    <div class="radio">
                          <label>
                            <input type="radio" class="flat" checked name="iCheck"> 默认风格
                          </label>
                        </div>
                        <div class="radio">
                          <label>
                            <input type="radio" class="flat" <c:if test="${siteStyle =='dellstyle'}"> checked </c:if>  name="iCheck">${siteStyle} Dell风格
                          </label>
                    </div>

                    <!-- <div class="ln_solid"></div>
                    <div class="form-group">
                      <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
                        <button type="submit" class="btn btn-primary">Cancel</button>
                        <button type="submit" class="btn btn-success">Submit</button>
                      </div>
                    </div> -->

                  </div>
                </div>
              </div>
            </div>
          </div>
		</div>


				<!-- footer content -->
				<jsp:include page="../admin/template/footer.jsp" />
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

<div class="modal fade" id="companyModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="exampleModalLabel">修改公司信息</h4>
      </div>
      <div class="modal-body">
        <form id="companyForm" data-parsley-validate class="form-horizontal form-label-left" method="post">
           			<div class="form-group">
                      <label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name">公司名称
                      </label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <input type="text" id="name" required="required" name="name" class="form-control col-md-7 col-xs-12" value="${company.name }">
                      </div>
                    </div>
                    <div class="form-group">
                      <label class="control-label col-md-3 col-sm-3 col-xs-12" for="last-name">公司地址
                      </label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <input type="text" id="address"  name="address" required="required" class="form-control col-md-7 col-xs-12 disable" value="${company.address}">
                      </div>
                    </div>
                    <div class="form-group">
                      <label for="tel" class="control-label col-md-3 col-sm-3 col-xs-12">公司电话</label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <input id="tel" class="form-control col-md-7 col-xs-12" required="required" type="text" name="tel" value="${company.tel}">
                      </div>
                    </div>
                    <div class="form-group">
                      <label for="zipcode" class="control-label col-md-3 col-sm-3 col-xs-12">公司邮编</label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <input id="zipcode" class="form-control col-md-7 col-xs-12" required="required" type="text" name="zipcode" value="${company.zipcode}">
                      </div>
                    </div>
                    <input type="hidden"  name="id" value="${company.id}"/>
        </form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary submit" onclick="companyForm.submit();">保存</button>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->

<div class="modal fade" id="siteModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="exampleModalLabel">修改网站信息</h4>
      </div>
      <div class="modal-body">
        <form id="siteForm" data-parsley-validate class="form-horizontal form-label-left" method="post">
        
        			<div class="form-group">
                      <label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name">公司名称
                      </label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <input type="text" id="name" required="required" name="name" class="form-control col-md-7 col-xs-12" value="${company.name }">
                      </div>
                    </div>
                    <div class="form-group">
                      <label class="control-label col-md-3 col-sm-3 col-xs-12" for="last-name">公司地址
                      </label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <input type="text" id="address"  name="address" required="required" class="form-control col-md-7 col-xs-12 disable" value="${company.address}">
                      </div>
                    </div>
                    <div class="form-group">
                      <label for="tel" class="control-label col-md-3 col-sm-3 col-xs-12">公司电话</label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <input id="tel" class="form-control col-md-7 col-xs-12" required="required" type="text" name="tel" value="${company.tel}">
                      </div>
                    </div>
                    <div class="form-group">
                      <label for="zipcode" class="control-label col-md-3 col-sm-3 col-xs-12">公司邮编</label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <input id="zipcode" class="form-control col-md-7 col-xs-12" required="required" type="text" name="zipcode" value="${company.zipcode}">
                      </div>
                    </div>
                    <div class="ln_solid"></div>
                    
                    <div class="form-group">
                      <label for="siteTitle" class="control-label col-md-3 col-sm-3 col-xs-12">网站名称</label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <input id="siteTitle" class="form-control col-md-7 col-xs-12" type="text" name="siteTitle" value="${company.siteTitle}">
                      </div>
                    </div>
                    <div class="form-group">
                      <label for="metaKeyword" class="control-label col-md-3 col-sm-3 col-xs-12">网站关键字</label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <input id="metaKeyword" class="form-control col-md-7 col-xs-12" type="text" name="metaKeyword" value="${company.metaKeyword}">
                      </div>
                    </div>
                    <div class="form-group">
                      <label for="metaDescription" class="control-label col-md-3 col-sm-3 col-xs-12">网站描述</label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <input id="metaDescription" class="form-control col-md-7 col-xs-12" type="text" name="metaDescription" value="${company.metaDescription}">
                      </div>
                    </div>
                    <div class="form-group">
                      <label for="metaAuthor" class="control-label col-md-3 col-sm-3 col-xs-12">网站作者</label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <input id="metaAuthor" class="form-control col-md-7 col-xs-12" type="text" name="metaAuthor" value="${company.metaAuthor}">
                      </div>
                    </div>
                    <div class="form-group">
                      <label for="siteIcp" class="control-label col-md-3 col-sm-3 col-xs-12">网站ICP备案</label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <input id="siteIcp" class="form-control col-md-7 col-xs-12" type="text" name="siteIcp" value="${company.siteIcp}">
                      </div>
                    </div>
                    <div class="form-group">
                      <label for="siteDomain" class="control-label col-md-3 col-sm-3 col-xs-12">网站域名</label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <input id="siteDomain" class="form-control col-md-7 col-xs-12" type="text" name="siteDomain" value="${company.siteDomain}">
                      </div>
                    </div>
                    <div class="form-group">
                      <label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12">网站favicon</label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                      	<div id="my-dropzone" class="form-control col-md-7 col-xs-12" style="padding-top:0px;padding-bottom:0px;">
                        	<img id="site-favicon" type="text" src="${company.siteFavicon}" style="height:32px"/>
                        	<input type="hidden"  name="siteFavicon" value="${company.siteFavicon}"/>
                        </div>
                      </div>
                    </div>
                    <input type="hidden"  name="id" value="${company.id}"/>
        </form>
        
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary" onclick="siteForm.submit();">保存</button>
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


  		<!-- dropzone -->
  		<script src="<%=contextPath%>/resources/admin/js/dropzone/dropzone.js"></script>
        <!-- pace -->
        <script src="<%=contextPath%>/resources/admin/js/pace/pace.min.js"></script>
        <script type="text/javascript">
          var contextPath ="<%=contextPath%>";
          $(document).ready(function() {
            var myDropzone = new Dropzone("#my-dropzone",{ url: "<%=contextPath %>/file/upload"});
            myDropzone.on("addedfile", function(file) {
              /* Maybe display some more file information on your page */
            });
            myDropzone.on("sending", function(file, xhr, formData) {
            	  // Will send the filesize along with the file as POST data.
            	  formData.append("filesize", file.size);
            	});
            myDropzone.on("complete", function(file) {
            	  myDropzone.removeFile(file);
            	 var result= jQuery.parseJSON(file.xhr.responseText);
            	 var imgUrl =contextPath+"/"+result.content[0];
            	 $("#site-favicon").attr('src',imgUrl);
            	 $("#my-dropzone input").val(imgUrl);
            });
            
            $('#siteModal').on('show.bs.modal', function (event) {
            	  var button = $(event.relatedTarget) // Button that triggered the modal
            	  var imgUrl = button.data('whatever') // Extract info from data-* attributes
            	  // If necessary, you could initiate an AJAX request here (and then do the updating in a callback).
            	  // Update the modal's content. We'll use jQuery here, but you could use a data binding library or other methods instead.
            	  var modal = $(this)
            	  $("#my-dropzone input").val(imgUrl);
            	  modal.find("#site-favicon").attr('src',imgUrl);
            	  //modal.find('.modal-title').text('New message to ' + recipient)
            	  //modal.find('.modal-body input').val(recipient)
            	});
            	
          });
        </script>


</body>

</html>
