<%@ page language="java" pageEncoding="UTF-8"%>

<!DOCTYPE HTML >
<html>
	<head>

		<title>main.jsp</title>
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

	</head>
	<body>
		ddddddddddd
		 <a href="javascript:ssoLogout();">我要登出</a>  
	  <script type="text/javascript">
		 function ssoLogout(){  
		    if(confirm('确定要退出系统吗？')){  
		        top.location.href ="http://192.168.9.16:8080/cas-server-web/logout?service=http://192.168.9.89:8080/web/index.jsp";  
		    }  
		}  
	</script> 
	</body>
</html>
