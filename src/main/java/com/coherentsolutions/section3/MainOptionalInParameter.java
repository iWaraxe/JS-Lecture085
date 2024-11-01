package com.coherentsolutions.section3;

import java.util.Optional;

public class MainOptionalInParameter {

    public static void main(String[] args) {
        String userName = null;
        User user = createUser(Optional.ofNullable(userName));
        System.out.println(user);
    }

    // Discouraged use of Optional in parameters
    public static User createUser(Optional<String> userNameOpt) {
        String userName = userNameOpt.orElse("defaultUser");
        return new User(userName);
    }
}

