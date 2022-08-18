package com.wen.test2;

import jdk.internal.org.objectweb.asm.commons.SerialVersionUIDAdder;

import java.io.Serializable;

/**
 * @author :muxiaowen
 * @date : 2022/7/7 11:12
 */
public class Game implements Serializable {
    /**
     * 配置序列号可以保证在该类做了修改之后，反序列化时仍然能够识别为原始的类型，保持类的一致性
     */
    private static final long serialVersionUID = 220_021_219;
    private String name;
    private int level;

    //增加的修改
    private int score;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", level=" + level +
                '}';
    }
}
