package com.lf.graalvm;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
    public LogAspect(){
        System.out.println("LosAspect");
    }
    private final static Logger LOG= LoggerFactory.getLogger(LogAspect.class);

    @Pointcut("execution(public * com.lf.graalvm.*Controller.*(..))")
    public void controllerPointcut(){}

    @Before("controllerPointcut()")
    public void doBefore(JoinPoint point){
        LOG.info("--------------------------------LogAspect------------------------------");
    }
}
