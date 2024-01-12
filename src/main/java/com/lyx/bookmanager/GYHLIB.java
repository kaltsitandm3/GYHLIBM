package com.lyx.bookmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan("com.lyx.bookmanager.config")
public class GYHLIB {

    public static void main(String[] args) {
        SpringApplication.run(GYHLIB.class, args);
    }
    

}
