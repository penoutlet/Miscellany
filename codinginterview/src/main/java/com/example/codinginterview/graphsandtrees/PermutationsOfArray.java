package com.example.codinginterview.graphsandtrees;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PermutationsOfArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

//        Integer[] ints = list.toArray();
        int[] arr = {1,3,2,5,6};
//        heapAlgorithm(arr,arr.length, arr.length);
//        System.out.println(list);
        PermutationsOfArray permutationsOfArray = new PermutationsOfArray();

        System.out.println(permutationsOfArray.permute(arr));
//        Collections.shuffle(list);


//        System.out.println(list);

//        System.out.println(allPermutations(list));
        // if list is not in the big list, then add it.
        // if it is, then skip it.
        // continue this as long as ... we have not reached the maximum number of permutations possible.

        Collections.swap(list, 1 , 2);
//        Collections.swap(list, );
        System.out.println(list);

    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> allPerms = new ArrayList<List<Integer>>();

        allPerms.add(new ArrayList<>());

        for (int i = 0; i < nums.length; i++) {
            List<List<Integer>> current = new ArrayList<List<Integer>>();

            for (List<Integer> l :allPerms){
                for (int j = 0; j < l.size() + 1; j++) {
                    l.add(j, nums[i]); // add nums[i] to index j of the list

                    List<Integer> tempList = new ArrayList<>(l); // create new arraylist with this permutation
                    current.add(tempList); // add the perm to the current version of our result list

                    l.remove(j); // remove the item you placed at index j.

                }
            }

            allPerms = new ArrayList<List<Integer>>(current);
        }
        return allPerms;
    }
    public static void heapAlgorithm(int[] a, int size, int n) {

        if(size==1){
            printArr(a, n);
        }
        for (int i = 0; i < size; i++) {
            // for the size of the input, repeatedly call heapAlgorithm.

            heapAlgorithm(a, size - 1, n);

            // if size is odd, swap the first element with the last.
            if (size % 2 == 1) {
                int temp = a[0];
                a[0] = a[size - 1];
                a[size-1] = temp;
            }
            // if size is even, swap current ith element with the ending element.
            else {
                int temp = a[i];
                a[i] = a[size - 1];
                a[size-1] = temp;
            }
        }

    }

    private static void printArr(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

    }

    public static List<List<Integer>> allPermutations(List<Integer> inputList) {
        List<List<Integer>> allPerms = new ArrayList<>();
        allPerms.add(inputList);


        List<Integer> newList = new ArrayList<>();
        newList.addAll(inputList);
        int i = 0;
        boolean contains = false;
        while(i < 100){
//            newList = new ArrayList<>();
//            newList.addAll(inputList);
//            Collections.swap();
            Collections.shuffle(newList);
        for (List l : allPerms) {
            if(l.equals(newList)){
                System.out.println("List contains this." + newList);
                contains = true;
                break;
            }
        }
        i++;
            if (contains == false) {
                allPerms.add(newList);
            }
            else {
                continue;
            }


        }

        return allPerms;
    }
}
