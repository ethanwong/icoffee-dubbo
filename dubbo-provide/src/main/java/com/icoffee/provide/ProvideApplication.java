package com.icoffee.provide;


import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Name ProvideApplication
 * @Description
 * @Author huangyingfeng
 * @Create 2021-07-29 19:19
 */
@EnableDubbo //开启dubbo的注解支持
@SpringBootApplication
public class ProvideApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProvideApplication.class, args);
    }
}
