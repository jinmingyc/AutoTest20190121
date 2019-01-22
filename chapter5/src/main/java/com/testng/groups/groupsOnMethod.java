package com.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class groupsOnMethod {

    @Test(groups = "server")
    public void test1(){
        System.out.println("==========服务端组");
    }
    @Test(groups = "client")
    public void test2(){
        System.out.println("=========测试端组");
    }
    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("====服务端组运行之前运行");
    }

    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("----------服务端组运行之后运行");
    }
}
