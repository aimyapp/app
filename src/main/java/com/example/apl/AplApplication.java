package com.example.apl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.example.db.mapper")
public class AplApplication {
    public static void main(String[] args) {
        SpringApplication.run(AplApplication.class, args);
    }
}
