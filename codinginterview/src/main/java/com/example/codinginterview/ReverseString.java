package com.example.codinginterview;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverseString("Sam"));
    }
    public static String reverseString(String str){
        return new StringBuilder(str).reverse().toString();
    }
}
