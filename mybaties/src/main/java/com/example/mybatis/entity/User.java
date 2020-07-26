package com.example.mybatis.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {
    private Integer id;
    private String userName;
    private String password;
    private String realName;
}
