package com.example.demo;


import io.restassured.RestAssured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class classApiController {
    @GetMapping("/external")
    public String callExternalApi() throws Exception {
        // Replace with the actual URL of the API you want to call
        String url = "https://jsonplaceholder.typicode.com/posts";

        // Use RestAssured to call the API (for demonstration purposes)
        String response = RestAssured.get(url).asString();
        return response;
    }
}
