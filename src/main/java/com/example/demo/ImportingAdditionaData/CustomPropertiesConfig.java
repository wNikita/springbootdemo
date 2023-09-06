package com.example.demo.ImportingAdditionaData;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomPropertiesConfig {

    @Value("${custom.property}")
    private String customProperty;

    public String getCustomProperty() {
        return customProperty;
    }
}
