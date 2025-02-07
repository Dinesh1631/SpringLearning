package com.security.securityConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.handler.HandlerMappingIntrospector;

@Configuration
@EnableWebSecurity(debug = true)
public class appSecurityConfiguration {
	@Autowired
	HttpSecurity httpSecurity;

	/* Creating user with Builder Pattren */
//	@Bean
//	UserDetailsManager userSetUp() {
//		UserDetails DineshUser = User.withUsername("Dinesh")
//				.password("$2a$10$3ILZqmhUJLlYLPjasM3UTeUK85EspMhIX76DQV7Omkw2o4tBPWF1e").authorities("User", "Admin")
//				.build();
//		UserDetails RinUser = User.withUsername("Rin")
//				.password("$2a$10$91hYpE4/Nb77iLKDYekjVeVtBjMQJMrrkEN9vhSvL6dQFL99/g6uu").authorities("User")
//				.build();
//		return new InMemoryUserDetailsManager(DineshUser, RinUser);
//	}

//	@Bean()
//	PasswordEncoder encodePassword() {
//		return new BCryptPasswordEncoder();
//	}

	@Bean()
	SecurityFilterChain customFliterChain() throws Exception {

		// Works fine with spring 6.0:
		//httpSecurity.formLogin();
		//
		//
		//httpSecurity.authorizeHttpRequests(customizer->{
		//customizer.requestMatchers("/Hi").permitAll();
		//});
		// httpSecurity.authorizeHttpRequests().requestMatchers("/Hello").authenticated();
		// httpSecurity.authorizeHttpRequests().requestMatchers("/Byee").denyAll();
		//
		//
		///*To work with the Postm
		//httpSecurity.httpBasic();
		
		
		//Spring 6.1 impl:
		httpSecurity.formLogin(Customizer.withDefaults());
		
		httpSecurity.authorizeHttpRequests(Customizer->{
			Customizer.requestMatchers("/WEB-INF/views/**","/register","/registerionProcessPage").permitAll();
			Customizer.requestMatchers("/Hello").authenticated();
			Customizer.requestMatchers("/Byee").hasAuthority("Admin");
			Customizer.anyRequest().authenticated();
			
		});
		httpSecurity.csrf().disable();

		return httpSecurity.build();
	}

	@Bean(name = "mvcHandlerMappingIntrospector")
	public HandlerMappingIntrospector handlerMappingIntrospector() {
		return new HandlerMappingIntrospector();
	}

	/* Creating user without Builder Pattren */

// UserDetailsManager manager = new InMemoryUserDetailsManager();
//
// @Bean()
// UserDetailsManager setUp() {
//
// // Create a list to hold the roles
// List<GrantedAuthority> authorities = new ArrayList<>();
// authorities.add(new SimpleGrantedAuthority("ROLE_Admin"));
// authorities.add(new SimpleGrantedAuthority("ROLE_user"));
// authorities.add(new SimpleGrantedAuthority("ROLE_Visitor"));
//
// UserDetails DineshUser = new User("Dinesh", "Dinesh@123", authorities);
// UserDetails DemoUser = new User("Demo", "Demo@123", authorities);
// manager.createUser(DineshUser);
// manager.createUser(DemoUser);
// return manager;
// }
//
// @Bean()
// PasswordEncoder encode() {
// return NoOpPasswordEncoder.getInstance();
// }

	@Bean()
	 PasswordEncoder encode() {
	 return new BCryptPasswordEncoder();
	 }
}