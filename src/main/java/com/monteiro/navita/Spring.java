package com.monteiro.navita;

import static org.springframework.boot.SpringApplication.run;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author vicente.monteiro
 */
@SpringBootApplication
@EnableWebSecurity
@EnableTransactionManagement
@ImportResource("classpath:applicationContext.xml")
public class Spring {

    public static void main(String[] args) {
        run(Spring.class, args);
    }
}
