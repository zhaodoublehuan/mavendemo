<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<aside class="main-sidebar">
        <!-- sidebar: style can be found in sidebar.less 左侧菜单内容-->
        <section class="sidebar">
          <!-- sidebar menu: : style can be found in sidebar.less 菜单详情ul-->
          <ul class="sidebar-menu">
            <li class="header">基本功能</li>
            <li><a href="index.html"><i class="fa fa-tv"></i> <span>网站基本信息设置</span></a></li>
            <li><a href="itemShow.html"><i class="fa fa-reorder"></i> <span>栏目设置</span></a></li>
            <li class="treeview">
              <a href="#"><i class="fa fa-image"></i> <span>滚动图片</span>
                <span class="pull-right-container">
                 <i class="fa fa-angle-left pull-right"></i>
                </span>
              </a>
              <ul class="treeview-menu">
                <li><a href="uploadImg.html">图片上传</a></li>
                <li><a href="bannerManager.html">图片管理</a></li>
                <li><a href="imgSlider.html">图片滚动预览</a></li>
              </ul>
            </li>
            <li class="treeview">
              <a href="#"><i class="fa fa-file-text-o"></i> <span>文章资讯</span>
                <span class="pull-right-container">
                 <i class="fa fa-angle-left pull-right"></i>
                </span>
              </a>
              <ul class="treeview-menu">
                <li><a href="articleManage.html">分类管理</a></li>
                <li><a href="articleManage.html">信息管理</a></li>
                <li><a href="articleManage.html">发布信息</a></li>
                <li><a href="articleManage.html">评论管理</a></li>
              </ul>
            </li>
            <li  class="treeview">
              <a href="#" ><i class="fa fa-university"></i>
                <span>产品中心</span>
                <span class="pull-right-container">
                 <i class="fa fa-angle-left pull-right"></i>
                </span>
              </a>
              <ul class="treeview-menu">
                <li><a href="productManage.html">分类管理</a></li>
                <li><a href="productManage.html">信息管理</a></li>
                <li><a href="productManage.html">发布信息</a></li>
                <li><a href="productManage.html">评论管理</a></li>
              </ul>
            </li>
            <li><a href="copartnerManage.html"><i class="fa fa-users"></i> <span>合作伙伴</span></a></li>
            <li class="header">扩展功能</li>
            <li><a href="#"><i class="fa fa-bell"></i> <span>广告管理</span></a></li>
          </ul>
        </section>
        <!-- /.sidebar -->
      </aside>