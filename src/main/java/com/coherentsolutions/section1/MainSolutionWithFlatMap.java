package com.coherentsolutions.section1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MainSolutionWithFlatMap {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Alice"),
                new User("Bob"),
                new User("Charlie"));

        // Solution using flatMap to achieve a single stream of characters
        Stream<Character> characterStream = users.stream()
                .flatMap(user -> user.getUserName().chars().mapToObj(c -> (char) c));

        // Printing each character
        characterStream.forEach(System.out::print);
    }
}
