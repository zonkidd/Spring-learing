package com.zonkidd.service.impl;

import com.zonkidd.service.AccountService;

import java.util.*;

/**
 * @author zonkidd
 * @create 2019-07-26
 */
public class AccountServiceImpl3 implements AccountService {

    private String[] myStrs=null;
    private List<String> myList=null;
    private Set<String> mySet=null;
    private Map<String,String> myMap=null;
    private Properties myProps=null;

    public void setMyStrs(String[] myStrs) {
        this.myStrs = myStrs;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public void setMySet(Set<String> mySet) {
        this.mySet = mySet;
    }

    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
    }

    public void setMyProps(Properties myProps) {
        this.myProps = myProps;
    }

    public void saveAccount(){
        System.out.println( Arrays.toString(myStrs));
        System.out.println( myList);
        System.out.println( myMap);
        System.out.println( mySet);
        System.out.println( myProps );

}
}
