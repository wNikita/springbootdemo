package com.example.demo.ActivationProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private MyAppConfig myAppConfig;

    @GetMapping("/feature-status")
    public String getFeatureStatus() {
        return "Feature is enabled: " + myAppConfig.isFeatureEnabled();
    }
}
