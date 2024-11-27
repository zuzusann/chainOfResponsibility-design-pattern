package org.example.entity;

public class Request {

    private String data;
    private User user;

    public Request(String data, User user) {
        this.data = data;
        this.user = user;
    }

    public String getData() {
        return data;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Request [data=" + data + ", user=" + user.getUsername() + "]";
    }
}
