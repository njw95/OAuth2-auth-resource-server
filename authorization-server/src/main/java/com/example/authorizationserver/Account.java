package com.example.authorizationserver;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Account {

    @Id
    @GeneratedValue
    private Integer id;

    private String username;

    private String password;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Account() {

    }
}
