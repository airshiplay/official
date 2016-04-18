function loginUser() {
	var username = $('#username').val();
	var password = $('#password').val();//CryptoJS.MD5($('#password').val()).toString();

	var requestData = {
		username : username,
		password : password
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
						if(respData.content.redirectUrl!=null){
							OfficialCommon.disPatcher.openPage(respData.content.redirectUrl);
						}else{
							OfficialCommon.disPatcher.openPageWWWHome();
						}
					} else {
						$btn.button('reset');
				          toastr["error"](respData.resultmsg);
					}

				},
				error : function(respData, textStatus, jqXHR) {
					var str = JSON.stringify(respData.responseText).replace(
							'}', '').replace('{', '').split(',');
					var tmpArr = [];
					var errorMsg = $.i18n
							.prop('index_alert_login_failed_syserror');
					;
					for (var i = 0; i < str.length; i++) {
						tmpArr.push(str[i].replace(/\\/g, '')
								.replace(/\"/g, '').split(':'));
					}
					for (var i = 0; i < tmpArr.length; i++) {
						if ('error_description' == tmpArr[i][0]) {
							if (tmpArr[i][1].indexOf("path") > -1) {
								errorMsg = $.i18n
										.prop('index_alert_register_duplicate_orgid');
							}
							if (tmpArr[i][1].indexOf("username") > -1) {
								errorMsg = $.i18n
										.prop('index_alert_register_duplicate_username');
							}
							if (tmpArr[i][1].indexOf("email") > -1) {
								errorMsg = $.i18n
										.prop('index_alert_register_duplicate_email');
							}
						}
					}

					layer.msg(errorMsg, 3, 5);
				}
			});
}