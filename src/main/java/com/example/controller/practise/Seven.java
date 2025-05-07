package com.example.controller.practise;
//7. Given a String, find the first non-repeated character in it using Stream functions?
public class Seven {
    public static void main(String[] args) {
        String input="Rava Articles are awesome";
        Character result=input.chars().mapToObj(c->(char) c)
                .filter(ch->input.indexOf(ch)==input.lastIndexOf(ch))
                .findFirst().orElse(null);

        System.out.print(result);


    }




}
