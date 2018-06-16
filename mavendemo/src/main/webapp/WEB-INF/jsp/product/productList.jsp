<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>产品管理</title>
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
                产品信息
            </h1>
        </section>
        <section class="content">

            <div class="row">
                <section class="col-lg-12 connectedSortable">
                    <div class="box box-info">
                        <div class="box-header">
                            <button class="btn btn-success" onclick="addUserShow()">添加产品</button>
                        </div>
                        <div class="box-body">
                            <table id="product_table" class="table table-bordered table-hover">
                                <thead>
                                <tr>
                                    <th>产品名称</th>
                                    <th>产品描述</th>
                                    <th>产品类型</th>
                                    <th>产品价格</th>
                                    <th>单位</th>
                                    <th>操作</th>
                                </tr>
                                </thead>
                            </table>
                        </div>
                    </div>

                </section>
            </div>
            <!-- /.row (main row) -->

        </section>
        <!-- /.content -->
    </div>
</div>
<%@include file="../common/footer.jsp" %>
</div>
<%@include file="addProduct.jsp" %>
<%@include file="../common/commonBottom.jsp" %>
<script src="<%=basePath%>js/product/product.js"></script>
</body>
</html>
