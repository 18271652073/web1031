<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>欢迎页面-X-admin2.0</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="./css/font.css">
    <link rel="stylesheet" href="./css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="./lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="./js/xadmin.js"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
      <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
      <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  
  <body>
  	 <table class="layui-table">
        <thead>
          <tr>
            <th colspan="6">宿舍管理系统查询结果</th>
          </tr>
        </thead>
       <tbody>
			<tr>
			<td>学号</td>
			<td>${stumy.mstuid }</td>
			<td>生日</td>
			<td><fmt:formatDate value="${stumy.mage }"/></td>
			<td colspan="4" rowspan="4" style="padding-left: 150px;"><img src="${stumy.mpicture }" alt="还未上传哦.." style="height: 130px"/></td>
			</tr>
			<tr>
			<td>姓名</td>
			<td>${stumy.mname }</td>
			<td>性别</td>
			<td>${stumy.msex }</td>
			</tr>
			<tr>
			<td>宿舍号</td>
			<td>${stumy.mbuildnum }&minus;${stumy.mdrom }</td>
			<td>入住日期</td>
			<td><fmt:formatDate value="${stumy.mdate }"/></td>
			</tr>
			<tr>
			<td>个人电话</td>
			<td>${stumy.mtel }</td>
			<td>父母电话</td>
			<td>${stumy.mparenttel }</td>
			</tr>
			<tr>
			<td>学院</td>
			<td>${stumy.mcollege }</td>
			<td>专业</td>
			<td>${stumy.mmajor }</td>
			<td>年龄</td>
			<td>${age}</td>
			</tr>
        </tbody>
      </table>
      <script type="text/javascript">

      </script>
  </body>
</html>