package com.jyujyu.review.api;

import com.jyujyu.review.service.TestService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
public class TestEntityApi {

    private final TestService testService;

    @PostMapping("/test/entity/create")
    public void createTestEntity(
            @RequestBody CreateTestEntityRequest request
    ) {
        testService.create(request.getName(), request.getAge());
    }

    @PutMapping("/test/entity/{id}")
    public void putTestEntity(
            @PathVariable Long id,
            @RequestBody CreateTestEntityRequest request
    ) {
        testService.update(id, request.getName(), request.getAge());
    }

    @DeleteMapping("/test/entity/{id}")
    public void deleteTestEntity(
        @PathVariable Long id
    ) {
        testService.delete(id);
    }


    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class CreateTestEntityRequest {
        private String name;
        private Integer age;
    }

}
