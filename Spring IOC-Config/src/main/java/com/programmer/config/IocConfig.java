package com.programmer.config;

import com.programmer.dao.Phone;
import com.programmer.dao.ProgrammerDao;
import com.programmer.dao.impl.iPhone;
import com.programmer.service.ProgrammerService;
import com.programmer.service.impl.ProgrammerServiceImpl1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.Resource;

/**
 * 注解配置类
 *
 * @author zonkidd
 * @create 2019-07-28
 */
@Configuration
@ComponentScan("com.programmer")
@PropertySource ( "classpath:Config.properties" )
public class IocConfig {
    @Value("${driver}")
    private String driver = null;
    @Value ( "${url}" )
    private String url=null;
    @Value("${userName}")
    private String userName=null;
    @Value ( "${password}" )
    private String password=null;


    @Bean
    public void testValue(){

        System.out.println("driver=" +driver+ " url=" +url+" userName="+userName+ " password="+password);

    }


    @Bean
    //用于把当前方法的返回值作为bean对象存入spring的ioc容器中
    public ProgrammerDao testBean(ProgrammerDao programmerDao){

        return programmerDao;//仅做测试用途
    }

     //如果去掉 @Bean(name="object")，则上面方法会报错。 用于测试
    @Bean(name="object")
    public String getObject(){

        return "A String Object";
    }

}
