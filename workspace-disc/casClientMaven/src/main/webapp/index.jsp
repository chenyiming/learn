<%@ page pageEncoding="UTF-8"%>
<%@ page import="org.jasig.cas.client.authentication.AttributePrincipal"%>
<%@ page import="java.util.Map"%>
<%@ page import="java.util.List"%>
<%@ page import="java.net.URLDecoder"%>
<%@ page import="java.util.Iterator"%>
<%@ page import="org.apache.shiro.subject.PrincipalCollection"%>

<%@ page import="com.ourfuture.cas.client.util.ReadFile"%>  
<%@ page import="com.ourfuture.cas.client.util.SpringContextHolder"%>
<%@ page import="com.ourfuture.cas.client.util.ConfigUtil"%>
<%@ page import="java.io.UnsupportedEncodingException"%>
<%@ page import="org.apache.shiro.subject.PrincipalCollection"%>
<%@ page import="org.apache.shiro.SecurityUtils"%>
<!DOCTYPE html>
<html>
    <head>
    	<title>index.jsp</title>
	</head>
	<%
		String type = ReadFile.readFile(request);
		out.print("是否可访问状态：" + type + "<br/>");
		
		String json = null;
		PrincipalCollection principalCollection = SecurityUtils.getSubject()  
		        .getPrincipals();  
		if(principalCollection != null)
		{
			List principals = principalCollection.asList(); 
			out.println("当前用户："+ principalCollection.getPrimaryPrincipal() + "<br />");
			Map<String,String> attributes = (Map<String,String>) principals.get(1);  
			try {
// 				out.println((URLDecoder.decode(attributes.get("jsonString").toString(), "UTF-8")));
				json = URLDecoder.decode(attributes.get("jsonString").toString(), "UTF-8");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
	 %>
	<br/>
	<a href="javascript:ssoLogout();">我要登出</a>  
	  <script type="text/javascript">
		 function ssoLogout(){  
		    if(confirm('确定要退出系统吗？')){  
		        top.location.href ="http://192.168.13.123:8080/cas-server-web/logout?service=http://192.168.9.89:8080/casClientMaven/index.jsp";  
		    }  
		}  
	</script> 