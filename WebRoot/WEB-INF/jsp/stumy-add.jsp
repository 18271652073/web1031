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
    <link rel="stylesheet" href="<%=basePath %>lib/layui/css/layui.css" media="all">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="<%=basePath %>lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="<%=basePath %>js/xadmin.js"></script>
    <script type="text/javascript" src="<%=basePath %>My97DatePicker/WdatePicker.js"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
  </head>
  
  <body>
  	<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="<%=basePath%>MyController/findMystu.action?pageNum=1">学生列表</a>
        <a>
          <cite>添加信息</cite></a>
      </span>
      <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
    </div>
    <div class="x-body">
        <form class="layui-form" method="post" action="<%=basePath%>MyController/addMystu.action" enctype="multipart/form-data">
        <input type="hidden" name="pageNum" value="${pageNum}" />
        <input type="hidden" name="mid" value="${stumy.mid}" />
         <div class="layui-form-item">
              <label for="L_email" class="layui-form-label">
                  <span class="x-red">*</span>学号
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="mstuid" name="mstuid" required="" lay-verify="stuid" value="${stumy.mstuid }"
                  autocomplete="off" class="layui-input">
              </div>
              <div class="layui-form-mid layui-word-aux">
                  <span class="x-red">*</span>学号只能唯一
              </div>
          </div>
          <input type="text"  name="mname"  style="display: none;" disabled autocomplete = "off"/>
          <input type="password" name="mpassword" style="display: none;" disabled autocomplete = "off"/>
             <div class="layui-form-item">
              <label for="L_name" class="layui-form-label">
                  <span class="x-red">*</span>姓名
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="mname" name="mname"  required="" lay-verify="name" value="${stumy.mname }"
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                  <span class="x-red">*</span>密码
              </label>
              <div class="layui-input-inline">
                 <input  name="mpassword" id="mpassword" lay-verify="pass"  value="${stumy.mpassword }"
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
                  <input type="password" id="rmpassword" name="rmpassword"  required="" value="${stumy.mpassword }"
					lay-verify="repass"  autocomplete="off" class="layui-input">
              </div>
          </div>
           <div class="layui-form-item">
              <label for="L_sex" class="layui-form-label">
                  <span class="x-red">*</span>性别
              </label>
              <div class="layui-input-inline">
                   <c:if test="${stumy.msex=='男'}">
              		<input name="msex" id="msex" value="男" title="男" checked="" type="radio">
              		<input name="msex" value="女" title="女"  type="radio">
              		</c:if>
              		<c:if test="${stumy.msex=='女'}">
              		<input name="msex" id="msex" value="男" title="男"  type="radio">
              		<input name="msex" value="女" title="女" checked="" type="radio">
              		</c:if>
              		<c:if test="${stumy.msex==null}">
              		<input name="msex" id="msex" value="男" title="男" checked="" type="radio">
     			    <input name="msex" value="女" title="女" type="radio">
              		</c:if>
              </div>
          </div>
		  <div class="layui-form-item">
		    <div class="layui-inline">
		      <label class="layui-form-label">
		      <span class="x-red">*</span>出生日期
		      </label>
		      <div class="layui-input-inline">
		       <input class="layui-input" type="text"  name="mage" placeholder="出生日期" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" value="<fmt:formatDate value='${stumy.mage }'/>">
		      </div>
		    </div>
		  </div>
		 <div class="layui-form-item">
              <label for="L_repass" class="layui-form-label">
                  <span class="x-red">*</span>楼栋号
              </label>
              <div class="layui-input-inline">
                  <select name="mbuildnum" id="mbuildnum" >
		          <c:forEach items="${buildList }" var="bl" >
		          <c:if test="${stumy.mbuildnum==bl.bname }">
		         	<option value="${bl.bname}" selected="true">${bl.bname}栋</option>
		          </c:if>
		          <c:if test="${stumy.mbuildnum!=bl.bname }">
		         	<option value="${bl.bname}" >${bl.bname}栋</option>
		          </c:if>
		        </c:forEach>
		        </select>
              </div>
          </div>
	       <div class="layui-form-item">
              <label for="L_name" class="layui-form-label">
                  <span class="x-red">*</span>宿舍号
              </label>
              <div class="layui-input-inline">
                  <input type="mdrom" id="mdrom" name="mdrom"  required="mdrom"  value="${stumy.mdrom }"
                  autocomplete="off" class="layui-input">
              </div>
          </div>
	       <div class="layui-form-item">
              <label for="L_name" class="layui-form-label">
                  <span class="x-red">*</span>学院
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="mcollege" name="mcollege"  required="" value="${stumy.mcollege }"
                  autocomplete="off" class="layui-input">
              </div>
          </div>
            <div class="layui-form-item">
             <label for="L_mmajor" class="layui-form-label">
                 <span class="x-red">*</span>专业
             </label>
             <div class="layui-input-inline">
                 <input type="text" id="mmajor" name="mmajor"  required="" value="${stumy.mmajor }"
                 autocomplete="off" class="layui-input">
             </div>
             </div>
             <div class="layui-form-item">
              <label for="L_tel" class="layui-form-label">
                  <span class="x-red">*</span>电话
              </label>
              <div class="layui-input-inline">
                  <input name="mtel" id="mtel" lay-verify="phone"   value="${stumy.mtel }"
                  autocomplete="off" class="layui-input" type="tel">
              </div>
             </div>
             <div class="layui-form-item">
              <label for="L_mparenttel" class="layui-form-label">
                  <span class="x-red">*</span>父母电话
              </label>
              <div class="layui-input-inline">
                  <input name="mparenttel" id="mparenttel" lay-verify="phone"  value="${stumy.mparenttel}"
                  autocomplete="off" class="layui-input" type="tel">
           </div>
           </div>
           <div class="layui-form-item">
              <label for="L_mipicture" class="layui-form-label">
                  <span class="x-red">*</span>头像
              </label>
              <div class="layui-input-inline">
             	  <input type="file" class="layui-input" id="pictureFile" name="pictureFile" />
              </div>
           </div>
           <div class="layui-form-item">
           <label for="L_maddress" class="layui-form-label">
               <span class="x-red">*</span>住址
           </label>
		        <textarea name="maddress" id="maddress"  autocomplete="off" cols="30" rows="4">${stumy.maddress}</textarea>
           </div>
           <div class="layui-inline">
	      	 <label class="layui-form-label">
	      	 <span class="x-red">*</span>状态</label>
		         <div class="layui-input-inline">
			        <select name="mstate" id="mstate" >
			          <c:if test="${stumy.mstate=='0' }">
			          <option  value="0" selected="selected">离校</option>
			          <option  value="1">在校</option>
			        </c:if>
			        <c:if test="${stumy.mstate=='1' }">
			          <option  value="0">离校</option>
			          <option  value="1" selected="selected">在校</option>
			        </c:if>
			        <c:if test="${stumy.mstate==null }">
			          <option  value="">请选择在校状态</option>
			          <option  value="0">离校</option>
			          <option  value="1">在校</option>
			        </c:if>
			        </select>
		          </div>
		           <div class="layui-form-mid layui-word-aux">
	                                                               选填
	               </div>
	       </div>
           <div class="layui-form-item">
              <label for="L_repass" class="layui-form-label">
              </label>
              <button class="layui-btn" lay-submit lay-filter="add">添加</button>
           </div>
      </form>
    </div>
    <script>
			$(function(){
				if(${map['msg']=='0'}){
		    		alert("学号已存在!请重新上传密码和头像!");
		    	}else if(${map['msg']}=='1'){
		    		alert("不能插入异性宿舍!请重新上传密码和头像!");
		    	}else if(${map['msg']=='2'}){
		    		alert("该宿舍已满!请重新上传密码和头像!");
		    	}else if(${map['msg']=='3'}){
		    		alert("该宿舍未建立!请重新上传密码和头像!");
		    	}
			});
			 layui.use('laydate', function(){
			        var laydate = layui.laydate;
			        //执行一个laydate实例
			        laydate.render({
			          elem: '#start' //指定元素
			        });
			        laydate.render({
			          elem: '#end' //指定元素
			        });
			      });
		       layui.use(['form','layer'], function(){
		       $ = layui.jquery;
		       var form = layui.form
		       ,layer = layui.layer;
		       //自定义验证规则
		       form.verify({
		       stuid: function(value){
		         if(value.length>13 || value.length < 11){
		           return '学号必须12位';
		           }
		         },
		         name: function(value){
		           if(value.length == 0){
		             return '姓名不能为空！';
		           }
		         }
		         ,pass: [/(.+){6,12}$/, '密码必须6到12位']
		         ,drom: [/[0-9]{3}$/, '宿舍号必须4到6位']
		         ,repass: function(value){
		           if($('#mpassword').val()!=$('#rmpassword').val()){
		             return '两次密码不一致';
		             }
		         }
		        });
		        form.on('submit(add)', function(data){
		      	  $.post('<%=basePath%>MyController/addMystu.action', data, function (res) {
		      		 
		 		      }, 'json'); 
		        });
		      });
	</script>
  </body>

</html>