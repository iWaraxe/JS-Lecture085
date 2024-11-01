package com.coherentsolutions.section3;

import java.util.Optional;

public class MainSafeUserProduction {

    public static void main(String[] args) {


        /*
        User nonexistentUser = findUserOld("nonexistentUser");
        String userName = nonexistentUser.getUserName();
        System.out.println(userName);*/

        Optional<User> user = findUser("nonexistentUser");
        user.ifPresent(System.out::println);
    }

    public static User findUserOld(String userName) {
        // Simulate user lookup
        if ("existingUser".equals(userName)) {
            return new User(userName);
        } else {
            return null;
        }
    }

    public static Optional<User> findUser(String userName) {
        // Simulate user lookup
        if ("existingUser".equals(userName)) {
            return Optional.of(new User(userName));
        } else {
            return Optional.empty();
        }
    }
}
