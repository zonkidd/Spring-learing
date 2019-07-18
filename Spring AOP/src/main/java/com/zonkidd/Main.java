package com.zonkidd;

import com.zonkidd.aop.impl.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zonkidd
 * @create 2019-07-18
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx= new AnnotationConfigApplicationContext ( com.zonkidd.aop.config.AopConfig.class );

//        ApplicationContext ctx= new ClassPathXmlApplicationContext ( "aop.xml" );
//        Car car = ctx.getBean ( McLaren.class );
//        ctx.getBean ( Benz.class );
        Car car = (Car)ctx.getBean ( "mcLaren" );
//        String[] beanDefinitionNames = ctx.getBeanDefinitionNames ();
//        for(String tmp:beanDefinitionNames)
//        {
//            System.out.println("tmp的值是：---"+ tmp + "，当前方法=Main.main()");
//        }
        car.brand("Benz");
        car.maxSpeed ();
    }

}
