<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>  
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>用户列表</title>
  <%@include file="../common/commonTop.jsp" %>
</head>
<body class="hold-transition skin-blue sidebar-mini">

<div class="wrapper">
  <!-- 顶部导航 -->
  <%@include file="../common/header.jsp" %>
  <!-- 左侧菜单 -->	
  <%@include file="../common/left.jsp" %>
  <!-- 内容信息 -->
  <div class="content-wrapper">
      <!-- Content Header (Page header) 内容区域顶部信息-->
      <section class="content-header">
        <h1>
          	网站基本信息
        </h1>
      </section>

      <!-- Main content 内容区域content-->
      <section class="content">
        <!-- Main row -->
        <div class="row">
          <section class="col-lg-12 connectedSortable">
            <!-- quick email widget -->
            <div class="box box-info">
              <div class="box-header">
                <i class="fa fa-pencil-square-o"></i>

                <h3 class="box-title">基本信息设置</h3>

              </div>
              <div class="box-body">
                <form action="#" method="post">
                  <div class="form-group">
                    <label>网站名称：</label>
                    <input type="email" class="form-control" name="emailto">
                  </div>
                  <div class="form-group">
                    <label>网站标题：</label>
                    <input type="email" class="form-control" name="emailto">
                  </div>
                  <div class="form-group">
                    <label>网站关键字：</label>
                    <input type="email" class="form-control" name="emailto">
                  </div>
                  <div class="form-group">
                    <label>网站logo：</label>
                    <input type="file" class="form-control" name="logo">
                  </div>
                  <div>
                    <label>网站简介：</label>
                    <textarea class="textarea" style="width: 100%; height: 125px; font-size: 14px; line-height: 18px; border: 1px solid #dddddd; padding: 10px;"></textarea>
                  </div>
                </form>
              </div>
              <div class="box-footer clearfix">
                <button type="button" class="pull-right btn btn-default" id="sendEmail">保存设置
                  <i class="fa fa-check"></i></button>
              </div>
            </div>

          </section>
        </div>
        <!-- /.row (main row) -->

      </section>
      <!-- /.content -->
    </div>
    
  <!-- 引入编辑框 -->
  <%@include file="updateUser.jsp" %>
  <%@include file="../common/footer.jsp" %>
</div>
<%@include file="../common/commonBottom.jsp" %>
<script src="<%=basePath%>js/user/userList.js"></script>
</body>
</html>
