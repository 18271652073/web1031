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
        <a href="<%=basePath%>ScoreController/findScore.action?pageNum=1">宿舍评分</a>
        <a>
          <cite>修改信息</cite></a>
      </span>
      <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
    </div>
    <div class="x-body">
        <form class="layui-form" method="post" action="<%=basePath%>ScoreController/updateScore.action">
        <input type="hidden" name="pageNum" value="${pageNum}" />
        <input type="hidden" name="sid" value="${score.sid}" />
         <div class="layui-inline">
	      	<label class="layui-form-label">
	      	 <span class="x-red">*</span>宿舍号</label>
	         <div class="layui-input-inline">
		      <input type="text" id="sdromnum" name="sdromnum"   value="${score.sdromnum}" readonly="readonly"
                  autocomplete="off" class="layui-input">
	          </div>
	      </div>
	         <div class="layui-inline">
	      	<label class="layui-form-label">
	      	 <span class="x-red">*</span>卫生</label>
	         <div class="layui-input-inline">
		      <input type="text" id="shygiene" name="shygiene"  required="" lay-verify="score" value="${score.shygiene}"
                  autocomplete="off" class="layui-input">
	          </div>
	      </div>   
	      <div class="layui-inline">
	      	<label class="layui-form-label">
	      	 <span class="x-red">*</span>文化</label>
	         <div class="layui-input-inline">
		      <input type="text" id="sculture" name="sculture"  required="" lay-verify="score" value="${score.sculture}"
                  autocomplete="off" class="layui-input">
	          </div>
	      </div>   
	      <div class="layui-inline">
	      	<label class="layui-form-label">
	      	 <span class="x-red">*</span>文化</label>
	         <div class="layui-input-inline">
		      <input type="text" id="ssave" name="ssave"  required="" lay-verify="score" value="${score.ssave}"
                  autocomplete="off" class="layui-input">
	          </div>
	      </div>   
          <div class="layui-form-item">
              <label for="L_repass" class="layui-form-label">
              </label>
              <button class="layui-btn" lay-submit lay-filter="add">修改</button>
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
        score: function(value){
          if(100<value.val() || value.val()<0){
            return '0-100的数字!';
          }
        }
        ,drom: [/[0-9]{4,6}$/, '宿舍号必须4到6位']
      });
      //监听提交
      form.on('submit(add)', function(data){
    	  $.post('<%=basePath%>ScoreController/addScore.action', data, function (res) {
    		 
		      }, 'json'); 
      });
    });
	</script>
  </body>

</html>