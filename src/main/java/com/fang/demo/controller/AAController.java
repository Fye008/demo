package com.fang.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

/**
 * @ClassName AAController
 * @Author fang
 * @Date 2021/8/19
 * @Description TODO
 * @Version 1.0
 */

@Controller
public class AAController {


    @GetMapping("/aa")
    public void test1(){
        System.out.println("aaa");
    }


    @PostMapping("/aab")
    public void test2(){
        System.out.println("bbbb");
    }

    @PutMapping("/aab")
    public void test3(){
        System.out.println("bbbb");
    }

    @DeleteMapping("/aab2")
    public void test4(){
        System.out.println("bbbb");
    }
}
