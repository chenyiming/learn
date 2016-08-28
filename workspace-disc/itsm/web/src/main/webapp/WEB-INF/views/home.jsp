<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Home</title>
	
	<!-- 引入 ECharts 文件 -->
    <script src="${pageContext.request.contextPath}/resources/js/echarts.min.js"></script>
</head>
<body>
<shiro:guest>
    欢迎游客访问，<a href="${pageContext.request.contextPath}/login.jsp">点击登录</a><br/>
</shiro:guest>
<shiro:user>
    欢迎[<shiro:principal/>]登录，<a href="${pageContext.request.contextPath}/logout">点击退出</a><br/>
</shiro:user>
<h1>
	Hello world! - 
	 <shiro:hasAnyRoles name="admin">
         <shiro:principal/> has roles admin
     </shiro:hasAnyRoles>
</h1>
${controllerMessage}<br/>
<br/>
<br/>
<a href="person/list">Go to the person list</a>


 <!-- 为ECharts准备一个具备大小（宽高）的Dom -->
    <div id="main" style="width: 600px;height:400px;"></div>
    <script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('main'));

        // 指定图表的配置项和数据
        var option = {
        	    title: {
        	        text: 'Graph 简单示例'
        	    },
        	    tooltip: {},
        	    animationDurationUpdate: 1500,
        	    animationEasingUpdate: 'quinticInOut',
        	    series : [
        	        {
        	            type: 'graph',
        	            layout: 'none',
        	            symbolSize: 50,
        	            roam: true,
        	            label: {
        	                normal: {
        	                    show: true
        	                }
        	            },
        	            edgeSymbol: ['circle', 'arrow'],
        	            edgeSymbolSize: [4, 10],
        	            edgeLabel: {
        	                normal: {
        	                    textStyle: {
        	                        fontSize: 20
        	                    }
        	                }
        	            },
        	            data: [{
        	                name: '节点1',
        	                x: 300,
        	                y: 300
        	            }, {
        	                name: '节点2',
        	                x: 800,
        	                y: 300
        	            }, {
        	                name: '节点3',
        	                x: 550,
        	                y: 100
        	            }, {
        	                name: '节点4',
        	                x: 550,
        	                y: 500
        	            }],
        	            // links: [],
        	            links: [{
        	                source: 0,
        	                target: 1,
        	                symbolSize: [5, 20],
        	                label: {
        	                    normal: {
        	                        show: true
        	                    }
        	                },
        	                lineStyle: {
        	                    normal: {
        	                        width: 5,
        	                        curveness: 0.2
        	                    }
        	                }
        	            }, {
        	                source: '节点2',
        	                target: '节点1',
        	                label: {
        	                    normal: {
        	                        show: true
        	                    }
        	                },
        	                lineStyle: {
        	                    normal: { curveness: 0.2 }
        	                }
        	            }, {
        	                source: '节点1',
        	                target: '节点3',
        	                label: {
        	                    normal: {
        	                        show: true
        	                    }
        	                },
        	            }, {
        	                source: '节点2',
        	                target: '节点3'
        	            }, {
        	                source: '节点2',
        	                target: '节点4'
        	            }, {
        	                source: '节点1',
        	                target: '节点4'
        	            }],
        	            lineStyle: {
        	                normal: {
        	                    opacity: 0.9,
        	                    width: 2,
        	                    curveness: 0
        	                }
        	            }
        	        }
        	    ]
        	};

        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
    </script>
</body>
</html>
