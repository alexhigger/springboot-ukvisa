package com.wzh.ukvisa;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class UkvisaApplication {

    public static void main(String[] args) {
        SpringApplication.run(UkvisaApplication.class, args);
        System.out.println("--------working---------");
    }

}
