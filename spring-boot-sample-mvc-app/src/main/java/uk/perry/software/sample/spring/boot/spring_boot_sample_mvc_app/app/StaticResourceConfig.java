package uk.perry.software.sample.spring.boot.spring_boot_sample_mvc_app.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
@ComponentScan
public class StaticResourceConfig implements WebMvcConfigurer {
	
	private static final String[] CLASSPATH_RESOURCE_LOCATION = { "classpath:/static/" };
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**").addResourceLocations(CLASSPATH_RESOURCE_LOCATION);
	}
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addRedirectViewController("/", "/index.html");
		registry.addRedirectViewController("/index", "/index.html");
	}
	
}
