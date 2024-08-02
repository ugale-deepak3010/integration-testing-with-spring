package com.student_services.student_services.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class Hello {

    @GetMapping("/")
    public String getHello() {
        return new String("Hello");
    }
}
