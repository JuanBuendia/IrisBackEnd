package com.iris.instituto;

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
public class InstitutoApplication {

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(InstitutoApplication.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "8085"));
         app.run(args);
    }
}