package com.jyujyu.review.api;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestApi {

    @GetMapping("/hello/world")
    public String helloWord() {
        return "[GET] Hello, world";
    }

    @PostMapping("/hello/world")
    public String postHelloWord() {
        return "[POST] Hello, world";
    }

    @PutMapping("/hello/world")
    public String putHelloWord() {
        return "[PUT] Hello, world";
    }

    @DeleteMapping("/hello/world")
    public String deleteHelloWord() {
        return "[DELETE] Hello, world";
    }
}
