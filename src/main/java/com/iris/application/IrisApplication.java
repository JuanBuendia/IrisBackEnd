package com.iris.application;

import java.util.Collections;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.iris")
@EntityScan("com.iris.entities")
@EnableJpaRepositories("com.iris.repositories")
public class IrisApplication {

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(IrisApplication.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "8085"));
         app.run(args);
    }
}