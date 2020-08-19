package com.qa.day8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class StreamsExercise3 {

    public static void main(String[] args) {
        List<Integer> List = Arrays.asList(3, 4, 7, 8, 12);
        IntStream.of(3, 4, 7, 8, 12).max().ifPresent(maxInt -> System.out.println("Max number in set is" + " " + maxInt));
        IntStream.of(3, 4, 7, 8, 12).min().ifPresent(minInt -> System.out.println("Min number in set is" + " " + minInt));
        Consumer<Integer> oddOrEven= i -> {
            if (i % 2 != 0) {
                System.out.println("Odd numbers only: " + i);
            } else {
                System.out.println("Even number only: " + i);
            }
        };
        System.out.println(List);
        System.out.println(oddOrEven);
    }

}
