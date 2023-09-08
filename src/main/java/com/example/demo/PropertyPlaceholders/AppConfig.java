package com.example.demo.PropertyPlaceholders;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {

    @Value("${app.name}")
    private String appName;

    @Value("${app.description}")
    private String appDescription;

    public String getAppName() {
        return appName;
    }

    public String getAppDescription() {
        return appDescription;
    }
}

