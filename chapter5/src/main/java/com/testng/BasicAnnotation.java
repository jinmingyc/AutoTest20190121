package com.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    //用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("++++++this is case1");
    }

    @Test
    public void  testCase2(){
        System.out.println("++++++this is case2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("+++++++++beforemethod 运行");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("++++aftermethod 运行");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("+++++before 类之前运行");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("+++++afterClass 类之后运行");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("+++++++++++++++beforeSuite 测试套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("+++++++++++++++afterSuite 测试套件");
    }
}
