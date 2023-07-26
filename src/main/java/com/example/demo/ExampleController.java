package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
    @CrossOrigin(origins = {"http://localhost:3000", "https://dbsyacmkozvg1.cloudfront.net"})
    @GetMapping("/test")
    public String getTest() {
        return "자바 연결 완료";
    }
}
