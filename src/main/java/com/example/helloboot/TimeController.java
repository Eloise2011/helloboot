package com.example.helloboot;

/**
 * @author Joshua.H.Brooks
 * @description
 */

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {

    /**
     * 第二个核心直觉：
     * 注解 = 注册。
     * @RestController
     * @GetMapping
     * 这些注解不是写给人看的注释，它们是写给 Spring 的「登记指令」。Spring 启动时会扫描你的代码，发现这些注解，就自动把类创建成对象、把 URL 路径接到你的方法上。
     * 可以这样理解：这像一场招聘会——你举着「我会处理 HTTP 请求」的牌子（注解），主办方（Spring）扫场时看到牌子，就把你登记进名册（注册成对象），并给你安排工位（路由 /time）。
     * @return
     */
    @GetMapping("/time")
    public String time() {
        return "现在时间是：" + LocalDateTime.now();
    }
}