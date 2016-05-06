var globleTagsTable;
        $(document).ready(function() {
           var tagsTable= $('#datatable').dataTable({
            	"processing": true,
                "serverSide": true,
                "ordering": false,
                "searching": false,
                "lengthChange": false,
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
function delTag(id) {
	var $btn = $("#deltag_id").button('loading')
	$.ajax({
		url : contextPath + '/admin/config/tags/del/ajax',
		async : true,
		contentType : "application/json; charset=utf-8",
		dataType : 'json',
		type : 'POST',
		data : JSON.stringify({
			id : id
		}),
		success : function(data, textStatus) {
			$('#tagsDelModal').modal('hide');
			$btn.button('reset');
			toastr["success"]("删除成功！");
			$('#datatable').DataTable().ajax.reload();
		},
		error : function(jqXHR, textStatus, errorThrown) {
			$('#tagsDelModal').modal('hide')
			$btn.button('reset');
			toastr["error"]("删除失败")
		},
	});
};