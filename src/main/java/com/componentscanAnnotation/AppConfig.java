package com.componentscanAnnotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.componentscanAnnotation")
public class AppConfig {
}
