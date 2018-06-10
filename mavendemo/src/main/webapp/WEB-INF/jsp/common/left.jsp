<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="basePath" value="${pageContext.request.scheme}${'://'}${pageContext.request.serverName}${':'}${pageContext.request.serverPort}${pageContext.request.contextPath}" />
<aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less 左侧菜单内容-->
    <section class="sidebar">
      <!-- sidebar menu: : style can be found in sidebar.less 菜单详情ul-->
      <ul class="sidebar-menu">
          <c:forEach items="${menuList}"  var="item" >
              <li><a href="${basePath}${item.menuUrl}"><i class="${item.iconClass}"></i> <span>${item.menuName}</span></a></li>
          </c:forEach>
      </ul>
    </section>
    <!-- /.sidebar -->
</aside>