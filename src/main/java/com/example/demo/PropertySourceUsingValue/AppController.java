package com.example.demo.PropertySourceUsingValue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    private final AppConfig appConfig;

    @Autowired
    public AppController(AppConfig appConfig) {
        this.appConfig = appConfig;
    }

    @GetMapping("/")
    public String home(Model model) {
        System.out.println(appConfig.getTitle());
        System.out.println(appConfig.getVersion());
        System.out.println(appConfig.getDescription());
       return appConfig.getDescription();
    }
}
