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
        <a href="<%=basePath%>RecordController/findRecord.action?pageNum=1">报修通告</a>
        <a>
          <cite>修改信息</cite></a>
      </span>
      <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
    </div>
    <div class="x-body">
        <form class="layui-form" method="post" action="<%=basePath%>RecordController/updateRecord.action">
        <input type="hidden" name="pageNum" value="${pageNum}" />
        <input type="hidden" name="rid" value="${record.rid}" />
          <div class="layui-inline">
	      	<label class="layui-form-label">
	      	 <span class="x-red">*</span>宿舍号</label>
	         <div class="layui-input-inline">
		      <input type="text" id="rdromnum" name="rdromnum" readonly="readonly" required="" lay-verify="rdromnum" value="${record.rdromnum}"
                  autocomplete="off" class="layui-input">
	          </div>
	      </div>
           <div class="layui-form-item">
              <label for="L_username" class="layui-form-label">
                  <span class="x-red">*</span>姓名
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="rname" name="rname" readonly="readonly" required="" lay-verify="rname" value="${record.rname }"
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          
          <div class="layui-form-item">
              <label for="L_email" class="layui-form-label">
                  <span class="x-red">*</span>报修明细
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="rnote" name="rnote" readonly="readonly" required="" lay-verify="rnote" value="${record.rnote }"
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_username" class="layui-form-label">
                  <span class="x-red">*</span>报修时间
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="rdate" name="rdate" readonly="readonly" required="" lay-verify="rdate"  value="<fmt:formatDate value="${record.rdate }"/>"
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          <div class="layui-inline">
	      	<label class="layui-form-label">
	      	 <span class="x-red">*</span>状态</label>
	         <div class="layui-input-inline">
		        <select name="rstate" id="rstate" lay-verify="required" lay-search="" >
		          <option  value="0">未修</option>
		          <option  value="1">已修</option>
		        </select>
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
		$(function(){
			if(${record.rstate }=='0'){
				$("#rstate option[value='0']").attr("selected", true);
			}else if(${record.rstate }=='1'){
				$("#rstate option[value='1']").attr("selected", true);
			}
		});
         layui.use(['form','layer'], function(){
            $ = layui.jquery;
          var form = layui.form
          ,layer = layui.layer;
     //自定义验证规则
          form.verify({
            nikename: function(value){
              if(value.length < 5){
                return '用户名至少得5个字符啊';
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
        });
	</script>
  </body>

</html>