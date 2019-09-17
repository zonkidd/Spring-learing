package com.programmer.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 程序员
 *
 * @author zonkidd
 * @create 2019-09-16
 */
@Repository
public class ProgrammerDao{

    public void call(Phone phone){
    phone.call ();
}
}