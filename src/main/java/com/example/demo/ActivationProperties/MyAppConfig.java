package com.example.demo.ActivationProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "myapp")
public class MyAppConfig {
    private boolean featureEnabled;

    public boolean isFeatureEnabled() {
        return featureEnabled;
    }

    public void setFeatureEnabled(boolean featureEnabled) {
        this.featureEnabled = featureEnabled;
    }
}

