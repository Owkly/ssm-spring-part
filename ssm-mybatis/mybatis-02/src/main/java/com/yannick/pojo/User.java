package com.yannick.pojo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias(value = "user")
public class User {
    private Integer id;
    private String username;
    private String password;
}
