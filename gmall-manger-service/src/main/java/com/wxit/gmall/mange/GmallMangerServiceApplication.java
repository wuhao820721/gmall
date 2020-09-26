package com.wxit.gmall.mange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.wxit.gmall.mange.mapper")
public class GmallMangerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallMangerServiceApplication.class, args);
    }

}
