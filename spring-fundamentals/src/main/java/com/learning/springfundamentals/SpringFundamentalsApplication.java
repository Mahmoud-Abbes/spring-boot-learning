package com.learning.springfundamentals;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("API")
public class SpringFundamentalsApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringFundamentalsApplication.class, args);
	}

    @GetMapping("sayHello")
    public String helloWord(){
        return "Hello Word Spring boot";
    }

}
