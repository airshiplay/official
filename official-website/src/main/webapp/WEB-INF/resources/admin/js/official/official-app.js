$.ajax({
                url: baseUrl + '/management/organizations/' + orgName + '/applications',
                type: 'POST',
                headers: {
                    'Authorization': 'Bearer ' + accessToken,
                    'Content-Type': 'application/json'
                },
                data: JSON.stringify(dataBody),
                error: function (jqXHR, textStatus, errorThrown) {
                    layer.msg($.i18n.prop('app_create_form_failed'), 3, 5);
                },
                success: function (respData, textStatus, jqXHR) {
                    layer.msg($.i18n.prop('app_create_form_succ'), 3, 1);
                    $(respData.entities).each(function () {
                        var appName = this.applicationName;
                        if (appName != null && appName != "") {
                            var date = new Date();
                            date.setTime(date.getTime() + (7 * 24 * 60 * 60 * 1000));
                            $.cookie('appName'+getCookieNameSufix(), appName, {path: '/', domain: baseDomain, expires: date});
                            EasemobCommon.disPatcher.toPageAppInfo();
                        } else {
                            $.cookie("appName", null, {path: "/"});
                            EasemobCommon.disPatcher.toPageAppList();
                        }
                    });
                }
            });