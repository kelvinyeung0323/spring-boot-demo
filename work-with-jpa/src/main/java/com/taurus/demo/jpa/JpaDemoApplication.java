package com.taurus.demo.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by Kelvin Yeung on 2018/8/20.
 */
@SpringBootApplication
//可以不加，不加EntityScan则会在JpaDemoApplication下的包都扫描
@EntityScan(basePackages = "com.taurus.demo.jpa.entity")
public class JpaDemoApplication {

    public static void main(String[] args){

        SpringApplication.run(JpaDemoApplication.class, args);
    }
}
