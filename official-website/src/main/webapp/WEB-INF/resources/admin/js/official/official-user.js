var roles;
accessToken=getAccessToken();
$.ajax({
	url : contextPath+'/admin/system/user/role/list/ajax',
	type : 'POST',
	crossDomain : true,
	headers : {
		'Authorization': 'Bearer ' + accessToken,
		'Content-Type' : 'application/json'
	},
	data : JSON.stringify("{}"),
	success : function(respData, textStatus, jqXHR) {
		if (respData.resultcode == 200) {
			roles=respData.content;
		} else {
		}

	},
	error : function(respData, textStatus, jqXHR) {
	
	}
});
$(document).ready(function() {
			var table=$('#datatable').dataTable({
				"processing" : true,
				"serverSide" : true,
				"ordering":false,
				"searching":false,
				"lengthChange": false,
				"pageLength": 50,
				"ajax" : "user/list/ajax",
				"language": { "url": contextPath+"/resources/admin/js/datatables/language/zh_CN.lang" } ,
				"columns" : [ {
					"data" : "id",
					"bSortable" : false
				}, {
					"data" : "username"
				}, {
					"data" : "email"
				}, {
					"data" : "nickname"
				}, {
					"data" : "roles",
					render : function(data, type, row) {
						var result="";
						for (var i = 0; i < row.roles.length; i++) {
							if(i!=0)
								result = result +",";
							result = result + row.roles[i].roleName;
						}
						return result;
					}
				}, {
					"data" : "latestLoginTime",render:function(data,type,row,meta){
						return format(data);
					}
				} ],
				"columnDefs" : [ {
					"targets" : [ 6 ],
					"data" : "id",
					"render" : function(data, type, row, meta) {
						var edit="<a href=# class=\"btn btn-info btn-xs\" data-toggle=\"modal\" data-row=\""+meta.row+"\" data-target=\"#userModal\" ><i class=\"fa fa-pencil\"></i> Edit </a>";
                    	var del="<a href=# class=\"btn btn-danger btn-xs\"  data-toggle=\"modal\" data-row=\""+meta.row+"\" data-target=\"#userModal\" ><i class=\"fa fa-trash-o\"></i> Delete </a>";
						if(row.id==1){
							return edit;
						}else if(row.username==getCusername()){
							return edit;
						}
						return edit+del;
					}
				} ]
			});
			 $('#userModal').on('show.bs.modal', function (event) {
           	  var button = $(event.relatedTarget) // Button that triggered the modal
           	  var rowid = button.data('row') // Extract info from data-* attributes
           	  // If necessary, you could initiate an AJAX request here (and then do the updating in a callback).
           	  // Update the modal's content. We'll use jQuery here, but you could use a data binding library or other methods instead.
           	  var modal = $(this);
           	  if(rowid!=undefined){
           		var rowdata=$('#datatable').DataTable().row(rowid).data();
           		modal.find('#exampleModalLabel').html('修改用户');
           		modal.find('#id').val(rowdata.id);
           		modal.find('#username').val(rowdata.username);
           		modal.find('#nickname').val(rowdata.nickname);
           		modal.find('#email').val(rowdata.email);
           		modal.find('#password').attr('placeholder',"如无需修改，请不必输入");
           		
           	  }else{
           		modal.find('#exampleModalLabel').html('新建用户');
           		modal.find('#id').val(null);
           		modal.find('#username').val('');
           		modal.find('#nickname').val('');
           		modal.find('#email').val('');
           		modal.find('#password').attr('placeholder',"" );
           	  }
           	  var r= 	modal.find('#roles');
           	var options=[];
           	  $.each(roles, function(i,val){ 
           		var option = new Object();
             	  option.label=val.roleName;
             	  option.title=val.roleName;
             	  option.value=val.id;
             	  option.selected=false;
             	  option.disabled=false;
             	 options.push(option);
           	  });
           	  r.multiselect('dataprovider', options);
           	modal.find("#submit").attr("onClick","updateUser("+rowid+")");
           	  //$('#roles option:selected');
           	});
});
		

function updateUser(rowid) {
	var uid = $('#id').val()==("")?null:$('#id').val();
	var username = $('#username').val();
	var nickname = $('#nickname').val();
	var email = $('#email').val();
	var password=$('#password').val();
	var roles =[];
	$('#roles option:selected').each(function(i, el){
		 //console.log(i+el+$(el).val());
		 roles.push({id:$(el).val()});
	});
	var requestData = {
		id : uid,
		username : username,
		roles:roles,
		email:email,
		nickname:nickname,
		password:password
	};
	$.ajax({
		url : contextPath + '/admin/system/user/merge/ajax',
		type : 'POST',
		crossDomain : true,
		headers : {
			'Content-Type' : 'application/json'
		},
		data : JSON.stringify(requestData),
		success : function(respData, textStatus, jqXHR) {
			if (respData.resultcode == 200) {
				 $('#userModal').modal('hide');
				 $('#datatable').DataTable().ajax.reload();
				 if(uid==null){
					 toastr["success"]("创建用户成功！");
				 }else{
					 toastr["success"]("修改用户成功！");
				 }
			}else if (respData.resultcode == 302) {
				OfficialCommon.disPatcher.openPage(respData.redirectUrl);
			}  else {
				 toastr["error"](respData.resultmsg);
			}

		},
		error : function(respData, textStatus, jqXHR) {

		}
	});

}