package com.schen.demo_java17;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.schen.demo_java17.mapper")
public class DemoJava17Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoJava17Application.class, args);

        System.out.println("success");
    }

}
