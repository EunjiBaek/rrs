package com.jyujyu.review.api;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestRequestApi {

    // Request parameter 방식
    @GetMapping("/test/param")
    public String requestParam(
            @RequestParam("name") String name,
            @RequestParam("age") Integer age
    ) {
        return "Hello Request Param, I am " + name + "," + age;
    }

    // Path Variable 방식
    @GetMapping("/test/path/{name}/{age}")
    public String requestPathVariable(
        @PathVariable("name") String name,
        @PathVariable("age") Integer age
    ) {
        return "Hello, Path Variable";
    }


    // Request Body 방식
    @PostMapping("/test/body")
    public String requestBody(
          @RequestBody TestRequestBody request
    ) {
        return "Hello, Request Body, I am " + request.name + ", " + request.age;
    }

    public static class TestRequestBody {
        public String name;
        public Integer age;

        public TestRequestBody() {

        }

        public TestRequestBody(String name, Integer age) {
            this.name = name;
            this.age = age;
        }
    }

}
