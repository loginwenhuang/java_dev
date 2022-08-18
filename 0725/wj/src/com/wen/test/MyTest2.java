package com.wen.test;

import org.apache.log4j.Logger;

/**
 * @author :muxiaowen
 * @date : 2022/7/26 8:49
 */
public class MyTest2 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(MyTest2.class);
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
        logger.fatal("fatal");
    }
}
