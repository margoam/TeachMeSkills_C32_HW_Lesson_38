package com.tms.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan("com.tms")
@Configuration
@EnableAspectJAutoProxy
public class AppConfig {
}
