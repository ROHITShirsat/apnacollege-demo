package com.example.controller.practise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Nine {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(8,54,60,77,5);
        list.stream()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);
    }
}
