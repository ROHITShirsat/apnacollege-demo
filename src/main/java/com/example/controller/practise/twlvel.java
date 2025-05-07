package com.example.controller.practise;

import java.util.Arrays;
import java.util.List;

//14. Java 8 program to perform cube on list elements and filter numbers greater than 50
public class twlvel {
    public static void main(String[] args) {
      List<Integer> list= Arrays.asList(1,2,3,4);
      list.stream()
              .map(i->i*i*i)
              .filter(i->i>1)
              .forEach(System.out::println);




    }
}
