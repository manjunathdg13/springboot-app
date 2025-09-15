package com.mdg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    private int id;
    private String username;
    public User( ) {


    }
    public User(int id,String username) {
        this.id = id;
        this.username = username;

    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }
}
