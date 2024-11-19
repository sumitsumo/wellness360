package com.java.wellness360.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

public class SecurityConfig
{
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity)  throws Exception
    {
        httpSecurity.cors().disable();
        httpSecurity.csrf().disable();
        httpSecurity.authorizeRequests(
                authorizeRequests -> authorizeRequests
                        .anyRequest()
                        .permitAll()
        );
        return httpSecurity.build();
    }
}
