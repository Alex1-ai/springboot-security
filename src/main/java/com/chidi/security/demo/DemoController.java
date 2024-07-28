package com.chidi.security.demo;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo-controller")
public class DemoController {

    @GetMapping
    @Operation(summary = "Say Hello", description = "Returns a greeting message")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello from secure Endpoint");
    }
}
