package com.testng;

import org.testng.annotations.Test;

public class ExpectedException {
    /**
     * 什么时候用到？
     * 期望结果为某一个异常的时候，
     * 比如传入了不合法的参数，程序抛出了异常
     */

    //失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    private void runTimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }

    //成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void RuntimeExceptionSuccess(){
        System.out.println("这是成功的异常测试");
        throw new RuntimeException();
    }
}
