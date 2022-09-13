package com.example.simplems.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping("#{environment.SERVER_SERVLET_CONTEXT_PATH}/health")
    public void healthCheck() {}
}
