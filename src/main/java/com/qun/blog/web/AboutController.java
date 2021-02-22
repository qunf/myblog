/*
 * @Author  : qun_f
 * @Time    : 2021/2/21 20:49
 */
package com.qun.blog.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

    @GetMapping("/about")
    public String about(){
        return "about";
    }
}
