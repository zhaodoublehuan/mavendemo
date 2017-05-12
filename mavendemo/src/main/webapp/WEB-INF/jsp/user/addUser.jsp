<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <div id="addUserModal">
        <div class="modal">
          <div class="modal-dialog">
            <div class="modal-content">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                  <span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">添加用户信息</h4>
              </div>
              <div class="modal-body">
	             <form class="form-horizontal">
	             	<div class="form-group">
	                  <label for="loginNo" class="col-sm-2 control-label">登录账号</label>
	
	                  <div class="col-sm-10">
	                    <input type="text" class="form-control" id="loginNo_add" placeholder="登录账号">
	                  </div>
	                </div>
	                <div class="form-group">
	                  <label for="userName" class="col-sm-2 control-label">姓名</label>
	
	                  <div class="col-sm-10">
	                    <input type="text" class="form-control" id="userName_add" placeholder="用户姓名">
	                  </div>
	                </div>
	                <div class="form-group">
	                  <label for="password" class="col-sm-2 control-label">密码</label>
	
	                  <div class="col-sm-10">
	                    <input type="password" class="form-control" id="password_add" placeholder="登录密码">
	                  </div>
	                </div>
	            </form>
           	  </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-default pull-left" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary" onclick="addUserSave()">保存</button>
              </div>
            </div>
          </div>
        </div>
      </div>