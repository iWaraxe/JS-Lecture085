package com.coherentsolutions.section2;

import java.util.Random;
import java.util.stream.IntStream;

public class MainEndlessStream {
    public static void main(String[] args) {
        IntStream endlessStream = IntStream.generate(() -> new Random().nextInt());

        // Example usage: Print 10 random numbers from the endless stream
        endlessStream
                .limit(10)
                .forEach(System.out::println);

        // Really infinite stream
        IntStream.generate(()-> new Random().nextInt())
                .filter(i -> i < 100 && i > 0)
                .forEach(System.out::println);
    }
}
