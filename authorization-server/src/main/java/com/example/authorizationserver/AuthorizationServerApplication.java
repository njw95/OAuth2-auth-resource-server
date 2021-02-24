package com.example.authorizationserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@EnableAuthorizationServer
@SpringBootApplication
public class AuthorizationServerApplication implements CommandLineRunner {

    @Autowired
    AccountRepository accountRepository;

    public static void main(String[] args) {
        SpringApplication.run(AuthorizationServerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        accountRepository.deleteAll();
        accountRepository.save(new Account("TestAccount1", "123"));
        System.out.println("FOUND? " + accountRepository.findByUsername("TestAccount1"));
    }
}
