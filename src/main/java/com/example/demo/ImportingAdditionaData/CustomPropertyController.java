package com.example.demo.ImportingAdditionaData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomPropertyController {

    private final CustomPropertiesConfig customPropertiesConfig;

    @Autowired
    public CustomPropertyController(CustomPropertiesConfig customPropertiesConfig) {
        this.customPropertiesConfig = customPropertiesConfig;
    }

    @GetMapping("/custom-property")
    public String getCustomProperty() {
        return customPropertiesConfig.getCustomProperty();
    }
}
