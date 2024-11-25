package com.gimhae.sts17;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.SecurityBuilder;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

import jakarta.servlet.FilterChain;

@Configuration
@EnableWebSecurity
public class WebSecrity {

	@Bean
	SecurityFilterChain configure(HttpSecurity http) throws Exception {
		return http
//					.authorizeHttpRequests()
//					.requestMatchers("/dept/","/emp/").authenticated()	
//					.anyRequest().anonymous()
//				.and()
//					.formLogin()
//				.and()
//					.logout()
//				.and()
//				.build();
				.authorizeHttpRequests(reg->{
					reg.requestMatchers("/").anonymous();
					reg.anyRequest().authenticated();
				})
				.formLogin(login->login.loginPage("/login").permitAll())
				.build();
	}
	
}
