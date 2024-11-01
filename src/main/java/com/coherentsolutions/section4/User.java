package com.coherentsolutions.section4;

public class User {
    private String userName;

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "User{userName='" + userName + "'}";
    }
}
