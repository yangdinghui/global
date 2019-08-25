package com.jscloud.LogConfig;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;


/**
 * description 描述这个类的主要功能、用途
 * 创建时间 2019/8/24
 *
 * @author 杨丁辉
 */
@Slf4j
@Aspect //声明一个切面
@Component
public class LogAspect {

    public  LogAspect(){
        log.info("加载日志拦截类");
    }

    // 通过@PointCut 注解声明切点
    @Pointcut("@annotation(com.jscloud.LogConfig.ActionLog)")
    private void annotationPointcut() {
    }

//    // 通过@After注解声明一个通过，并使用@PointCut定义的切点
//    @After("annotationPointcut()")
//    public void after(JoinPoint joinPoint) {
//        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
//        Method method = signature.getMethod();
//        // 通过反射可获得注解上的属性，然后做日志记录相关的操作
//        ActionLog actionLog = method.getAnnotation(ActionLog.class);
//        System.out.println("注解式拦截--->>：" + actionLog.value());
//    }

//    @Around("annotationPointcut()")
//    public void around(JoinPoint joinPoint) {
//        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
//        Method method = signature.getMethod();
//        // 通过反射可获得注解上的属性，然后做日志记录相关的操作
//        ActionLog actionLog = method.getAnnotation(ActionLog.class);
//        System.out.println("around注解式拦截--->>：" + actionLog.value() + "，方法名：--->"+method.getName());
//    }
    @Around("annotationPointcut()")
    public Object  around(ProceedingJoinPoint joinPoint) throws Throwable{

        Object[] args = joinPoint.getArgs();
        for (Object object : args) {
            log.info("info--->"+object);

        }
        Object obj = null;
        try {
            obj = joinPoint.proceed();
        }catch (Exception e){
            throw e;
        }
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        ActionLog actionLog = method.getAnnotation(ActionLog.class);
        log.info("注解式拦截--->>：" + actionLog.value() + "，方法名：--->"+method.getName());
        return obj;
    }

    // 通过@Before注解声明一个建言，此建言直接[使用拦截规则]作为参数
//    @Before("execution(* com.jscloud.login.controller.LoginController.*(..))")
//    public void before(JoinPoint joinPoint) {
//        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
//        Method method = signature.getMethod();
//        System.out.println("方法规则式拦截--->>：" + method.getName());
//    }
}
