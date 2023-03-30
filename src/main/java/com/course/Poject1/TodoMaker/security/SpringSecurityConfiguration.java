package com.course.Poject1.TodoMaker.security;

import static org.springframework.security.config.Customizer.withDefaults;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfiguration {

	@Bean
	public InMemoryUserDetailsManager create() {
		
		UserDetails usd = createUser("muskan", "harsh");
		UserDetails usd1 = createUser("harsh", "muskan");
		
		return new InMemoryUserDetailsManager(usd, usd1);
	}

	private UserDetails createUser(String password, String username) {
		Function<String, String> encoder = p -> encoder().encode(p);
		
		UserDetails usd = User.builder()
				.passwordEncoder(encoder)
				.username(username)
				.password(password)
				.roles("ADMIN", "USER")
				.build();
		return usd;
	}
	
	@Bean
	public PasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public SecurityFilterChain filter(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(
				auth->auth.anyRequest().authenticated()
				);
		http.formLogin(withDefaults());
		http.csrf().disable();
		http.headers().frameOptions().disable();
		return http.build();
	}
	
}
