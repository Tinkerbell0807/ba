package app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration {

    @Bean
    public SecurityFilterChain configureHttpSecurity(HttpSecurity http) throws Exception {
        http.cors().disable()
                .csrf().disable()
                .authorizeHttpRequests(request -> request.anyRequest().permitAll());
        return http.build();
    }
}

