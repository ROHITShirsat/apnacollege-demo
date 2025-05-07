package com.example.controller.practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Eleven {
    public static void main(String[] args) {
        List<String> list1=Arrays.asList("Rohit","Shirsat");
        List<String> list2=Arrays.asList("Roshni","Kritika");

        Stream<String> concatStream=Stream.concat(list1.stream(),list2.stream());
        concatStream.forEach(str->System.out.print(str+" "));




    }
}
