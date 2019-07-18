package com.zonkidd.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author zonkidd
 * @create 2019-07-18
 */
@Configuration
@ComponentScan("com.zonkidd.aop.*")
@EnableAspectJAutoProxy
public class AopConfig {

}
