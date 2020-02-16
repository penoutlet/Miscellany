package com.example.codinginterview;

import java.util.HashMap;
import java.util.Map;

public class GetNthFib {
    public static void main(String[] args) {
        System.out.println(getNthFib(8, new HashMap<>()));
        System.out.println(getNthFibIterative(7));
    }
    // HashMap's are great tools for many interview questions.
    // THey offer constant time lookups like arrays and arraylists
    // many useful methods, too.
    public static int getNthFib(int n, HashMap<Integer, Integer> memoize) {
        memoize.putIfAbsent(1,0);
        memoize.putIfAbsent(2,1);
        if (!memoize.containsKey(n)) {
            int nthFib = getNthFib(n - 1, memoize) + getNthFib(n - 2, memoize);
            memoize.put(n, nthFib);

        }
        return memoize.get(n);
    }

    public static int getNthFibIterative(int n){
        if(n <= 1){
            return 1;
        }
        int fib = 1;
        int prevFib = 1;

        for(int i=2; i<n; i++){
            int temp = fib; // temp is 1 temp is 2; 3 ; 5; 8; 13
            fib+=prevFib; // 1 += 1 = 2; 1 += 2 = 3; 3 += 3 = 5; 5 += 3 = 8; 13; 21;
            prevFib=temp; // prevFib is 1; prevFib is 2; prevFib = 3; 5; 8; 13
        }
        return fib;
    }
}
