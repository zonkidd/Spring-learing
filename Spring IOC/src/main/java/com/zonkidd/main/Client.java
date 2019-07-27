package com.zonkidd.main;

import com.zonkidd.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zonkidd
 * @create 2019-07-26
 */
public class Client {
    public static void main(String[] args) {
//        AccountService as=
        ApplicationContext context=new ClassPathXmlApplicationContext ( "springIoc.xml" );
//        AccountService accountService =  context.getBean ( "accountService3");
        AccountService accountService = (AccountService) context.getBean ( "accountService2",AccountService.class );
        accountService.saveAccount ();
    }

}
