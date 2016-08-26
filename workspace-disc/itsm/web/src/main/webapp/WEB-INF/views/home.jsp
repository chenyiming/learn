<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Home</title>
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
</body>
</html>
