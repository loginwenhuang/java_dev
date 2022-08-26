package com.wen.util;

import org.apache.shiro.crypto.hash.SimpleHash;

import java.util.UUID;

/**
 * @author :muxiaowen
 * @date : 2022/8/25 17:48
 */
public class Md5Util {
    public static String getHash(String password,String salt){
        SimpleHash simpleHash = new SimpleHash("MD5", password, salt, 1000);
        return simpleHash.toString();
    }
    public static String getSalt(){
        return UUID.randomUUID().toString().substring(0,32);
    }
}
