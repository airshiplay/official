$(document).ready(function() {
     $('#datatable').dataTable({
            	"processing": true,
                "serverSide": true,
                "ordering":false,
                "searching":false,
				"lengthChange": false,
                "ajax" : "role/list/ajax",
                "language": { "url": contextPath+"/resources/admin/js/datatables/language/zh_CN.lang" } ,
                "columns": [
                  {"data": "id", "bSortable": false},
                  {"data": "roleName"},
                  {"data": "createTime"},
                  {"data": "authority",render : function(data, type, row) {
						var result="";
						for (var i = 0; i < row.authorities.length; i++) {
							if(i!=0)
								result = result +",";
							result = result + row.authorities[i].authorityName;
						}
						return result;
					}}
                ],
                "columnDefs": [
                  {
                    "targets": [4],
                    "data": "id",
                    "render": function(data, type, full) {
                    	var view="<a href=# class=\"btn btn-primary btn-xs\"><i class=\"fa fa-folder\"></i> View </a>";
                    	var edit="<a href=# class=\"btn btn-info btn-xs\"><i class=\"fa fa-pencil\"></i> Edit </a>";
                    	var del="<a href=# class=\"btn btn-danger btn-xs\"><i class=\"fa fa-trash-o\"></i> Delete </a>";
                    	return view+edit+del;
                      //return "<a href='/update?id=" + data + "'>Update</a>";
                    }
                  }
                ]
            });
});