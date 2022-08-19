package com.test;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: hy
 * @create: 2022-08-19 10:26:48
 */
public class DemoGen {
    public void generator() throws Exception{
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        //指定 逆向工程配置文件
        File configFile = new File("E:\\Desktop\\Java_dev\\0819\\wj\\src\\main\\resources\\mybatis-config-gen.xml");
        //配置解析器
        ConfigurationParser cp = new ConfigurationParser(warnings);
        //配置对象
        Configuration config = cp.parseConfiguration(configFile);
        //回调设置
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        //构建mybatis代码生成工具对象
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
                callback, warnings);
        //进行代码生成
        myBatisGenerator.generate(null);
    }

    public static void main(String[] args) throws Exception {
        new DemoGen().generator();
    }
}
