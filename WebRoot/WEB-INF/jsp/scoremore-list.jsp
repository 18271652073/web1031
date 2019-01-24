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
        <a href="<%=basePath%>ScoreController/findScore.action?pageNum=1">宿舍评分</a>
        <a>
          <cite>条件查找列表</cite></a>
      </span>
      <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
    </div>
    <div class="x-body">
      <div class="layui-row">
        <form class="layui-form layui-col-md12 x-so" onsubmit="return find()" action="<%=basePath%>ScoreController/findScoreBySome.action">
        <input type="hidden" name="pageNum" value="1"/>
           <div class="layui-input-inline">
		        <select name="sgrade" id="sgrade" >
		          <option  value="">输入等级</option>
		          <option  value="A">A</option>
		          <option  value="B">B</option>
		          <option  value="C">C</option>
		        </select>
	        </div>
          <input type="text" name="sdromnum"  id="sdromnum" placeholder="请输入宿舍号" autocomplete="off" class="layui-input">
          <button class="layui-btn" onclick="find()" lay-submit="" lay-filter="sreach"><i class="layui-icon">&#xe615;</i></button>
        </form>
      </div>
      <xblock>
        <span class="x-right" style="line-height:40px">共有数据：${count } 条</span>
      </xblock>
        <table class="layui-table">
        <thead>
          <tr>
            <th>序号</th>
            <th>宿舍号</th>
            <th>卫生</th>
            <th>文化</th>
            <th>安全</th>
            <th>等级</th>
        </thead>
        <tbody>
       			<c:forEach items="${stuscoreList}" var="sl" varStatus="num">
					<tr>
						<td >${num.count+(pageNum-1)*4}</td>
						<td >${sl.sdromnum}</td>
						<td >${sl.shygiene}</td>
						<td >${sl.sculture}</td>
						<td >${sl.ssave}</td>
						<td >${sl.sgrade}</td>
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
    $("#page").paging({
    	pageNo: ${pageNum},
		totalPage: ${maxPage},
		totalSize: ${count},
		callback: function(num) {
			location.href="<%=basePath%>ScoreController/findScoreBySome.action?pageNum="+num;
		}
	});
    function find(){
		  if($("#sgrade").val()=="" && $("#sdromnum").val()==""){
			  layer.msg('搜索数据为空哦!',{icon:1,time:1000});
			  return false;
		  }
	  }
     </script>
  </body>

</html>