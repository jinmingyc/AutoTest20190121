package com.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("name="+name+";age"+age);
    }
    @DataProvider(name = "data")
    public Object[][] providerDate() {
        Object[][] o = new Object[][]{
                {"zhangsan1", 10},
                {"lisi1", 20}
        };
        return o;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("test1 方法+" +name+";age="+age);
    }
    @Test(dataProvider = "methodData")
    public void test2(String name,int age) {
        System.out.println("test22方法+" +name+";age="+age);
    }
    @DataProvider(name="methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result=null;
        if(method.getName().equals("test1")){
            result = new Object[][]{
                    {"zhangsan",50},
                    {"lisi",60}
            };
        }else if(method.getName().equals("test2")){
            result = new Object[][]{
                    {"wangwu",100},
                    {"zhaoliu",110}
            };
        }
        return result;
    }
}
