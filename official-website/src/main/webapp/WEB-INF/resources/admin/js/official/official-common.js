document.write("<script src='/resources/admin/js/official/official-config.js' language=javascript></script>");
String.prototype.Trim = function() {
	var m = this.match(/^\s*(\S+(\s+\S+)*)\s*$/);
	return (m == null) ? "" : m[1];
};

String.prototype.isMobile = function() {
	return (/^(?:13\d|15[89])-?\d{5}(\d{3}|\*{3})$/.test(this.Trim()));
};

String.prototype.isTel = function() {
	// "兼容格式: 国家代码(2到3位)-区号(2到3位)-电话号码(7到8位)-分机号(3位)"
	return (/^(([0\+]\d{2,3}-)?(0\d{2,3})-)(\d{7,8})(-(\d{3,}))?$/.test(this
			.Trim()));
};
function getAccessToken() {
	return $.cookie('access_token' + getCookieNameSufix());
}
function getCuser() {
	return $.cookie('cuser' + getCookieNameSufix());
}

function getCusername() {
	return $.cookie('cuserName' + getCookieNameSufix());
}

function getEmail() {
	return $.cookie('email' + getCookieNameSufix());
}
function getTelephone() {
	return $.cookie('telephone' + getCookieNameSufix());
}
function setAccessToken(accessToken) {
	var date = new Date();
	date.setTime(date.getTime() + (7 * 24 * 60 * 60 * 1000));
	$.cookie('access_token' + getCookieNameSufix(), accessToken, {
		path : '/',
		expires : date
	});
}
function setCusername(username) {
	return $.cookie('cuserName' + getCookieNameSufix(),username);
}
// 获取url参数
function getQueryString(name) {
	var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
	var r = window.location.search.substr(1).match(reg);
	if (r != null)
		return unescape(r[2]);
	return null;
}
// 时间格式转换 1399434332770 ->
function add0(m) {
	return m < 10 ? '0' + m : m;
}
function format(timeST) {
	var time = new Date(parseInt(timeST));
	var y = time.getFullYear();
	var m = time.getMonth() + 1;
	var d = time.getDate();
	var h = time.getHours();
	var mm = time.getMinutes();
	var s = time.getSeconds();
	return y + '-' + add0(m) + '-' + add0(d) + ' ' + add0(h) + ':' + add0(mm)
			+ ':' + add0(s);
}
// 文件后缀校验
function validateFileSuffix(fileName) {
	var fileExt = fileName.substr(fileName.lastIndexOf(".")).toLowerCase();
	var allowExt = '.p12';
	if (allowExt != fileExt) {
		layer.msg($.i18n.prop('app_notifiers_layer_typeError') + ' ['
				+ (fileExt == '' ? ' Null' : fileExt) + ']', 3, 5);
		return false;
	}
	return true;
}

function checkTel(value) {
	var isChinaPhone = /^([0-9]{3,4}-)?[0-9]{7,8}$/;
	var isChinaMobile = /^(((\+?86)|(\(\+86\)))?(1[0-9]{10}))$/;
	var isMalaysia = /^(((\+?60)|(\(\+60\)))?([0123456789]{7}|[0123456789]{8}|[0123456789]{9}))$/;
	var isSingapore = /^(((\+?65)|(0065)|(\+0065)|(\(\+65\)))?[0123456789]{7,10})$/;

	return isChinaPhone.test(value) || isSingapore.test(value)
			|| isChinaMobile.test(value) || isMalaysia.test(value);
}
function getCookieNameSufix() {
	var url = window.location.href;
	var cookieNameSufix = 'official';

	// if(url.indexOf('console') > -1 && url.indexOf('easemob.com') > -1) {
	// var targetFreg = url.substring(url.indexOf('console') + 8,
	// url.indexOf('easemob.com') - 1);
	// if('.' == targetFreg) {
	// cookieNameSufix = 'bj';
	// } else {
	// cookieNameSufix = '-' + targetFreg;
	// }
	return cookieNameSufix;
	// }
}

var OfficialCommon = function() {
	// fetch token from cookie
	var getToken = function() {
		return getAccessToken();
	};

	return {
		httpMethod : {
			POST : 'POST',
			GET : 'GET',
			DELETE : 'DELETE',
			PUT : 'PUT'
		},

		disPatcher : {
			openPageWWWHome : function() {
				window.location.href ='http://127.0.0.1:8080/admin/home';
			},
			openPage : function(url) {
				window.location.href =url;
			},
			refreshCurrentPage : function() {
				location.replace(location.href);
			},
			toPageIMCloudLogin : function() {
				window.location.href = 'index.html';
			},
			toPageIMCloudRegister : function() {
				window.location.href = 'index_register.html';
			},
			toPageIMCloudForgotPassword : function() {
				window.location.href = 'index_forgotpwd.html';
			},
			sessionTimeOut : function() {
				this.logOut();
			}
		}
	};
}();
