package com.shiro.cas;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.cas.CasRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Service;

@Service("myShiroRealm")
public class MyCasRealm extends CasRealm {
//	public MyCasRealm() {
//		super();
//	}

	// 获取授权信息
//	@Override
//	protected AuthorizationInfo doGetAuthorizationInfo(
//			PrincipalCollection principals) {
//		//ModularRealmAuthenticator
////		CentralAuthenticationServiceImpl
////		DefaultFilter
//		System.out.println("===============================已经授权了添加授权信息");
//		// ... 与前面 MyShiroRealm 相同
//		Set<String> roleNames = new HashSet<String>();
//		Set<String> permissions = new HashSet<String>();
//		roleNames.add("admin");
//		permissions.add("user.do?myjsp");
//		permissions.add("user.do?notmyjsp");
//		permissions.add("login.do?main");
//		permissions.add("user.do?main");
//		permissions.add("main.jsp");
//		permissions.add("login.do?logout");
//		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo(roleNames);
//		info.setStringPermissions(permissions);
//		return info;
//	}
	

	@Override  
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {  
		System.out.println("===============================已经授权了添加授权信息");
        String username = (String)principals.getPrimaryPrincipal();  
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();  
//        authorizationInfo.setRoles(userService.findRoles(username));  
//        authorizationInfo.setStringPermissions(userService.findPermissions(username));  
        return authorizationInfo;  
    } 

	/**
	 * 返回 CAS 服务器地址，实际使用一般通过参数进行配置
	 */
	public String getCasServerUrlPrefix() {
		System.out.println("======================================getCasServerUrlPrefix");
		return "http://192.168.13.123:8080/cas-server-web";
	}
	
	/**
	 * 返回 CAS 客户端处理地址，实际使用一般通过参数进行配置
	 */
	public String getCasService() {
//		PrincipalCollection principalCollection = SecurityUtils.getSubject()  
//		        .getPrincipals();  
//		System.out.println(principalCollection);
//		if(principalCollection != null)
//		{
//			List principals = principalCollection.asList(); 
//			Map<String,String> attributes = (Map<String,String>) principals.get(1);  
//			try {
//				System.out.println(URLDecoder.decode(attributes.get("jsonString").toString(), "UTF-8"));
//			} catch (UnsupportedEncodingException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		System.out.println("======================================getCasService");
		return "http://192.168.9.89:8080/casClientMaven/main.jsp";
	}
}