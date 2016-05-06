/**
 * Created by lig on 16/4/28.
 */
$(document).ready(function () {
    $('#datatable').dataTable({
        "processing": true,
        "serverSide": true,
        "ordering": false,
        "searching": false,
        "lengthChange": false,
        "ajax": "nav/ajax",
        "language": {"url": contextPath + "/resources/admin/js/datatables/language/zh_CN.lang"},
        "columns": [
            {"data": "id", "bSortable": false},
            {"data": "catalogName"},
            {"data": "level"},
            {"data": "seq"},
            {"data":"urlPath"},
            {
                "data": "status", render: function (data, type, row) {
                if (data == 1) {
                    return "审核中";
                } else if (data == 2) {
                    return "生效";
                }
                return "未知状态" + data;
            }
            }
        ],
        "columnDefs": [
            {
                "targets": [6],
                "data": "id",
                "render": function (data, type, full) {
                    var view="<a href=# class=\"btn btn-primary btn-xs\"><i class=\"fa fa-folder\"></i> View </a>";
                    var edit="<a href=# class=\"btn btn-info btn-xs\"><i class=\"fa fa-pencil\"></i> Edit </a>";
                    var del="<a href=# class=\"btn btn-danger btn-xs\"><i class=\"fa fa-trash-o\"></i> Delete </a>";
                    return view+edit+del;
                }
            }
        ]
    });
});