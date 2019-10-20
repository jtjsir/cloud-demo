package com.example.clouddemo.openfeign;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author nanco
 * -------------
 * -------------
 * @create 19/9/8
 */
@RestController("feignHelloCtrl")
public class HelloController {

    @Resource
    private HelloFeignClient helloFeignClient;

    @GetMapping("/feign/hello")
    public String dispatcherHello() {
        System.out.println("starting to dispatch the hello request..");

        return helloFeignClient.hello();
    }
}
