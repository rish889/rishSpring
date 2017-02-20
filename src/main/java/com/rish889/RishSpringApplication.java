package com.rish889;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RishSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(RishSpringApplication.class, args);
    }

    @RequestMapping("/getString")
    public String getString() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "rish889String";
    }
}
