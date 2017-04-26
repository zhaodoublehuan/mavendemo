function editUser(){
	//$("#editUserModal .modal").show();
	 $('#editUserModal .modal').modal('show');
}
  $(function () {
    $("#example1").DataTable({
    	"searching":false,
    	"ordering":false,
    	"pagingType":"full_numbers",
    	"lengthChange":false,
    	"bServerSide": true, 
    	"columns": [
		    { "data": "id" },
		    { "data": "userName" },
		    { "data": "password" },
		    { "data": "" }
		  ],
		"columnDefs":[
			{
			 "targets":0,
			 "data":"id",
			 "render":function( data, type, full, meta){
			 	return "123";
			 }
			},
			{
			 "targets":3,
			 "render":function( data, type, full, meta){
			 	var btnHtml = '<button class="btn btn-success btn-sm" onclick="editUser()"><i class="fa fa-fw fa-edit"></i>编辑</button>';
			 	btnHtml += '<button class="btn btn-danger btn-sm"><i class="fa fa-fw fa-remove"></i>删除</button>';
			 	return btnHtml;
			 }
			}
		],
    	"sAjaxSource":"/user/userPage",
    	"fnServerData":function(sSource, aoData, fnCallback){
    		$.ajax( {    
    	        "contentType": "application/json",    
    	        "url": sSource,     
    	        "dataType": "json",    
    	        "data": { aoData: JSON.stringify(aoData) }, // 以json格式传递  
    	        "success": function(resp) {    
    	            fnCallback(resp);   
    	        }    
    	    });    
    	}
    });
  });