package com.example.pruebaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class PruebaApiApplication {

    @RequestMapping("/")
    String home(){
        return "Hola melissa i love you :3";
    }



    public static void main(String[] args) {
        SpringApplication.run(PruebaApiApplication.class, args);
    }

}
