package com.example.demo.Session;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import lombok.Data;
//session bean
@Data
@SessionScope
@Component
public class HttpSessionBean {
    private String name;
}
