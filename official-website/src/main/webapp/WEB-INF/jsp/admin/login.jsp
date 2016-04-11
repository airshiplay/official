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

  <title>Gentallela Alela! | </title>

  <!-- Bootstrap core CSS -->

  <link href="<%=fullUrl %>/resources/admin/css/bootstrap.min.css" rel="stylesheet">

  <link href="<%=fullUrl %>/resources/admin/fonts/css/font-awesome.min.css" rel="stylesheet">
  <link href="<%=fullUrl %>/resources/admin/css/animate.min.css" rel="stylesheet">

  <!-- Custom styling plus plugins -->
  <link href="<%=fullUrl %>/resources/admin/css/custom.css" rel="stylesheet">
  <link href="<%=fullUrl %>/resources/admin/css/icheck/flat/green.css" rel="stylesheet">


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

<body style="background:#F7F7F7;">

  <div class="">
    <a class="hiddenanchor" id="toregister"></a>
    <a class="hiddenanchor" id="tologin"></a>

    <div id="wrapper">
      <div id="login" class="animate form">
        <section class="login_content">
          <form id="loginForm" data-parsley-validate  class="form-horizontal form-label-left" method="post">
            <h1>Login Form</h1>

            <div>
              <input id="username" type="text" name="username"  class="form-control" placeholder="Username" required="required" />
            </div>
            <div>
              <input id="password" type="password" name="password"  class="form-control" placeholder="Password" required="required" />
            </div>
            <div>
             <button type="submit" class="btn btn-default">Log in</button>
              <!-- <a class="btn btn-default submit" href="index.html">Log in</a> -->
              <a class="reset_pass" href="#">Lost your password?</a>
            </div>
            <div class="clearfix"></div>
            <div class="separator">

              <p class="change_link">New to site?
                <a href="#toregister" class="to_register"> Create Account </a>
              </p>
              <div class="clearfix"></div>
              <br />
              <div>
                <h1><i class="fa fa-paw" style="font-size: 26px;"></i> Gentelella Alela!</h1>

                <p>Â©2015 All Rights Reserved. Gentelella Alela! is a Bootstrap 3 template. Privacy and Terms</p>
              </div>
            </div>
          </form>
          <!-- form -->
        </section>
        <!-- content -->
      </div>
      <div id="register" class="animate form">
        <section class="login_content">
          <form id="registerForm">
            <h1>Create Account</h1>
            <div>
              <input id="username" type="text" class="form-control" placeholder="Username" required="请输入用户名" />
            </div>
            <div>
              <input id="email" type="email" class="form-control" placeholder="Email" required="" />
            </div>
            <div>
              <input id="password" type="password" class="form-control" placeholder="Password" required="" />
            </div>
            <div>
              <a class="btn btn-default submit" href="index.html">Submit</a>
            </div>
            <div class="clearfix"></div>
            <div class="separator">

              <p class="change_link">Already a member ?
                <a href="#tologin" class="to_register"> Log in </a>
              </p>
              <div class="clearfix"></div>
              <br />
              <div>
                <h1><i class="fa fa-paw" style="font-size: 26px;"></i> Gentelella Alela!</h1>

                <p>Â©2015 All Rights Reserved. Gentelella Alela! is a Bootstrap 3 template. Privacy and Terms</p>
              </div>
            </div>
          </form>
          <!-- form -->
        </section>
        <!-- content -->
      </div>
    </div>
  </div>
    <!-- form validation -->
  <script type="text/javascript" src="<%=fullUrl %>/resources/admin/js/parsley/parsley.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {
			/* $.listen('parsley:field:validate', function() {
				validateFront();
			}); */
			/* $('#loginForm .btn').on('click', function() {
				$('#loginForm').parsley().validate();
				validateFront();
				if (true === $('#loginForm').parsley().isValid()) {
					//alert("");
				}else{
					
				}
			}); */
			/* var validateFront = function() {
				if (true === $('#loginForm').parsley().isValid()) {
					$('.bs-callout-info').removeClass('hidden');
					$('.bs-callout-warning').addClass('hidden');
				} else {
					$('.bs-callout-info').addClass('hidden');
					$('.bs-callout-warning').removeClass('hidden');
				}
			}; */
		});
	</script>
</body>

</html>
