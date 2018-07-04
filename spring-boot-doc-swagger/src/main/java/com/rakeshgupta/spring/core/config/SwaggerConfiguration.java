/**
 * 
 */
package com.rakeshgupta.spring.core.config;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Rakesh_Gupta
 *
 */

@EnableSwagger2
@Configuration
public class SwaggerConfiguration {

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.rakeshgupta.spring.core")).paths(regex("/rest.*"))
				.build().apiInfo(metaInfo());
	}

	private ApiInfo metaInfo() {

		ApiInfo apiInfo = new ApiInfo("Spring Boot Swagger Example API", " API documentation for users",
				"1.0", "Terms of Service",
				new Contact("Rakesh Gupta", "https://www.rakeshkumargupta.com", "rakeshgupta.contact@gmail.com"),
				"Apache License Version 2.0", "https://www.apache.org/licesen.html");

		return apiInfo;
	}
}