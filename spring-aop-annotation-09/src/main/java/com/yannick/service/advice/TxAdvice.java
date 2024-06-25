package com.yannick.service.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TxAdvice {

    @Around("com.yannick.service.pointcut.MyPointCut.pc()")
    public void transaction(ProceedingJoinPoint joinPoint) {

        Object[] args = joinPoint.getArgs();
        Object result = null;
        try {
            System.out.println("before");
            result = joinPoint.proceed(args);
            System.out.println("after");
        } catch (Throwable e) {
            System.out.println("exception");
            throw new RuntimeException(e);
        } finally {

        }


    }
}
