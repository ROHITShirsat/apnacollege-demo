package com.example.controller.practise;

import java.util.Arrays;
import java.util.List;

//4. Given the list of integers, find the first element of the list using Stream functions?
public class Four {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,20,25,1,4);
        list.stream()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
