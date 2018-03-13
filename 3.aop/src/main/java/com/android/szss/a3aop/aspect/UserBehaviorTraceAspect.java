package com.android.szss.a3aop.aspect;

import android.util.Log;

import com.android.szss.a3aop.annotation.UserBehaviorTrace;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

/**
 * @Description:
 * @author： 鼠茂斯
 * @date： 2018/3/12
 */

@Aspect
public class UserBehaviorTraceAspect {

    @Pointcut("execution(@com.android.szss.a3aop.annotation.UserBehaviorTrace * *(..))")
    public void methodUserBehaviorTraceAspect() {

    }

    @Before("methodUserBehaviorTraceAspect()")
    public Object userBehaviorPoint(ProceedingJoinPoint joinPoint) throws Throwable {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        String className = methodSignature.getDeclaringType().getSimpleName();
        String methodName = methodSignature.getName();
        String funName = methodSignature.getMethod().getAnnotation(UserBehaviorTrace.class).value();

        Log.d("ww", String.format("%s类%s功能进行用户行为统计", className, funName));
        return null;
    }

}
