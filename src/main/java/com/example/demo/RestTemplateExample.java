package com.example.demo;

import org.springframework.web.client.RestTemplate;

public class RestTemplateExample {

    public static void main(String[] args) {
        // Create a RestTemplate instance
        RestTemplate restTemplate = new RestTemplate();

        // Define the URL of the RESTful API you want to call
        String apiUrl = "http://localhost:8085/postmandemo_war_exploded/users";

        // Make a GET request and store the response as a String
        String response = restTemplate.getForObject(apiUrl, String.class);

        // Print the response
        System.out.println("Response Body: " + response);
    }
}
