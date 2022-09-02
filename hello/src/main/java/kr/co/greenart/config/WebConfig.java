package kr.co.greenart.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//servlet-context xml 자바화
@Configuration
@EnableWebMvc
@ComponentScan("kr.co.greenart")
public class WebConfig implements WebMvcConfigurer{

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		//css, 그림파일등 관리하는?
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
		
	}

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		//view를찾기위한
		registry.jsp("/WEB-INF/views/",".jsp");
		
	}

}
