//package com.yannick.service.advice;
//
////@Component
////@Aspect
////public class LogAdvice {
////
////    @Pointcut("execution(* com..impl.*.*(..))")
////    public void pc() {}
////
////    @Before("pc()")
////    public void start(){
////        System.out.println("start start start");
////    }
////
////    @After("pc()")
////    public void end(){
////        System.out.println("end end end");
////    }
////
////    @AfterThrowing("pc()")
////    public void exception(){
////        System.out.println("exception exception exception");
////    }
////}
//
//
//import org.aspectj.lang.annotation.*;
//import org.springframework.stereotype.Component;
//
//@Component
//@Aspect
//public class LogAdvice {
//
//    @Before("com.yannick.service.pointcut.MyPointCut.pc()")
//    public void start(){
//        System.out.println("start start start");
//    }
//
//    @After("com.yannick.service.pointcut.MyPointCut.pc()")
//    public void end(){
//        System.out.println("end end end");
//    }
//
//    @AfterThrowing("com.yannick.service.pointcut.MyPointCut.pc()")
//    public void exception(){
//        System.out.println("exception exception exception");
//    }
//}
