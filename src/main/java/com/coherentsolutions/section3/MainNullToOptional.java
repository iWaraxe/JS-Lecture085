package com.coherentsolutions.section3;

import java.util.Optional;

public class MainNullToOptional {

    public static void main(String[] args) {
        User user = null; // This user might come from a method that can return null
        Optional<User> optionalUser = Optional.ofNullable(user);
        optionalUser.ifPresentOrElse(System.out::println, () -> System.out.println("User not found"));
    }
}

