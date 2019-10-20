package com.example.clouddemo.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nanco
 * -------------
 * -------------
 * @create 19/9/8
 */
@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public String sayToHello() {
        System.out.println("[microservice]starting to generate the result....");
        return "Hello World!";
    }
}
