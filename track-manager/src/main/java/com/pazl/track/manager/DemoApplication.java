package com.pazl.track.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import org.springframework.scheduling.annotation.EnableScheduling;


/*
* 由于配置的有feign调用所以需要  启动nacos，才会启动不报错
*  cd D:\ruanjian\nacos-server-2.0.3\nacos\bin
* d:
* #命令启动
startup.cmd -m standalone
*
*
linux
./startup.sh -m standalone
*
* 第3步: 访问nacos
打开浏览器输入http://localhost:8848/nacos，即可访问服务， 默认密码是nacos/nacos
*
*
* */
@SpringBootApplication(scanBasePackages = "com.pazl.track",exclude = {
        DataSourceAutoConfiguration.class})
//防止事务不生效的场景
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
