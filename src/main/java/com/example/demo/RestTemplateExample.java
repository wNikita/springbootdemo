package com.example.demo;

import org.springframework.web.client.RestTemplate;

public class RestTemplateExample {

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();

        String apiUrl = "http://localhost:8085/postmandemo_war_exploded/users";

        String response = restTemplate.getForObject(apiUrl, String.class);

        System.out.println("Response Body: " + response);
    }
}
