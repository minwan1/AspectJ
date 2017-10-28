package com.example.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
//	@Before("execution(* com.mkyong.customer.bo.CustomerBo.addCustomer(..))")
//	@Before("execution(public * com.example.demo.TestService.testTransaction2(..))")
//	public void logBefore(JoinPoint joinPoint) {
//
//		System.out.println("logBefore() is running!");
//		System.out.println("hijacked : " + joinPoint.getSignature().getName());
//		System.out.println("******");
//	}

}
