package com.coherentsolutions.section3;

public class MainOptionalNotInParameter {

    public static void main(String[] args) {
        String userName = null;
        // Directly handle potential null values at the call site
        User user = createUser(userName != null ? userName : "defaultUser");
        System.out.println(user);
    }

    // Accept a plain String parameter, avoiding Optional
    public static User createUser(String userName) {
        // validation, verification
        return new User(userName);
    }
}
