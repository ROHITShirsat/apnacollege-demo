package com.example.controller.practise;

import java.util.Arrays;
import java.util.List;

//Given a list of integers, find out all the numbers starting with 1 using Stream functions?
public class Two {
    public static void main(String[] args) {

        List<Integer> list=Arrays.asList(10,1,2,5,4,17,11,13);
        list.stream()
                .map(m->m+"")
                .filter(s->s.startsWith("1"))
                .forEach(System.out::println);

    }
}
