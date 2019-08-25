package com.jscloud.login.controller;

import com.jscloud.LogConfig.ActionLog;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
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
//    @ActionLog(value = "【用户登录login】拦截", desc = "用户登录", type = "login")
    public String login(@PathVariable int id) {
        System.out.println("Test info-------->>>");
        return "hello" + id;
    }
}
