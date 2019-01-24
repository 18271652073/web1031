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
        <a href="<%=basePath%>ManagerController/findManager.action?pageNum=1">管理员列表</a>
        <a>
          <cite>修改信息</cite></a>
      </span>
      <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
    </div>
    <div class="x-body">
        <form class="layui-form" method="post" action="<%=basePath%>ManagerController/updateManager.action">
        <input type="hidden" name="pageNum" value="${pageNum}" />
        <input type="hidden" name="mgid" value="${stumanager.mgid}" />
          <div class="layui-form-item">
              <label for="L_email" class="layui-form-label">
                  <span class="x-red">*</span>学号
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="mgstuid" name="mgstuid" required="" lay-verify="stuid" value="${stumanager.mgstuid }"
                  autocomplete="off" class="layui-input">
              </div>
              <div class="layui-form-mid layui-word-aux">
                  <span class="x-red">*</span>学号只能唯一
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_username" class="layui-form-label">
                  <span class="x-red">*</span>用户名
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="mgname" name="mgname"  required="" lay-verify="nikename" value="${stumanager.mgname }"
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                  <span class="x-red">*</span>密码
              </label>
              <div class="layui-input-inline">
                 <input  name="mgpassword" id="mgpassword" lay-verify="pass"  value="${stumanager.mgpassword }"
                 placeholder="请输入密码" autocomplete="off" class="layui-input" type="password">
              </div>
              <div class="layui-form-mid layui-word-aux">
                  6到16个字符
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_repass" class="layui-form-label">
                  <span class="x-red">*</span>确认密码
              </label>
              <div class="layui-input-inline">
                  <input type="password" id="rmgpassword" name="rmgpassword"  required="" value="${stumanager.mgpassword }"
                  lay-verify="repass"  autocomplete="off" class="layui-input">
              </div>
          </div>
           <div class="layui-form-item">
	      	<label class="layui-form-label">
	      	 <span class="x-red">*</span>楼栋号</label>
	         <div class="layui-input-inline">
		        <select name="mgbuildnum" id="mgbuildnum" lay-verify="required" lay-search="" >
		        <c:forEach items="${buildList }" var="bl" >
		         <c:if test="${stumanager.mgbuildnum==bl.bid }">
		         	<option value="${bl.bid}" selected="true">${bl.bname}</option>
		         </c:if>
		         <c:if test="${stumanager.mgbuildnum!=bl.bid }">
		         	<option value="${bl.bid}" >${bl.bname}</option>
		         </c:if>
		        </c:forEach>
		        </select>
	          </div>
	      </div>
          <div class="layui-form-item">
              <label for="L_name" class="layui-form-label">
                  <span class="x-red">*</span>姓名
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="mgmyname" name="mgmyname"  required="" lay-verify="name"  value="${stumanager.mgmyname }"
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_sex" class="layui-form-label">
                  <span class="x-red">*</span>性别
              </label>
              <div class="layui-input-inline">
              		<c:if test="${stumanager.mgsex=='男'}">
              		<input name="mgsex" id="mgsex" value="男" title="男" checked="" type="radio">
              		<input name="mgsex" value="女" title="女"  type="radio">
              		</c:if>
              		<c:if test="${stumanager.mgsex=='女'}">
              		<input name="mgsex" id="mgsex" value="男" title="男"  type="radio">
              		<input name="mgsex" value="女" title="女" checked="" type="radio">
              		</c:if>
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_tel" class="layui-form-label">
                  <span class="x-red">*</span>电话
              </label>
              <div class="layui-input-inline">
                  <input name="mgtel" id="mgtel" lay-verify="phone" autocomplete="off"  value="${stumanager.mgtel }"
                   class="layui-input" type="tel">
              </div>
          </div>
	      <div class="layui-inline">
	      	<label class="layui-form-label">
	      	 <span class="x-red">*</span>权限</label>
	         <div class="layui-input-inline">
		        <select name="mgpower" id="mgpower" lay-verify="required" lay-search="" >
		          <option  value="1">低</option>
		          <option  value="2">中</option>
		          <option  value="3">高</option>
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
    		if(${stumanager.mgpower }=='1'){
    			$("#mgpower option[value='1']").attr("selected", true);
    		}else if(${stumanager.mgtel }=='2'){
    			$("#mgpower option[value='2']").attr("selected", true);
    		}else{
    			$("#mgpower option[value='3']").attr("selected", true);
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