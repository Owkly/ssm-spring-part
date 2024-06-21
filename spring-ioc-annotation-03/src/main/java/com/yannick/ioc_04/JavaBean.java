package com.yannick.ioc_04;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JavaBean {

    private String name = "javabean_04";
    @Value("19")
    private int age;

    @Value("${yannick.username:root}")
    private String username;
    @Value("${yannick.password:0000}")
    private String password;

    @Override
    public String toString() {
        return "JavaBean{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}' + "\n";
    }
}
