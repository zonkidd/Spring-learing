package com.programmer.main;

import com.programmer.service.impl.ProgrammerServiceImpl1;
import com.programmer.service.impl.ProgrammerServiceImpl2;
import com.programmer.service.impl.ProgrammerServiceImpl3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 使用XML 配置bean
 * @author zonkidd
 * @create 2019-07-26
 */
public class Client {
    public static void main(String[] args) {
        /*
        * 加载ApplicationContext的方式有两种：
        *   1、从XML中读取
        *   2、从配置类中读取
        */
        //从xml中读取
        ApplicationContext context=new ClassPathXmlApplicationContext ( "spring.xml" );



//        ProgrammerServiceImpl3 programmerService3 =context.getBean ( ProgrammerServiceImpl3.class );
//        ProgrammerServiceImpl2 programmerService2 =context.getBean ( ProgrammerServiceImpl2.class );
       ProgrammerServiceImpl3 programmerService3 =context.getBean ( ProgrammerServiceImpl3.class );

        programmerService3.print ();


    }

}
