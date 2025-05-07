package com.example.controller.practise;
//Given a list of integers, find out all the even numbers that exist in the list using Stream functions?

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practise {
    public static void main(String args[]){

      List<Integer> list=Arrays.asList(2,4,6,9,7,10,4);
      list.stream()
              .filter(n->n%2==0)
              .forEach(System.out::println);




    }
}
