package org.example.entity;

public class User {

    private String username;
    private boolean authorized;

    public User(String username, boolean authorized) {
        this.username = username;
        this.authorized = authorized;
    }

    public String getUsername() {
        return username;
    }

    public boolean isAuthorized() {
        return authorized;
    }

}
