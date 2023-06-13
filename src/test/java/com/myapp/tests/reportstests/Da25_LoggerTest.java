package com.myapp.tests.reportstests;

import com.myapp.utilities.LoggerUtils;
import org.testng.annotations.Test;

public class Da25_LoggerTest {

    @Test
    public void test1(){
        LoggerUtils.info("INFO LOG");
        LoggerUtils.warn("WARN LOG");
        LoggerUtils.error("ERROR LOG");
    }
}