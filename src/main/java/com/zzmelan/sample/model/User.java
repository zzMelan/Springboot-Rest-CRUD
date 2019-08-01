package com.zzmelan.sample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Melan Pangan
 */

@Entity
@Table(name = "users")
public class User {

    // Attributes

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "email")
    private String email;

    @Column(name = "username")
    private String username;

    // Getter and Setter
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Construtor

    public User() {
    }

    public User(String email, String username) {
        this.email = email;
        this.username = username;
    }

    // To String method

    @Override
    public String toString() {
        return "User [email=" + email + ", id=" + id + ", username=" + username + "]";
    }

}