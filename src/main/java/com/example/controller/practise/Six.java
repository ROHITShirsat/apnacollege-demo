package com.example.controller.practise;

import java.util.Arrays;
import java.util.List;

//6. Given a list of integers, find the maximum value element present in it using Stream functions?
public class Six {
    public static void main(String[] args) {
       List<Integer> list= Arrays.asList(21,5,6,7,10,9,50);
       long max=list.stream()
               .max(Integer::compare)
               .get();

         System.out.print(max);


    }
}
