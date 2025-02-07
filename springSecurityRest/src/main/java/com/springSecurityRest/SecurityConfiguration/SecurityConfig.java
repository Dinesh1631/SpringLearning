package com.springSecurityRest.SecurityConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.springSecurityRest.Filters.JWTFilter;

@Configuration
@EnableWebSecurity(debug=true)
public class SecurityConfig {
    @Autowired
    customUserDetailService customuserdetailservice;
    @Autowired
    private JWTFilter jwtFilter;
  
	@Bean
    public SecurityFilterChain customFilterChain(HttpSecurity http) throws Exception {
        http.csrf().disable();
           http .authorizeHttpRequests(request ->
                request.requestMatchers("/register", "/","/login").permitAll()  
                .anyRequest().authenticated()  
            );
           http.httpBasic(Customizer.withDefaults());
           http.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);
        return http.build();
    }

    @Bean
    public DaoAuthenticationProvider authProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setPasswordEncoder(getEncoder());
        authProvider.setUserDetailsService(customuserdetailservice); 
        return authProvider;
    }

    @Bean
    public PasswordEncoder getEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Bean
    public AuthenticationManager authencationManager(AuthenticationConfiguration config) throws Exception {
    	return config.getAuthenticationManager();
    }
    
    
}
