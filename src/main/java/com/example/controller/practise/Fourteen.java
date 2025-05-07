package com.example.controller.practise;
//16. How to use map to convert object into Uppercase in Java 8?

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Fourteen {
    public static void main(String[] args) {
       List<String> names=Arrays.asList("rohit","kritika","roshni");
      List<String> namesList= names.stream()
               .map(String::toUpperCase)
               .collect(Collectors.toList());
         System.out.print(namesList);




    }
}
