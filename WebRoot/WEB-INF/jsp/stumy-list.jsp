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
  
  <body>
    <div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="javascript:;">首页</a>
        <a>
          <cite>学生列表</cite></a>
      </span>
      <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
    </div>
    <div class="x-body">
      <div class="layui-row">
        <form class="layui-form layui-col-md12 x-so" onsubmit="return find()" action="<%=basePath%>MyController/findMystuBySome.action">
          <input type="hidden" name="pageNum" value="1"/>
          <input class="layui-input" placeholder="姓名" name="mname" id="mname">
          <input class="layui-input" placeholder="寝室号" name="mdrom" id="mdrom">
          <input type="text" name="mstuid"  id="mstuid" placeholder="请输入学号" autocomplete="off" class="layui-input">
          <button class="layui-btn" onclick="find()" lay-submit="" lay-filter="sreach"><i class="layui-icon">&#xe615;</i></button>
        </form>
      </div>
      <xblock>
        <button class="layui-btn layui-btn-danger" onclick="delAll()"><i class="layui-icon"></i>批量删除</button>
        <a onclick="add()"><button class="layui-btn" ><i class="layui-icon"></i>添加</button></a>
        <span class="x-right" style="line-height:40px">共有数据：${count } 条</span>
      </xblock>
      <table class="layui-table">
        <thead>
          <tr>
            <th>
              <div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">&#xe605;</i></div>
            </th>
            <th>序号</th>
            <th>学号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>楼栋号</th>
            <th>宿舍号</th>
            <th>电话</th>
            <th>入住时间</th>
            <th>操作</th></tr>
        </thead>
       <tbody>
       			<c:forEach items="${stumyList}" var="ml" varStatus="num">
					<tr>
						<td>
			              <div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='${ml.mid}'><i class="layui-icon">&#xe605;</i></div>
			            </td>
						<td >${num.count+(pageNum-1)*4}</td>
						<a title="查看个人信息"  onclick="x_admin_show('查看个人信息','MyController/showMy.action?mstuid=${ml.mstuid}',600,400)" href="javascript:;"><td >${ml.mstuid}</td></a>
						<td >${ml.mname}</td>
						<td >${ml.msex}</td>
						<td >${ml.mbuildnum}</td>
						<td >${ml.mdrom}</td>
						<td >${ml.mtel}</td>
						<td ><fmt:formatDate value="${ml.mdate}"/></td>
						<td class="td-manage">
						<c:if test="${user.mgpower==3 }">
							 <a  href="<%=basePath%>MyController/editMystuPage.action?mid=${ml.mid }&pageNum=${pageNum}">
			                	<i class="layui-icon">&#xe642;</i>
			              	</a>
						</c:if>
						<c:if test="${user.mgpower<=2 }">
							 <a title="编辑" href="javascript:;">
			                	<i class="layui-icon">&#xe642;</i>
			              	</a>
						</c:if>
			              <a title="删除" onclick="delOne(${ml.mid})" href="javascript:;">
			                <i class="layui-icon">&#xe640;</i>
			              </a>
			              <a onclick="x_admin_show('学生信息','<%=basePath%>MyController/showMystuPage.action?mid=${ml.mid }'),400,200">
			                <i class="layui-icon">&#xe612;</i>
			              </a>
			            </td>
					</tr>
				</c:forEach>
        </tbody>
      </table>
        <div>
        	 <center>
	         <div value="1 0"></div>
			 <div id="page" class="page_div"></div>
			 </center>
        </div>
    </div>
    <script>
  //分页
	$("#page").paging({
		pageNo: ${pageNum},
		totalPage: ${maxPage},
		totalSize: ${count},
		callback: function(num) {
			location.href="<%=basePath%>MyController/findMystu.action?pageNum="+num;
		}
	});
	  function delAll(argument) {
		  if(${user.mgpower<=2}){
			  layer.msg('权限不够!',{icon:1,time:1000});
			  return ;
		  }
        var data = tableCheck.getData();
        location.href="<%=basePath%>MyController/delectMystu.action?data="+data+"&pageNum="+${pageNum};
      }
	  function delOne(data) {
		  if(${user.mgpower<=2}){
			  layer.msg('权限不够!',{icon:1,time:1000});
			  return ;
		  }
        location.href="<%=basePath%>MyController/delectMystu.action?data="+data+"&pageNum="+${pageNum};
      }
	  function find(){
		  if($("#mname").val()=="" && $("#mstuid").val()=="" && $("#mdrom").val()==""){
			  layer.msg('搜索数据为空哦!',{icon:1,time:1000});
			  return false;
		  }
	  }
	  function add(){
			 if(${user.mgpower<=2}){
				  layer.msg('权限不够!',{icon:1,time:1000});
				  return ;
			  }
			 location.href="<%=basePath%>MyController/addMystuPage.action?pageNum="+${pageNum};
		 }
	  
     </script>
  </body>

</html>