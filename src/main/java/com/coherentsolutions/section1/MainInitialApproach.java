package com.coherentsolutions.section1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainInitialApproach {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Alice"),
                new User("Bob"),
                new User("Charlie"));

        // Initial approach using map
        Stream<IntStream> intStreamStream = users.stream()
                .map(User::getUserName)
                .map(s -> s.chars()); // This results in Stream<IntStream>

        // Attempt to print each character stream
        intStreamStream.forEach(stream -> stream.forEach(System.out::print));
    }
}
