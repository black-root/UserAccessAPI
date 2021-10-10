package com.blackroot.useraccess;

import com.blackroot.useraccess.authentication.controller.UserController;
import com.blackroot.useraccess.authentication.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class UseraccessApplication {

    public static void main(String[] args) {
        SpringApplication.run(UseraccessApplication.class, args);
    }

}
