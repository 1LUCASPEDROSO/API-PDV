package com.API.PDV.Entity;

import jakarta.persistence.*;


@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 100, nullable = false)
    private String name;
    private boolean isEnabled;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public User(String name, boolean isEnabled) {
        this.name = name;
        this.isEnabled = isEnabled;
    }

    public User() { // construtor vazio para instanciar e recuperar objetos do banco
    }
}
