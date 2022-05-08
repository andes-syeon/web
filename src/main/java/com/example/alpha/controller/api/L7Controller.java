package com.example.alpha.controller.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class L7Controller {

    @RequestMapping("/l7check")
    public String l7check() {
        return "OK";
    }
}
