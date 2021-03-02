package com.shangqi.fdapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class FDAPPApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(FDAPPApplication.class);
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(FDAPPApplication.class);
    }
}
