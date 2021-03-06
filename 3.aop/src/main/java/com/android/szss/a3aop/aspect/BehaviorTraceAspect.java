package com.android.szss.a3aop.aspect;

import android.util.Log;

import com.android.szss.a3aop.annotation.BehaviorTrace;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

/**
 * @Description:
 * @author： 鼠茂斯
 * @date： 2018/3/12
 */

@Aspect
public class BehaviorTraceAspect {

    //定义切面的规则
    //1.就在原来应用中哪些注释的地方放到当前切面进行处理
    //execution(注释名  注释用的地方)
    @Pointcut("execution(@com.android.szss.a3aop.annotation.BehaviorTrace * *(..))")
    public void methodAnnotatedWithBehaviorTrace() {
    }

    //2.对进入切面的内容如何处理
    //advice
    //@Before()  在切入点之前运行
    //@After()   在切入点之后运行
    //@Around()  在切入点前后都运行
    @Around("methodAnnotatedWithBehaviorTrace()")
    public Object weaveJoinPoint(ProceedingJoinPoint joinPoint) throws Throwable {

        //        MethodSignature methodSignature=(MethodSignature)joinPoint.getSignature();
        //        String className=methodSignature.getDeclaringType().getSimpleName();
        //        String methodName=methodSignature.getName();
        //        String funName=methodSignature.getMethod().getAnnotation(BehaviorTrace.class).value();

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        String className = methodSignature.getDeclaringType().getSimpleName();
        String methodName = methodSignature.getName();
        String funName = methodSignature.getMethod().getAnnotation(BehaviorTrace.class).value();

        //统计时间
        long begin = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long duration = System.currentTimeMillis() - begin;
        Log.d("ww", String.format("功能:%s,%s类的%s执行了,耗时%d", funName, className, methodName, duration));
        return result;
    }

}
