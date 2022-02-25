package com.SampleBuildJob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class SampleBuildJobApplication extends SpringBootServletInitializer  {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	return application.sources(SampleBuildJobApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(SampleBuildJobApplication.class, args);
	}

}
