/**
 * Created by lig on 16/4/28.
 */
$(document).ready(function() {
    $('#datatable').dataTable({
        "processing": true,
        "serverSide": true,
        "ordering":false,
        "searching":false,
        "lengthChange": false,
        "ajax" : "nav/ajax",
        "language": { "url": contextPath+"/resources/admin/js/datatables/language/zh_CN.lang" } ,
        "columns": [
            {"data": "id", "bSortable": false},
            {"data": "catalogName"},
            {"data": "level"},
            {"data": "seq"},
            {"data": "status",render: function ( data, type, row ) {
                if(data==1){
                    return "审核中";
                }else if(data==2){
                    return "生效";
                }
                return "未知状态"+data;
            }}
        ],
        "columnDefs": [
            {
                "targets": [5],
                "data": "id",
                "render": function(data, type, full) {
                    return "<a href='/update?id=" + data + "'>Update</a>";
                }
            }
        ]
    });
});