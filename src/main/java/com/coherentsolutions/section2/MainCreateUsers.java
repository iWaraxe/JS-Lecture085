package com.coherentsolutions.section2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainCreateUsers {
    public static void main(String[] args) {
        List<User> users = IntStream.range(0,100)
                .mapToObj(i -> new User("User" + i))
                .collect(Collectors.toList());

        // Print the size to confirm 100 users were created
        System.out.println("Number of users created: " + users.size());
        // Optionally, print a few users to demonstrate
        users.stream()
                .limit(5)
                .forEach(System.out::println);
    }
}

