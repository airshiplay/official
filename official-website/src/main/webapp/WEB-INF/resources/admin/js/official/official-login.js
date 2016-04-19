function loginUser() {
	var username = $('#username').val();
	var password = $('#password').val();// CryptoJS.MD5($('#password').val()).toString();

	var requestData = {
		username : username,
		password : password,
		display : 'web'
	};
	var $btn = $("#login_id").button('loading');
	$.ajax({
		url : 'login',
		type : 'POST',
		crossDomain : true,
		headers : {
			'Content-Type' : 'application/json'
		},
		data : JSON.stringify(requestData),
		success : function(respData, textStatus, jqXHR) {
			if (respData.resultcode == 200) {
				toastr["success"]("登录成功！");
				setCusername(username);
				setAccessToken(respData.content.accessToken);
				if (respData.content.redirectUrl != null) {
					OfficialCommon.disPatcher
							.openPage(respData.content.redirectUrl);
				} else {
					OfficialCommon.disPatcher.openPageWWWHome();
				}
			} else {
				$btn.button('reset');
				toastr["error"](respData.resultmsg);
			}

		},
		error : function(respData, textStatus, jqXHR) {

			$btn.button('reset');
			toastr["error"]("网络异常");

			layer.msg(errorMsg, 3, 5);
		}
	});
}