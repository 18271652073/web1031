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
    <link rel="stylesheet" href="<%=basePath %>css/font.css">
    <link rel="stylesheet" href="<%=basePath %>css/xadmin.css">
    <link rel="stylesheet" href="<%=basePath %>css/page.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="<%=basePath %>lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="<%=basePath %>js/xadmin.js"></script>
    <script src="//res.layui.com/layui/dist/layui.js" charset="utf-8"></script>
    <script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>
	<script type="text/javascript" src="<%=basePath %>js/paging.js"></script>
  </head>
<body class="login-bg">
    
    <div class="login">
        <div class="message">超级用户登录</div>
        <div id="darkbannerwrap"></div>
        
        <form method="post" class="layui-form" >
           <input type="text"  name="username"  style="display: none;" disabled autocomplete = "off"/>
            <input name="username" id="username" value="${admin.username }" placeholder="用户名"  type="text" lay-verify="required" class="layui-input" >
            <hr class="hr15">
            <input type="text"  name="password"  style="display: none;" disabled autocomplete = "off"/>
            <input name="password" id="password" value="${admin.password }" lay-verify="required" placeholder="密码"  type="password" class="layui-input">
            <hr class="hr15">
            <input value="登录" lay-submit lay-filter="login" style="width:100%;" type="submit">
            <hr class="hr20" >
        </form>
    </div>

    <script>
        $(function  () {
        	if(${msg=='0'}){
        		alert("登陆失败,请重新登录!");
        	}else if(${msg=='10'}){
        		alert("用户名或密码错误!");
        	}
            layui.use('form', function(){
              var form = layui.form;
              form.on('submit(login)', function(data){
                    location.href="<%=basePath%>LoginController/adminProving.action?username="+$("#username").val()+"&password="+$("#password").val();
                return false;
              });
            });
        });
    </script>

    
    <!-- 底部结束 -->
    
</body>
</html>