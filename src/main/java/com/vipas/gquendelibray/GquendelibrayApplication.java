package com.vipas.gquendelibray;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@ComponentScan({"com.vipas.gquendelibray"})
//@EntityScan("com.vipas.gquendelibray.models")
//@EnableJpaRepositories("com.vipas.gquendelibray.repository")
@SpringBootApplication
public class GquendelibrayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GquendelibrayApplication.class, args);
    }

}