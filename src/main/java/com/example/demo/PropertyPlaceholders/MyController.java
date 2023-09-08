package com.example.demo.PropertyPlaceholders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {

    private final AppConfig appConfig;

    @Autowired
    public MyController(AppConfig appConfig) {
        this.appConfig = appConfig;
    }

    @GetMapping("/app-info")
    public String getAppInfo() {
        return "Application Name: " + appConfig.getAppName() +
                "\nApplication Description: " + appConfig.getAppDescription();
    }
}
