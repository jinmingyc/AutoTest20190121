package com.testng;

import org.testng.annotations.Test;

public class TimeOutTest {

    @Test(timeOut = 300)//期望300内执行
    public void testSuccesss() throws InterruptedException {
        Thread.sleep(200);
    }

    @Test(timeOut = 300)
    public void testFailed() throws InterruptedException {
        Thread.sleep(500);
    }
}
