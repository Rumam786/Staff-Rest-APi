package com.Myproject.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class homepage {

    @RequestMapping
    public String homepage() {
        return "Application Works........"+new Date();
    }
}
