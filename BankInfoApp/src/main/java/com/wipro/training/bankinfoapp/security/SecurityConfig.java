package com.wipro.training.bankinfoapp.security;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            // Allow H2 console
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/h2-console/**").permitAll()
                .anyRequest().authenticated()
            )
            // Form login
            .formLogin(form -> form.defaultSuccessUrl("/h2-console", true))
            // Logout
            .logout(logout -> logout.logoutSuccessUrl("/login"))
            // Disable CSRF for H2 console
            .csrf(csrf -> csrf.ignoringRequestMatchers("/h2-console/**"))
            // Frame options for H2 console
            .headers(headers -> headers.frameOptions(frame -> frame.sameOrigin()));

        return http.build();
    }
}
