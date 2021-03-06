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
	<script type="text/javascript" src="<%=basePath %>My97DatePicker/WdatePicker.js"></script>
  </head>
  
  <body>
    <div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="javascript:;">首页</a>
        <a>
          <cite>来访记录</cite></a>
      </span>
      <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
    </div>
    <div class="x-body">
   	 <div class="layui-row">
        <form class="layui-form layui-col-md12 x-so" onsubmit="return find()" action="<%=basePath%>VisitorController/findVisitorBySome.action">
          <input type="hidden" name="pageNum" value="1"/>
		  <input class="layui-input" name="vcdate" id="vcdate" placeholder="开始日" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})">
		  <input class="layui-input" placeholder="截止日" name="vldate" id="vldate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})">
          <button class="layui-btn" onclick="find()" lay-submit="" lay-filter="sreach"><i class="layui-icon">&#xe615;</i></button>
        </form>
      </div>
      <xblock>
        <button class="layui-btn layui-btn-danger" onclick="delAll()"><i class="layui-icon"></i>批量删除</button>
        <a href="<%=basePath%>VisitorController/addVisitorPage.action?pageNum=${pageNum}"><button class="layui-btn" ><i class="layui-icon"></i>添加</button></a>
        <span class="x-right" style="line-height:40px">共有数据：${count } 条</span>
      </xblock>
    <table class="layui-table">
        <thead>
          <tr>
            <th>
              <div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">&#xe605;</i></div>
            </th>
            <th>序号</th>
            <th>来访日期</th>
            <th>离开日期</th>
            <th>来访人</th>
            <th>来访寝室</th>
            <th>操作</th></tr>
        </thead>
        <tbody>
       			<c:forEach items="${visitorList}" var="vl" varStatus="num">
					<tr>
						<td>
			              <div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='${vl.vid }'><i class="layui-icon">&#xe605;</i></div>
			            </td>
						<td >${num.count}</td>
						<td ><fmt:formatDate value="${vl.vcdate}"/></td>
						<td ><fmt:formatDate value="${vl.vldate}"/></td>
						<td >${vl.vname}</td>
						<td >${vl.vdrom}</td>
						<td class="td-manage">
			              <a title="删除" onclick="delOne(${vl.vid})" href="javascript:;">
			                <i class="layui-icon">&#xe640;</i>
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
			location.href="<%=basePath%>VisitorController/findVisitor.action?pageNum="+num;
		}
	});
	  function delAll(argument) {
		  if(${user.mgpower<=2}){
			  layer.msg('权限不够!',{icon:1,time:1000});
			  return ;
		  }
        var data = tableCheck.getData();
        location.href="<%=basePath%>VisitorController/delectVisitor.action?data="+data+"&pageNum="+${pageNum};
      }
	  function delOne(data) {
		  if(${user.mgpower<=2}){
			  layer.msg('权限不够!',{icon:1,time:1000});
			  return ;
		  }
        location.href="<%=basePath%>VisitorController/delectVisitor.action?data="+data+"&pageNum="+${pageNum};
      }
	  function find(){
		  if($("#vcdata").val()=="" && $("#vldata").val()=="" ){
			  layer.msg('搜索数据为空哦!',{icon:1,time:1000});
			  return false;
		  }
	  }
     </script>
  </body>

</html>