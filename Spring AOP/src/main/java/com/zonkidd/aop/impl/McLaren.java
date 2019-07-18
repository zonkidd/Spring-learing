package com.zonkidd.aop.impl;

import org.springframework.stereotype.Component;

/**
 * 实现Car接口
 *
 * @author zonkidd
 * @create 2019-07-18
 */
@Component
public class McLaren implements Car{
    @Override
    public void brand(String string){
        System.out.println("this is McLaren");
    }
    @Override
    public void maxSpeed(){
        System.out.println("240 km/h");
    }

}
