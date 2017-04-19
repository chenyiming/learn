<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

 <%
     // 创建一个Cookie,包括(key,value).
     Cookie cookie = new Cookie("auth_user", "zhoutao");
     
     // 设置Cookie的生命周期,如果设置为负值的话,关闭浏览器就失效.
     cookie.setMaxAge(60*60*24*365);
     
     // 设置Cookie路径,不设置的话为当前路径(对于Servlet来说为request.getContextPath() + web.xml里配置的该Servlet的url-pattern路径部分)
      cookie.setPath("/"); 
   
     // 输出Cookie
     response.addCookie(cookie);
    %> 

<html>
<body>
<a href="http://192.168.13.179/">itop</a>
<shiro:guest>
    欢迎游客访问，<a href="${pageContext.request.contextPath}/login.jsp">点击登录</a><br/>
</shiro:guest>
<shiro:user>
    欢迎[<shiro:principal/>]登录，<a href="${pageContext.request.contextPath}/logout">点击退出</a><br/>
</shiro:user>
</body>
</html>
