$(document).ready(function() {
      $('#datatable').dataTable({
            	"processing": true,
                "serverSide": true,
                "ordering": false,
                "searching": false,
                "lengthChange": false,
                "ajax" : "page/list/ajax",
                "language": { "url": contextPath+"/resources/admin/js/datatables/language/zh_CN.lang" } ,
                "columns": [
                  {"data": "id", "bSortable": false},
                  {"data": "name"},
                  {"data": "urlPath"},
                  {"data": "status",render: function ( data, type, row ) {
                	  if(data==undefined){
                		  return '';
                	  }else if(data==1){
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
                    "targets": [4],
                    "data": "id",
                    "render": function(data, type, full) {
                    	var view="<a href=# class=\"btn btn-primary btn-xs\"><i class=\"fa fa-folder\"></i> View </a>";
                    	var edit="<a href=\'contextPath/admin/config/tags/modify/"+full.id+"\' class=\"btn btn-info btn-xs\" data-toggle=\"modal\" data-whatever=\""+full+"\" data-target=\"#tagsModal\" ><i class=\"fa fa-pencil\"></i> Edit </a>";
                    	var del="<a href=# class=\"btn btn-danger btn-xs\"  data-toggle=\"modal\" data-whatever=\""+full.id+"\" data-target=\"#tagsDelModal\" ><i class=\"fa fa-trash-o\"></i> Delete </a>";
                    	return  edit;
                    }
                  }
                ]
      });
});
