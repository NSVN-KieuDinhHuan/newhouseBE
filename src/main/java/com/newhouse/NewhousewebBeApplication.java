package com.newhouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class NewhousewebBeApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewhousewebBeApplication.class, args);
    }


    @RequestMapping(value = "/")
    public String hello() {
        return "Hello World from Tomcat";
    }
}
