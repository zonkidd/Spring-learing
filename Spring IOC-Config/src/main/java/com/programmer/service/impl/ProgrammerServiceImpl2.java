package com.programmer.service.impl;

import com.programmer.dao.Phone;
import com.programmer.dao.ProgrammerDao;
import com.programmer.service.ProgrammerService;
import org.springframework.stereotype.Service;

/**
 * @author zonkidd
 * @create 2019-09-16
 */
@Service
public class ProgrammerServiceImpl2 implements ProgrammerService {
    private Phone phone;
    private String language;
    private ProgrammerDao programmerDao;


    ProgrammerServiceImpl2(ProgrammerDao programmerDao){
        this.programmerDao = programmerDao;
    }


    public void setLanguage(String language){
        this.language = language;
    }
    public void setPhone(Phone phone){
        this.phone =phone;
    }


    public void call(){
        programmerDao.call ( phone );
    }

    public void print(){
        System.out.println("phone = "+phone+"\n language = "+language);
    }
}
