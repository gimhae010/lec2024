package com.gimhae.sts19;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class WebSecurity {
	@Bean
	BCryptPasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	JwtService jwtService() {
		return new JwtService();
	}

	@Bean
	SecurityFilterChain config(HttpSecurity http) throws Exception {
		http.csrf(token->token.disable());
		http.cors(cors->{});
		http
			.sessionManagement(manager->{
				manager.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
			}) // session사용x
			.addFilterBefore(new TokenFilter(jwtService()), UsernamePasswordAuthenticationFilter.class)
			.authorizeHttpRequests((auth)->{
				auth.requestMatchers("/","/dept/").authenticated();
				auth.requestMatchers("/token").permitAll();
			})
			.formLogin(login->{
//				login.loginPage("/login");
				login.permitAll();
			})
			;
		return http.build();
	}
}








