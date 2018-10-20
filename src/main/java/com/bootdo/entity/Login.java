package com.bootdo.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Login{
    @Value("${user.username}")
    private String username;
    @Value("${user.password}")
    private String password;

}