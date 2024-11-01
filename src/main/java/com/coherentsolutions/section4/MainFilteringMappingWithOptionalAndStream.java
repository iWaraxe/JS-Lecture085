package com.coherentsolutions.section4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MainFilteringMappingWithOptionalAndStream {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Alice"),
                new User(null),
                new User("Bob"));

        // Filtering non-null usernames and converting them to uppercase
        List<String> userNames = users.stream()
                .map(user -> Optional.ofNullable(user.getUserName()))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        userNames.forEach(System.out::println); // Prints uppercase usernames, excluding nulls

        // Filtering non-null usernames and converting them to uppercase
        List<String> userNamesNulls = users.stream()
                .map(User::getUserName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());


        userNamesNulls.forEach(System.out::println); // Attempt to print with null included
    }
}
