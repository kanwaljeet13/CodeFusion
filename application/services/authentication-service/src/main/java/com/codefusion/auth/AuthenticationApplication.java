package com.codefusion.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.codefusion.auth", "com.codefusion.exceptions", "com.codefusion.security"})
@EntityScan(basePackages= {"com.codefusion"})
@EnableJpaRepositories("com.codefusion")
public class AuthenticationApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthenticationApplication.class, args);
    }

}
