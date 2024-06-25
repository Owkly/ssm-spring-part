//package com.yannick.service.advice;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.*;
//import org.springframework.stereotype.Component;
//
//import java.lang.reflect.Modifier;
//
//@Component
//@Aspect
//public class MyAdvice {
//    @Before("com.yannick.service.pointcut.MyPointCut.pc()")
//    public void before(JoinPoint joinPoint) {
//        // info sur la classe
//        String simpleName = joinPoint.getTarget().getClass().getSimpleName();
//
//        System.out.println(simpleName);
//
//        // type
//        int modifiers = joinPoint.getSignature().getModifiers();
//        String s = Modifier.toString(modifiers);
//
//        // nom méthode
//        String methodName = joinPoint.getSignature().getName();
//
//        System.out.println(methodName);
//        System.out.println(s);
//
//        // param
//        Object[] args = joinPoint.getArgs();
//        System.out.println("" + args[0]);
//    }
//
//    @AfterReturning(value = "com.yannick.service.pointcut.MyPointCut.pc()", returning = "result")
//    public void afterReturn(JoinPoint joinPoint, Object result) {
//
//    }
//
//    @After("com.yannick.service.pointcut.MyPointCut.pc()")
//    public void after(JoinPoint joinPoint) {}
//
//    @AfterThrowing(value = "com.yannick.service.pointcut.MyPointCut.pc()", throwing = "throwable")
//    public void afterThrowing(JoinPoint joinPoint, Throwable throwable) {}
//}
