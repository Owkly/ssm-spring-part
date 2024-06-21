package com.yannick.ioc_03;

import org.springframework.stereotype.Service;

@Service
public class NewUserServiceImpl implements UserService {
    @Override
    public String sayHello() {
        return "2";
    }
}
