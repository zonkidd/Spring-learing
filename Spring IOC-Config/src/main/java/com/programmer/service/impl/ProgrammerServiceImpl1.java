package com.programmer.service.impl;

import com.programmer.dao.Phone;
import com.programmer.dao.ProgrammerDao;
import com.programmer.service.ProgrammerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zonkidd
 * @create 2019-09-16
 *
 */
@Service
public class ProgrammerServiceImpl1 implements ProgrammerService {
    @Resource(name = "iPhone")
    private Phone phone;

    @Autowired
    private ProgrammerDao programmerDao;

    @Value ( "Java" )
    private String language;

    public ProgrammerServiceImpl1(){}
    //使用注解的话，如何实现构造器注入，还是说 已经不需要构造器注入了
   public ProgrammerServiceImpl1(ProgrammerDao programmerDao, Phone phone, String language){
        this.programmerDao = programmerDao;
        this.phone = phone;
        this.language = language;
    }


    public void call(){
        programmerDao.call ( phone );
    }

    public void print(){
        System.out.println("phone = "+phone+"language = "+language);
    }
}
