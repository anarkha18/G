package com.goldtheatre;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.goldtheatre.filter.BusFilter;

@Configuration
public class AppConfig implements WebMvcConfigurer {
	
	@Bean
	public BusFilter getFilter() {
		return new BusFilter();
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		registry.addInterceptor(getFilter()).addPathPatterns("/*");
	}

}
