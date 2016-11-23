package com.future.dao.aop;
import java.util.Arrays;

import org.aspectj.lang.JoinPoint;  
import org.aspectj.lang.annotation.AfterReturning;  
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Component;  
import org.springframework.util.StringUtils;  

@Aspect //注解定义切面
@Component
public class PersonAop {

	@Before("execution (* com.future.dao.*.save(..))")  
	 public void beforeMethod(JoinPoint joinPoint){
		 String methodName = joinPoint.getSignature().getName();
	        Object [] args = joinPoint.getArgs();
	        
	        System.out.println("--->The method " + methodName + " begins with " + Arrays.asList(args));
	}
	
	
	@AfterReturning(value="execution (* com.future.dao.PersonDao.save(..))",
            returning="result")
    public void afterReturning(JoinPoint joinPoint, Object result){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("The method " + methodName + " ends with " + result);
    }
}
