package com.upc.pe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FinalApplication {

    @GetMapping("/message")
    public String message(){
        return "El delployment fue exitoso, gracias por el curso";
    }

    public static void main(String[] args) {

        SpringApplication.run(FinalApplication.class, args);
    }

}
