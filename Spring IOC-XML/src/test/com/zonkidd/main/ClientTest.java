package com.zonkidd.main

import com.zonkidd.config.IocConfig;
import com.zonkidd.service.AccountService;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring整合junit的配置
 *  1、导入spring整合junit的jar
 *  2、使用Junit提供的一个注解把原有的main方法替换了，替换成了spring提供的
 *          @RunWith
 *  3、告知spring的运行期，spring和ioc创建是基于xml还是注解的，并且说明位置
 *          @ContextConfiguration
 *                  location:指定xml文件的位置，加上classpath关键字，表示在类路径下
 *                  classes：指定注解类所在的位置
 *   当我们使用spring 5.x版本的时候，junit的版本必须为4.1.2及以上
 * @author <zonkidd>
 * @since <pre>Jul 29, 2019</pre>
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=IocConfig.class)
public class ClientTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: main(String[] args) 
*
*/ 
@Test
public void testMain() throws Exception { 
//TODO: Test goes here...
    //从xml中读取
//        ApplicationContext context=new ClassPathXmlApplicationContext ( "springIoc.xml" );
    //从配置类中读取
    ApplicationContext context=new AnnotationConfigApplicationContext ( IocConfig.class);


    AccountService accountService = context.getBean ( "accountServiceImpl",AccountService.class );
//        AccountService accountService2 = context.getBean ( "accountServiceImpl2",AccountService.class );
//        AccountService accountService3 = context.getBean ( "accountServiceImpl3",AccountService.class );

    accountService.saveAccount ();

} 


} 
