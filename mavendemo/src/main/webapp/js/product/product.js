function editUser(){
    $('#editUserModal .modal').modal('show');
}
/**
 * 点击添加用户，展示添加modal
 */
function addShopShow(){
    $("input[ type='text' ] ").val("");
    $('#addShopModal .modal').modal('show');
}
function addShopSave(){
    $('#addShopModal .modal').modal('hide');
    var pjUrl = getProjectUrl();
    $.ajax({
        "url":pjUrl+"/pshop/addShop",
        "type":"POST",
        "dataType": "json",
        "data":$("#addShopForm").serialize(),
        success:function(data){

            if(data.status==0){
                alert(data.msg);
            }else{
                alert(data.msg);
            }
            shop_table.ajax.reload();
        },
        error:function(){
            alert("系统异常，请联系系统管理员");
        }
    })
}

function delShop(id) {
    $.confirm({
        title: '确认信息',
        content: '确定要删除该信息么?',
        confirmButton: '删除',
        confirmButtonClass:"btn-danger",
        cancelButtonClass: 'btn-info',
        cancelButton: '取消',
        confirm: function () {
            var pjUrl = getProjectUrl();
            $.ajax({
                "url":pjUrl+"/pshop/deleteShop",
                "type":"POST",
                "dataType": "json",
                "contentType": "application/json",
                "data":{"id":parseInt(id)},
                success:function(data){
                    if(data.status==0){
                        alert(data.msg);
                    }else{
                        alert(data.msg);
                    }
                    shop_table.ajax.reload();
                },
                error:function(){
                    alert("系统异常，请联系系统管理员");
                }
            })
        }
    })
}
function getProjectUrl(){
	var curWwwPath = window.document.location.href;
	var pathName =  window.document.location.pathname;
	console.log(pathName);
	var pos = curWwwPath.indexOf(pathName);
	console.log(pos);
	var localhostPaht = curWwwPath.substring(0,pos);
	console.log(localhostPaht);
	var projectName = pathName.substring(0,pathName.substr(1).indexOf('/')+1);
	console.log(projectName);
	return localhostPaht+projectName;
}
$(function () {
	var pjUrl = getProjectUrl();
    $("#product_table").DataTable({
    	"searching":false,
    	"ordering":false,
    	"pagingType":"full_numbers",
    	"lengthChange":false,
    	"bServerSide": true, 
    	"columns": [
		    { "data": "name" },
		    { "data": "remark"},
            { "data": "productType.name"},
            { "data": "price"},
            { "data": "unitData.name"},
		    { "data": "" }
		  ],
		"columnDefs":[
			{
			 "targets":5,
			 "render":function( data, type, row, meta){
			 	var btnHtml = '<button class="btn btn-success btn-sm" onclick="editUser('+row.id+')"><i class="fa fa-fw fa-edit"></i>编辑</button>';
			 	btnHtml += '<button class="btn btn-danger btn-sm" onclick="delUser('+row.id+')"><i class="fa fa-fw fa-remove"></i>删除</button>';
			 	return btnHtml;
			 }
			}
		],
    	"sAjaxSource":pjUrl+"/product/productPage",
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