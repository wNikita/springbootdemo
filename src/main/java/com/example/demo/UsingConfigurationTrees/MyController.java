package com.example.demo.UsingConfigurationTrees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private final AppConfig appConfig;
    private final DatabaseConfig databaseConfig;

    @Autowired
    public MyController(AppConfig appConfig, DatabaseConfig databaseConfig) {
        this.appConfig = appConfig;
        this.databaseConfig = databaseConfig;
    }

    @GetMapping("/app-config")
    public String getAppConfig() {
        return "App Name: " + appConfig.getName() + ", Version: " + appConfig.getVersion();
    }

    @GetMapping("/database-config")
    public String getDatabaseConfig() {
        return "DB URL: " + databaseConfig.getUrl() + ", Username: " + databaseConfig.getUsername();
    }
}

