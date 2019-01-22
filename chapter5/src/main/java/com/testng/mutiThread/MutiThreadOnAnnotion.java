package com.testng.mutiThread;

import org.testng.annotations.Test;

public class MutiThreadOnAnnotion {

    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread Id:%s%n",Thread.currentThread().getId());
    }
}
