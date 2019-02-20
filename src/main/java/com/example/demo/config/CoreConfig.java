package com.example.demo.config;

import com.example.demo.service.UserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoreConfig {
    @Bean
    public UserDetailsService userDetailsService(){
        return new UserDetailsService();
    }
}
