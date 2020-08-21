package com.qa.day8;

import java.util.Arrays;
import java.util.List;

public class StreamsExercise {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Michael", "Dean", "James", "Chris");
        names
                .forEach(x -> System.out.println("Hello" + " " + x));

    }
}
