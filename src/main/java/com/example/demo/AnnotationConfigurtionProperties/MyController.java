package com.example.demo.AnnotationConfigurtionProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private final MyAppProperties myAppProperties;

    @Autowired
    public MyController(MyAppProperties myAppProperties) {
        this.myAppProperties = myAppProperties;
    }

    @GetMapping("/app-info")
    public String getAppInfo() {
        return "Application Name: " + myAppProperties.getName() + ", Version: " + myAppProperties.getVersion();
    }
}

