package com.example.design.patterns.singleton.controller;

import com.example.design.patterns.singleton.service.AppConfigService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigController {
    private final AppConfigService configService;

    public ConfigController(AppConfigService configService) {
        this.configService = configService;
    }

    @GetMapping
    public String getEnv() {
        return configService.getEnvironment();
    }

    @PostMapping
    public void setEnv(@RequestParam String env) {
        configService.setEnvironment(env);
    }
}