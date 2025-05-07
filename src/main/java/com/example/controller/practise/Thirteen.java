package com.example.controller.practise;

import java.util.Arrays;

//15. Write a Java 8 program to sort an array and then convert the sorted array into Stream?
public class Thirteen {
    public static void main(String[] args) {
      int arr[]={13,14,15,5,6,8,7,12};
      Arrays.parallelSort(arr);
      Arrays.stream(arr).forEach(n->System.out.print(n+" "));

    }


}
