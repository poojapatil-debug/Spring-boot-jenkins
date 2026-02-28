package com.example.Spring_boot_jenkins;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringBootJenkinsApplication {

    @PostConstruct
    public void init() {
        log.info("Application started");
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJenkinsApplication.class, args);
    }
}