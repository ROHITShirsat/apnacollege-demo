package com.example.controller.practise;
//18. How to count each element/word from the String ArrayList in Java8?
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Fifteen {
    public static void main(String[] args) {
        List<String> names=Arrays.asList("AA","BB","CC","AA","BB");
        Map<String,Long> nameList=names.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.print(nameList);






    }
}
