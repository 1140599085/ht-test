package com.zht.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author 张洪涛
 * @create 2021-09 24-15:05
 */
@RestController
public class TestController {
    @GetMapping("/list")
    public String getStr(){
        return "aaa";
    }
}
