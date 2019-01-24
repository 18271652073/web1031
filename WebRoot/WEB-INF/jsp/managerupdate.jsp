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
    <div class="x-body">
        <form class="layui-form" method="post" action="">
        <input type="hidden" name="pageNum" value="${pageNum}" />
        <input type="hidden" name="mgid" value="${user.mgid}" />
          <div class="layui-form-item">
              <label for="L_username" class="layui-form-label">
                  <span class="x-red">*</span>学号
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="mgstuid" name="mgstuid"  required="" lay-verify="mgstuid" value="${user.mgstuid }" readonly="readonly"
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_username" class="layui-form-label">
                  <span class="x-red">*</span>登录名
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="mgname" name="mgname"  required="" lay-verify="mgname" value="${user.mgname }" readonly="readonly"
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                  <span class="x-red">*</span>密码
              </label>
              <div class="layui-input-inline">
                 <input  name="password" id="password" lay-verify="pass" value="${user.mgpassword }" readonly="readonly"
                 autocomplete="off" class="layui-input" type="password">
              </div>
              <div class="layui-form-mid layui-word-aux">
                  6到16个字符
              </div>
          </div>
            <div class="layui-form-item">
              <label for="L_username" class="layui-form-label">
                  <span class="x-red">*</span>楼栋名
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="mgbuildnum" name="mgbuildnum"  required="" lay-verify="mgbuildnum" value="${user.mgbuildnum }栋" readonly="readonly"
                  autocomplete="off" class="layui-input">
              </div>
          </div>
            <div class="layui-form-item">
              <label for="L_username" class="layui-form-label">
                  <span class="x-red">*</span>姓名
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="mgmyname" name="mgmyname"  required="" lay-verify="mgbuildnum" value="${user.mgmyname }" readonly="readonly"
                  autocomplete="off" class="layui-input">
              </div>
          </div>
            <div class="layui-form-item">
              <label for="L_username" class="layui-form-label">
                  <span class="x-red">*</span>性别
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="mgsex" name="mgsex"  required="" lay-verify="mgsex" value="${user.mgsex }" readonly="readonly"
                  autocomplete="off" class="layui-input">
              </div>
          </div>
            <div class="layui-form-item">
              <label for="L_username" class="layui-form-label">
                  <span class="x-red">*</span>电话
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="mgtel" name="mgtel"  required="" lay-verify="mgtel" value="${user.mgtel }" readonly="readonly"
                  autocomplete="off" class="layui-input">
              </div>
          </div>
           <div class="layui-form-item">
              <label for="L_username" class="layui-form-label">
                  <span class="x-red">*</span>权限
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="mgpower" name="mgpower"  value="${user.mgpower }" readonly="readonly"
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_repass" class="layui-form-label">
              </label>
              <button class="layui-btn" lay-submit lay-filter="add">不可修改</button>
          </div>
      </form>
    </div>
    <script>
    
	</script>
  </body>

</html>