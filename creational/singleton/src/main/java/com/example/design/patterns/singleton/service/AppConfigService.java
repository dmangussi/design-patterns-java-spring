package com.example.design.patterns.singleton.service;

import org.springframework.stereotype.Service;

@Service
public class AppConfigService {
    private String environment = "development";

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
