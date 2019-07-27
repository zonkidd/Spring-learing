package com.zonkidd.service.impl;

import com.zonkidd.service.AccountService;

import java.util.Date;

/**
 * @author zonkidd
 * @create 2019-07-26
 */
public class AccountServiceImpl implements AccountService {

    private String name;
    private Integer age;
    private Date birthday;


    public AccountServiceImpl(String name, Integer age, Date birthday){
        this.name=name;
        this.age=age;
        this.birthday=birthday;

    }

    public void saveAccount(){
        System.out.println("name="+name+" age="+age+" birthday="+birthday+" 保存了账户");

    }
}
