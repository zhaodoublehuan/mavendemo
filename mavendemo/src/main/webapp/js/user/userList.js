function editUser(){
	 $('#editUserModal .modal').modal('show');
}
/**
 * 点击添加用户，展示添加modal
 */
function addUserShow(){
	$(':input','#addUserModal form')
	.not(':button,:submit,:reset')
	.val('')
	.removeAttr('checked')
	.removeAttr('selected');
	$('#addUserModal .modal').modal('show');
}
function addUserSave(){
	var user={};
	user.userName=$("#userName_add").val();
	user.loginNo = $("#loginNo_add").val();
	user.password = $("#password_add").val();
	
	$.ajax({
		"url":"http://localhost:8080/user/addUser",
		"type":"POST",
		"dataType": "json",   
		"contentType": "application/json",    
		"data":{"loginNo":"11111"},
		success:function(data){
			alert(eval(data));
		},
		error:function(){
			alert("系统异常，请联系系统管理员");
		}
	})
}
$(function () {
	var user = {};
	user.loginNo="11111";
	$.ajax({
		"url":"http://localhost:8080/user/addUser",
		"type":"POST",
		"dataType": "json",   
		contentType:'application/json;charset=UTF-8',
		"data":JSON.stringify(user),
		"success":function(data){
			alert(eval(data));
		},
		"error":function(){
			alert("系统异常，请联系系统管理员");
		}
	})
    $("#user_table").DataTable({
    	"searching":false,
    	"ordering":false,
    	"pagingType":"full_numbers",
    	"lengthChange":false,
    	"bServerSide": true, 
    	"columns": [
		    { "data": "loginNo" },
		    { "data": "userName"},
		    { "data": "" }
		  ],
		"columnDefs":[
			{
			 "targets":2,
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