package com.programmer.dao.impl;

import com.programmer.dao.Phone;
import org.springframework.stereotype.Repository;

/**
 * Phone实现类
 *
 * @author zonkidd
 * @create 2019-09-16
 */
@Repository
public class iPhone implements Phone {
    private String brand ;

   public iPhone (){
        this.brand= "iPhone";
    }


    public void getBrand(){
        System.out.println(brand);
    }

    public void call(){
        System.out.println("iPhone呼出电话");
    }
}
