package com.example.codinginterview;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Lambda {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);

        list.forEach(i -> System.out.println("Int: " + i));

        Predicate<Integer> isGreaterThan0 = s -> s > 0;

        Predicate<Integer> lessThan20 = s -> s < 20;

        list.forEach(i -> System.out.println(isGreaterThan0.and(lessThan20).test(i)));

        list.forEach(i -> System.out.println(lessThan20.negate().toString()));

    }
}
