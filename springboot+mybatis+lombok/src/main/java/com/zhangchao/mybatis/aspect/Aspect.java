package com.zhangchao.mybatis.aspect;

import com.zhangchao.mybatis.Entity.JsonResult;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@org.aspectj.lang.annotation.Aspect
@Component
public class Aspect {
    @Pointcut("execution(public * com.zhangchao.mybatis.controller.*.*(..))")
    public void log(){
    }

    @Before("log()")
    public void doBefore(){
        System.out.println("前置方法");
    }

    @After("log()")
    public void doAfter(){
        System.out.println("后置方法");
    }

    @AfterThrowing("log()")
    public void doAfterError(){
        System.out.println("程序出错");
    }

    @Around("log()")
    public Object doArround(ProceedingJoinPoint jointPoint) throws Throwable {
        System.out.println("环绕通知");
        //获取被切入方法返回值
        Object result=jointPoint.proceed();
        //对被切入方法返回值进行处理
        return new  JsonResult(0,"请求出错");
    }

}
