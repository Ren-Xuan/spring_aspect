package com.renxuan.aspectJ.demo2;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspectXml {
	
	public void before() {
		System.out.println("===============前置通知=================");
	}
	public void after(Object result) {
		System.out.println("===============后置通知:"+result);
		
	}
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("===============环绕前通知=================");
		Object object =joinPoint.proceed();//执行目标方法
		System.out.println("===============环绕后通知=================");
		return object;
	}
	
	public void afterThrowing() {
		System.err.println("error:");
	}
	
}
