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
        <a href="<%=basePath%>BuildController/findBuild.action?pageNum=1">楼栋信息</a>
        <a>
          <cite>添加楼栋</cite></a>
      </span>
      <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
    </div>
    <div class="x-body">
        <form class="layui-form" method="post" action="<%=basePath%>BuildController/addBuild.action">
        <input type="hidden" name="pageNum" value="${pageNum}" />
          <div class="layui-form-item">
	      	<label class="layui-form-label">
	      	 <span class="x-red">*</span>楼栋名</label>
	         <div class="layui-input-inline">
		        <select name="bname" id="bname" lay-verify="required" lay-search="">
		          <option value="1">1栋</option>
		          <option value="2">2栋</option>
		          <option value="3">3栋</option>
		          <option value="4">4栋</option>
		          <option value="5">5栋</option>
		          <option value="6">6栋</option>
		          <option value="7">7栋</option>
		          <option value="8">8栋</option>
		          <option value="9">9栋</option>
		          <option value="10">10栋</option>
		        </select>
	          </div>
	      </div>
          <div class="layui-form-item">
              <label for="L_username" class="layui-form-label">
                  <span class="x-red">*</span>类型
              </label>
              <div class="layui-input-inline">
                  <select name="btype" id="btype" >
		          <option  value="男">男</option>
		          <option  value="女">女</option>
		          </select>
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_username" class="layui-form-label">
                  <span class="x-red">*</span>简介
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="bdetail" name="bdetail"  required="" lay-verify="bdetail" value="${stubuild.bdetail }"
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
	    $(function(){
	    	if(${msg=='0'}){
	    		alert("楼栋已存在!");
	    	}
	    });
         layui.use(['form','layer'], function(){
            $ = layui.jquery;
          var form = layui.form
          ,layer = layui.layer;
     //自定义验证规则
          form.verify({
            bdetail: function(value){
              if(value.length < 1){
                return '简介不能为空哦!';
              }
            }
          });
          //监听提交
          form.on('submit(add)', function(data){
        	  $.post('<%=basePath%>BuildController/addBuild.action', data, function (res) {
   		      }, 'json'); 
          });
        });
	</script>
  </body>

</html>