package com.dominguezrosales.config;

import com.microsoft.azure.functions.ExecutionContext;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class FunctionConfiguration {

    private static ConfigurableApplicationContext context;

    public static ConfigurableApplicationContext getContext(ExecutionContext executionContext) {
        if (context == null) {
            context = SpringApplication.run(SpringBootConfiguration.class);
        }
        return context;
    }
}