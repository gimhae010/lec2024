package com.gimhae.sts21.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.gimhae.sts21.service.JwtTokenProvider;

import jakarta.servlet.Filter;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
	@Autowired
	JwtTokenProvider jwtTokenProvider;
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
        .allowedMethods("OPTIONS","GET", "POST", "PUT", "DELETE")
        .allowedOrigins("http://127.0.0.1:5500")
        .allowedHeaders("*")
        .allowCredentials(true);
	}

	@Bean
	FilterRegistrationBean setFilter() {
		return new FilterRegistrationBean<Filter>(new TokenFilter(jwtTokenProvider));
	}
}
