package com.example.demo.WorkingWithMultiDocumentFiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private final DatabaseConfig databaseConfig;
    private final AppConfig appConfig;

    @Autowired
    public MyController(DatabaseConfig databaseConfig, AppConfig appConfig) {
        this.databaseConfig = databaseConfig;
        this.appConfig = appConfig;
    }

    @GetMapping("/database-config")
    public String getDatabaseConfig() {
        return "DB URL: " + databaseConfig.getUrl() +
                ", Username: " + databaseConfig.getUsername() +
                ", Password: " + databaseConfig.getPassword();
    }

    @GetMapping("/app-config")
    public String getAppConfig() {
        return "App Name: " + appConfig.getName() +
                ", Version: " + appConfig.getVersion();
    }
}
