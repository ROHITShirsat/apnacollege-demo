package com.example.controller.practise;

import java.util.Arrays;
import java.util.List;
//5. Given a list of integers, find the total number of elements present in the list using Stream functions?
public class Five {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,5,5);
        long count=list.stream()
                .count();
        System.out.print(count);
    }
}
