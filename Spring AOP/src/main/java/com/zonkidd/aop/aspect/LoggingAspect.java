package com.zonkidd.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * 声明一个切面类
 *
 * @author zonkidd
 * @create 2019-07-18
 */
//把这个类声明为一个切面:需要把该类放入到IOC容器中、再声明为一个切面
@Aspect
@Component
@Order(1)
public class LoggingAspect {

    /**
     * @param joinPoint 封装了切面方法的信息
     *
     */

    @Before("execution(public void com.zonkidd.aop.impl.McLaren.brand(String))")
        public void beforeMethod(JoinPoint joinPoint)
        {
            //获取方法名
            String method = joinPoint.getSignature ( ).getName ( );
            //获取传入参数
            List<Object> args = Arrays.asList ( joinPoint.getArgs ( ) );

            System.out.println("The Method Begins"+method+ " with"+args);
        }

    @After ("execution(public void com.zonkidd.aop.impl.McLaren.brand(String))")
        public void afterMethod(JoinPoint joinPoint)
        {
            //获取方法名
            String method = joinPoint.getSignature ( ).getName ( );
            //获取传入参数
            List<Object> args = Arrays.asList ( joinPoint.getArgs ( ) );

            System.out.println("The Method "+method+" End  with "+args);
        }


    @AfterReturning("execution(public void com.zonkidd.aop.impl.McLaren.brand(String))")
        public void aferReturnMethod(JoinPoint joinPoint)
        {
            //获取方法名
            String method = joinPoint.getSignature ( ).getName ( );
            //获取传入参数
            List<Object> args = Arrays.asList ( joinPoint.getArgs ( ) );

            System.out.println("The Method "+method+" AfterReturning  with "+args);
        }

    @AfterThrowing("execution(public void com.zonkidd.aop.impl.McLaren.brand(String))")
    public void aferThrowMethod(JoinPoint joinPoint)
    {
        //获取方法名
        String method = joinPoint.getSignature ( ).getName ( );
        //获取传入参数
        List<Object> args = Arrays.asList ( joinPoint.getArgs ( ) );

        System.out.println("The Method "+method+" AfterThrowing with "+args);
    }

    @Around("execution(public void com.zonkidd.aop.impl.McLaren.brand(String))")
    public Object AroundMethod(ProceedingJoinPoint joinPoint)
    {
        //获取方法名
        String method = joinPoint.getSignature ( ).getName ( );
        //获取传入参数
        List<Object> args = Arrays.asList ( joinPoint.getArgs ( ) );

        System.out.println("The Method "+method+" before with "+args);
        Object result = null;
        try {
            //执行原方法？ 动态代理的invoke so写在这个方法之前的是before 之后的是after
            //result是执行目标方法的返回值
            result = joinPoint.proceed();

            System.out.println("The Method "+method+" after with "+args);
        } catch (Throwable throwable) {
            throwable.printStackTrace ( );
        }
        return result;
    }
}
