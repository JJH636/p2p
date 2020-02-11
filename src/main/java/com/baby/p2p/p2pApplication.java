package com.baby.p2p;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.baby.p2p.dao")
@EnableScheduling
public class p2pApplication {
    public static void main(String[] args) {
        SpringApplication.run(p2pApplication.class,args);
    }
}
