package com.multi.contactsapp;




import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

// output 파라미터로 Content Negotiation
@Configuration
@EnableWebMvc
public class WebMvcConfig extends WebMvcConfigurerAdapter {

	  @Override
	  public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
	    configurer
	      .favorPathExtension(true).favorParameter(true)
	      .ignoreAcceptHeader(true).parameterName("output")
	      .useJaf(false).defaultContentType(MediaType.APPLICATION_JSON);
	  }
	}
