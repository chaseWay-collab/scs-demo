package com.team.scs.scsdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.team.scs.scsdemo.mapper")
public class ScsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScsDemoApplication.class, args);
        System.out.println("success!");
    }

}
