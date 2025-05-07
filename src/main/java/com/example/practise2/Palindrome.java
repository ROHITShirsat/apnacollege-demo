package com.example.practise2;

public class Palindrome {
    public static void main(String[] args) {
        String str="madam";
        StringBuilder reversed=new StringBuilder(str).reverse();
        System.out.print(reversed);
        System.out.print(str.equalsIgnoreCase(reversed.toString()));

    }
}
