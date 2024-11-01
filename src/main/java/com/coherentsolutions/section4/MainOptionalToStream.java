package com.coherentsolutions.section4;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class MainOptionalToStream {
    public static void main(String[] args) {
        Optional<User> optionalUser = Optional.of(new User("Alice"));

        Comparator
        Stream<User> userStream = optionalUser.stream();
        userStream.forEach(System.out::println); // Prints the user if present
    }
}
