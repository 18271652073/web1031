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
  <div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="<%=basePath%>DressingController/findDressing.action?pageNum=1">记过通告</a>
        <a>
          <cite>添加违纪记录</cite></a>
      </span>
      <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
    </div>
    <div class="x-body">
        <form class="layui-form" method="post" action="<%=basePath%>DressingController/addDressing.action">
        <input type="hidden" name="pageNum" value="${pageNum}" />
          <div class="layui-form-item">
              <label for="L_email" class="layui-form-label">
                  <span class="x-red">*</span>学号
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="dstuid" name="dstuid" required="" lay-verify="dstuid"
                  autocomplete="off" class="layui-input">
              </div>
              <div class="layui-form-mid layui-word-aux">
                  <span class="x-red">*</span>学号只能唯一
              </div>
          </div>
               <div class="layui-form-item">
              <label for="L_name" class="layui-form-label">
                  <span class="x-red">*</span>姓名
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="dname" name="dname"  required="" lay-verify="dname"
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          
          <div class="layui-form-item">
              <label for="L_sex" class="layui-form-label">
                  <span class="x-red">*</span>性别
              </label>
              <div class="layui-input-inline">
              	 <input name="dsex" id="dsex" value="男" title="男" checked="" type="radio">
     			 <input name="dsex" value="女" title="女" type="radio">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_username" class="layui-form-label">
                  <span class="x-red">*</span>宿舍号
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="ddromnum" name="ddromnum"  required="" lay-verify=""ddromnum""
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_username" class="layui-form-label">
                  <span class="x-red">*</span>学院
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="dcollege" name="dcollege"  required="" lay-verify="dcollege"
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_username" class="layui-form-label">
                  <span class="x-red">*</span>专业
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="dmajor" name="dmajor"  required="" lay-verify="dmajor"
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_username" class="layui-form-label">
                  <span class="x-red">*</span>违纪明细
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="ddatial" name="ddatial"  required="" lay-verify="ddatial"
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_repass" class="layui-form-label">
              </label>
              <button class="layui-btn" lay-submit lay-filter="add">增加</button>
          </div>
      </form>
    </div>
    <script>
         layui.use(['form','layer'], function(){
            $ = layui.jquery;
          var form = layui.form
          ,layer = layui.layer;
     //自定义验证规则
          form.verify({
            nikename: function(value){
              if(value.length == 0){
                return '姓名不能为空!';
              }
            },
            stuid: function(value){
              if(value.length < 12){
                return '学号必须12位以上';
              }
            },
            name: function(value){
              if(value.length == 0){
                return '用户名不能为空！';
              }
            }
            ,pass: [/(.+){6,12}$/, '密码必须6到12位']
            ,repass: function(value){
                if($('#mgpassword').val()!=$('#rmgpassword').val()){
                    return '两次密码不一致';
                }
            }
          });
          //监听提交
          form.on('submit(add)', function(data){
        	  $.post('<%=basePath%>DressingController/addDressing.action', data, function (res) {
        		 
   		      }, 'json'); 
          });
        });
	</script>
  </body>

</html>