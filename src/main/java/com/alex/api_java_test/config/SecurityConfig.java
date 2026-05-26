package com.alex.api_java_test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
@Configuration
public class SecurityConfig {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
            .csrf(csrf -> csrf.disable())

            .authorizeHttpRequests(auth -> auth

                // public routes
                .requestMatchers(
                    "/auth/login",
                    "/auth/register",
                    "/users",
                    "/users/**"
                ).permitAll()

                // everything else protected
                .anyRequest().authenticated()
            );

        return http.build();
    }
}