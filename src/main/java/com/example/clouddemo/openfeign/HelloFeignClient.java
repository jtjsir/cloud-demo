package com.example.clouddemo.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author nanco
 * -------------
 * -------------
 * @create 19/9/8
 */
@FeignClient(name = "hello", url = "${hello.server.path}")
public interface HelloFeignClient {

    /**
     * 此处的路径需要与提供服务的路径一致
     *
     * @return
     */
    @GetMapping(value = "/hello")
    String hello();
}
