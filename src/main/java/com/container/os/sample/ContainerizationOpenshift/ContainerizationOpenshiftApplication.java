package com.container.os.sample.ContainerizationOpenshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication(scanBasePackages = {"com.container.os.sample.ContainerizationOpenshift.controller"})
public class ContainerizationOpenshiftApplication extends SpringBootServletInitializer {

	private static final Class<?>[] SOURCES = {
			ContainerizationOpenshiftApplication.class,
	};

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SOURCES);
	}
	public static void main(String[] args) {
		SpringApplication.run(ContainerizationOpenshiftApplication.class, args);
	}

}
