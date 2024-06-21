package com.yannick.ioc_03;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class UserController {

    @Resource(name = "userServiceImpl")
    private UserService userService;

    public void show(){
        String show = userService.sayHello();
        System.out.println("UserController.show(): " + show);
    }
}
