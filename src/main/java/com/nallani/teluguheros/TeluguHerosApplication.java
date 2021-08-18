package com.nallani.teluguheros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class TeluguHerosApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeluguHerosApplication.class, args);
    }

}
