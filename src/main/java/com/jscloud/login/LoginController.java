package com.jscloud.login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description 描述这个类的主要功能、用途
 * 创建时间 2019/8/24
 *
 * @author 杨丁辉
 */
@RestController
@RequestMapping("/faq")
public class LoginController {

    @GetMapping("/login/{id}")
    public  String login(@PathVariable int id){
        return "hello" + id;
    }
}
