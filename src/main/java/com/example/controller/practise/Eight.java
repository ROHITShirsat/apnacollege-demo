package com.example.controller.practise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//9. Given a list of integers, sort all the values present in it using Stream functions?
public class Eight {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(21,5,6,4,8,56);
        list.stream()
                .sorted()
                .forEach(System.out::println);




    }
}
