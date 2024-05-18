package com.tocode.system;


import com.tocode.common.constant.NumberConstants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SystemApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SystemApplication.class);
        application.run(args);
    }
}
