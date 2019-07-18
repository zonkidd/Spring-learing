package com.zonkidd.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * 验证切面
 *
 * @author zonkidd
 * @create 2019-07-19
 */
@Aspect
@Component
@Order(2)
public class ValidationAspect {

    @After ("execution(public void com.zonkidd.aop.impl.McLaren.brand(String))")
    public void afterMethod(JoinPoint joinPoint)
    {
        //获取方法名
        String method = joinPoint.getSignature ( ).getName ( );
        //获取传入参数
        List<Object> args = Arrays.asList ( joinPoint.getArgs ( ) );

        System.out.println("The Method end "+method+ " with"+args);
    }

}
