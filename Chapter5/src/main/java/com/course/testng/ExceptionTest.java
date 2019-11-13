package com.course.testng;

import org.testng.annotations.Test;

public class ExceptionTest {

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("运行时异常失败");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("运行时异常成功");
        throw new RuntimeException();
    }
}
