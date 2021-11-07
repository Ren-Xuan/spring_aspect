package com.renxuan.aspectJ.demo1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 切面类
 */
@Aspect
public class MyAspectAnno {
	
	@Before(value = "execution(* com.renxuan.aspectJ.demo1.ProductDao.*(..))")
	public void before() {
		System.out.println("before....");
	}
	
	@AfterReturning(value = "execution(* com.renxuan.aspectJ.demo1.ProductDao.find*(..))",returning = "result")
	public void afterReturing(Object result) {
		System.out.println("after.....result:"+result);
	}
	
	@Around(value = "execution(* com.renxuan.aspectJ.demo1.ProductDao.update(..))")
	public Object around(ProceedingJoinPoint joinPoint)throws Throwable{
		System.out.println("===============环绕前通知===============");
		Object object=joinPoint.proceed();//执行目标方法
		System.out.println("===============环绕后通知===============");
		System.out.print("===============joinPoint："+object+"\n");
		return object;
	}
	
	@AfterThrowing(value = "execution(* com.renxuan.aspectJ.demo1.ProductDao.find*(..))",throwing = "e")
	public void afterThrowing(Throwable e) {
		System.err.println("error throwing "+e.getMessage());
	}
	
	@After(value = "myPointCut1()")
	public void after() {//用切入点作为value
		System.out.println("Finally:=============");
	}
	
	@Pointcut(value = "execution(* com.renxuan.aspectJ.demo1.ProductDao.find*(..))")
	private void myPointCut1() {}//空方法相当于id
	
	
	
	
}
