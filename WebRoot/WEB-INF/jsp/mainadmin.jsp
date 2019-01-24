<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
   <title>腾龙宿舍后台管理系统</title>
	<meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />

    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="<%=basePath%>/css/font.css">
	<link rel="stylesheet" href="<%=basePath%>/css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script src="<%=basePath%>/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="<%=basePath%>/js/xadmin.js"></script>

</head>
<body>
    <!-- 顶部开始 -->
    <div class="container">
        <div class="logo"><a href="<%=basePath%>LoginController/mainadmin.action">腾龙宿舍后台管理系统</a></div>
        <div class="left_open">
            <i title="展开左侧栏" class="iconfont">&#xe699;</i>
        </div>
        <ul class="layui-nav left fast-add" lay-filter="">
          <li class="layui-nav-item">
            <a href="javascript:;">+新增</a>
            <dl class="layui-nav-child"> <!-- 二级菜单 -->
              <dd><a onclick="x_admin_show('资讯','http://www.baidu.com'),600,400"><i class="iconfont">&#xe6a2;</i>百度资讯</a></dd>
              <dd><a onclick="x_admin_show('图片','http://www.baidu.com')"><i class="iconfont">&#xe6a8;</i>百度图片</a></dd>
               <dd><a onclick="x_admin_show('用户','http://www.baidu.com')"><i class="iconfont">&#xe6b8;</i>百度用户</a></dd>
            </dl>
          </li>
        </ul>
        <ul class="layui-nav right" lay-filter="">
          <li class="layui-nav-item">
            <a href="javascript:;">${user.username }</a>
            <dl class="layui-nav-child"> <!-- 二级菜单 -->
              <dd><a title="个人信息"  onclick="x_admin_show('个人信息','<%=basePath%>LoginController/adminUpdatePage.action',600,400)" href="javascript:;">个人信息</a></dd>
              <dd><a href="<%=basePath%>LoginController/admin.action">切换帐号</a></dd>
              <dd><a href="<%=basePath %>LoginController/admin.action">退出</a></dd>
            </dl>
          </li>
          <li class="layui-nav-item to-index"><a href="<%=basePath%>LoginController/mainadmin.action">首页</a></li>
        </ul>
        
    </div>
    <!-- 顶部结束 -->
    <!-- 中部开始 -->
     <!-- 左侧菜单开始 -->
    <div class="left-nav">
      <div id="side-nav">
        <ul id="nav">
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6b8;</i>
                    <cite>人员管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="<%=basePath%>ManagerController/findManager.action?pageNum=1">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>管理员列表</cite>
                            
                        </a>
                    </li >
                    <li>
                        <a _href="<%=basePath%>BuildController/findBuild.action?pageNum=1">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>楼栋信息</cite>
                            
                        </a>
                    </li>
                    <li>
                        <a href="javascript:;">
                            <i class="iconfont">&#xe70b;</i>
                            <cite>学生信息</cite>
                            <i class="iconfont nav_right">&#xe697;</i>
                        </a>
                        <ul class="sub-menu">
                            <li>
                                <a _href="<%=basePath%>MyController/findMystu.action?pageNum=1">
                                    <i class="iconfont">&#xe6a7;</i>
                                    <cite>学生列表</cite>
                                    
                                </a>
                            </li >
                        </ul>
                    </li>
                </ul>
            </li>
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe723;</i>
                    <cite>访客管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="<%=basePath%>VisitorController/findVisitor.action?pageNum=1">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>来访记录</cite>
                        </a>
                    </li >
                </ul>
            </li>
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe726;</i>
                    <cite>管理员管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="<%=basePath%>ScoreController/findScore.action?pageNum=1">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>宿舍评分</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="<%=basePath%>DressingController/findDressing.action?pageNum=1">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>记过通告</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="<%=basePath%>RecordController/findRecord.action?pageNum=1">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>报修通告</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="<%=basePath%>NoticeController/findNotice.action?pageNum=1">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>缴费通告</cite>
                        </a>
                    </li >
                </ul>
            </li>
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6ce;</i>
                    <cite>宿舍信息浏览</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="<%=basePath%>TurnPageController/lineTurn.action">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>饼状图</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="<%=basePath%>TurnPageController/histogramTurn.action">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>柱状图</cite>
                        </a>
                    </li>
                     <li>
                        <a _href="echarts2.html">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>地理环境</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="echarts3.html">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>文字宣传</cite>
                        </a>
                    </li>
                </ul>
            </li>
        </ul>
      </div>
    </div>
    <!-- <div class="x-slide_left"></div> -->
    <!-- 左侧菜单结束 -->
    <!-- 右侧主体开始 -->
    <div class="page-content">
        <div class="layui-tab tab" lay-filter="xbs_tab" lay-allowclose="false">
          <ul class="layui-tab-title">
            <li>我的桌面</li>
          </ul>
          <div class="layui-tab-content">
            <div class="layui-tab-item layui-show">
                <iframe src='./welcome.html' frameborder="0" scrolling="yes" class="x-iframe"></iframe>
            </div>
          </div>
        </div>
    </div>
    <div class="page-content-bg"></div>
    <!-- 右侧主体结束 -->
    <!-- 中部结束 -->
    <!-- 底部开始 -->
    <div class="footer">
        <div class="copyright">Copyright ©2017 All Rights Reserved</div>  
    </div>
    <!-- 底部结束 -->
    
</body>
</html>