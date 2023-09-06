package com.example.demo.WorkingWithMultiDocumentFiles;

import com.example.demo.UsingConfigurationTrees.AppConfig;
import com.example.demo.UsingConfigurationTrees.DatabaseConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({AppConfig.class, DatabaseConfig.class})
public class MyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}
