package gilded.rose.inventory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

@Configuration
public class AppConfiguration {

	@Bean
	public ObjectMapper getMapper() {

	    ObjectMapper objectMapper = new ObjectMapper();
	    objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
	    return objectMapper;
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/items/add").allowedOrigins("http://localhost:3000");
				registry.addMapping("/items/update").allowedOrigins("http://localhost:3000");
			}
		};
	}
}
