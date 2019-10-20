package com.example.clouddemo.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;

/**
 * @author nanco
 * -------------
 * @SpringBootTest 默认回去查找含有@SpringBootConfiguration注解的实体类，将其作为启动类
 * -------------
 * @create 19/9/8
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class MockControllerTests {

    @Resource
    private WebApplicationContext webApplicationContext;

    // mvc
    private MockMvc mockMvc;

    @Before
    public void setUp() {
        // get the mock mvc
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    /**
     * 模拟请求feign API
     */
    @Test
    public void helloFeignMockTest() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders
                        .get("/hello")
        )
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Hello World!"))
                .andDo(MockMvcResultHandlers.print());
    }
}
