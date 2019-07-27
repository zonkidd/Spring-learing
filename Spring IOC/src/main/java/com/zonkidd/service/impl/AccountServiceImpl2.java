package com.zonkidd.service.impl;

import com.zonkidd.dao.AccountDao;
import com.zonkidd.service.AccountService;

import java.util.Date;

/**
 * set方法注入
 *
 * @author zonkidd
 * @create 2019-07-26
 */
public class AccountServiceImpl2 implements AccountService {

    private String name;
    private Integer age;
    private Date birthday;
    private AccountDao accountDao;


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void saveAccount(){
        System.out.println("name="+name+",age="+age+",birthday="+birthday);
        accountDao.saveAccount ();
    }

}
