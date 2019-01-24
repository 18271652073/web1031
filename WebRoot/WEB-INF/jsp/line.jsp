<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
   <title>后台系统管理</title>
	<meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />

    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="<%=basePath%>/css/font.css">
	<link rel="stylesheet" href="<%=basePath%>/css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script src="<%=basePath%>/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="<%=basePath%>js/xadmin.js"></script>

</head>
<body>
        <div class="x-body">
            <blockquote class="layui-elem-quote">
            这是图形界面,写的好累,不想动了
            </blockquote>
            <div id='ichart-render'></div>
            <blockquote class="layui-elem-quote">
              不要在意样式,反正出来就行.................................
            </blockquote>
        </div>
        <script src='http://www.ichartjs.com/ichart.latest.min.js'></script>
<script type='text/javascript'>
$(function(){
      var chart = iChart.create({
            render:"ichart-render",
            width:800,
            height:400,
            background_color:"#fefefe",
            gradient:false,
            color_factor:0.2,
            border:{
                  color:"BCBCBC",
                  width:1
            },
            align:"center",
            offsetx:0,
            offsety:0,
            sub_option:{
                  border:{
                        color:"#BCBCBC",
                        width:1
                  },
                  label:{
                        fontweight:500,
                        fontsize:11,
                        color:"#4572a7",
                        sign:"square",
                        sign_size:12,
                        border:{
                              color:"#BCBCBC",
                              width:1
                        },
                        background_color:"#fefefe"
                  }
            },
            shadow:true,
            shadow_color:"#666666",
            shadow_blur:2,
            showpercent:false,
            column_width:"70%",
            bar_height:"70%",
            radius:"90%",
            title:{
                  text:"楼栋学生比例图",
                  color:"#111111",
                  fontsize:20,
                  font:"微软雅黑",
                  textAlign:"center",
                  height:30,
                  offsetx:0,
                  offsety:0
            },
            subtitle:{
                  text:"",
                  color:"#111111",
                  fontsize:16,
                  font:"微软雅黑",
                  textAlign:"center",
                  height:20,
                  offsetx:0,
                  offsety:0
            },
            footnote:{
                  text:"",
                  color:"#111111",
                  fontsize:12,
                  font:"微软雅黑",
                  textAlign:"right",
                  height:20,
                  offsetx:0,
                  offsety:0
            },
            legend:{
                  enable:false,
                  background_color:"#fefefe",
                  color:"#333333",
                  fontsize:12,
                  border:{
                        color:"#BCBCBC",
                        width:1
                  },
                  column:1,
                  align:"right",
                  valign:"center",
                  offsetx:0,
                  offsety:0
            },
            coordinate:{
                  width:"80%",
                  height:"84%",
                  background_color:"#ffffff",
                  axis:{
                        color:"#a5acb8",
                        width:[1,"",1,""]
                  },
                  grid_color:"#d9d9d9",
                  label:{
                        fontweight:500,
                        color:"#666666",
                        fontsize:11
                  }
            },
            label:{
                  fontweight:500,
                  color:"#666666",
                  fontsize:11
            },
            type:"pie2d",
            data:[
                  {
                  name:"一栋",
                  value: ${build1/all},
                  color:"#4572a7"
            },{
                  name:"二栋",
                  value: ${build2/all},
                  color:"#aa4643"
            },{
                  name:"三栋",
                  value: ${build3/all},
                  color:"#89a54e"
            },{
                  name:"四栋",
                  value: ${build4/all},
                  color:"#4fcf5c"
            },{
	                name:"其他",
	                value: ${(1-(build1+build2+build3+build4)/all)},
	                color:"#4572a7"
            }
            ]
      });
      chart.draw();
});
</script>
    </body>
</html>