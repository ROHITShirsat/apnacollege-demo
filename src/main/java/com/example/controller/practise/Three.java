package com.example.controller.practise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//3. How to find duplicate elements in a given integers list in java using Stream functions?
public class Three {
    public static void main(String[] args) {
       List<Integer> list=Arrays.asList(1,2,5,4,2,1,4);
       Set<Integer> set=new HashSet<>();
       list.stream()
               .filter(m->!set.add(m))
               .forEach(System.out::println);



    }
}
