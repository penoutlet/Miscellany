package com.example.codinginterview.sorting;

public class InsertionSort {

    //two pointers, i and j
    // while value j is >= value i, continue to increment j
    // when value j is less than value i, insert it at index i
    // push all items one index to the right
    // or
    // two pointers i and j
    // while val j >= val i,  j
    // when

    public static void main(String[] args) {
        int[] arr = {1,4,1,2,5,6,3,10};
//        System.out.println(insertionSort(arr));
//        insertionSort(arr);
        selectionSort(arr);
        for(int i : arr){
            System.out.println("I: " + i);
        }

        Girlfriend elyse = (String greeting) -> System.out.println(greeting);
        elyse.wakesUp("Good morning!");
    }
   static void insertionSort(int arr[]){
        int i, key, j;
        int n = arr.length;
        for (i=1; i < n; i++){ // moving from ind 1 to end of array...
            key = arr[i]; // set item to key
            j = i - 1; // set j equal to previous index

            while (j >= 0 && arr[j] > key){ // iterate over all previous values (those before index i) while arr[j]
                arr[j+1] = arr[j]; // set item j + 1 to item at j.. shift over all values
                j = j - 1; // decrement j

            }
            arr[j + 1] = key; //
        }
    }

    static void selectionSort(int arr[]){
        // find the smallest item and move it to the front.
        // create a temp var for storing the smallest and update it when appropriate.
        // sort it one item at a time.
        // find smallest value with j, then assign it to arr[i] and increment i
        // assign value at i to index j.

        int i = 0;


        while (i < arr.length){
            int currentSmallestValueIndex = i;
        for(int j = i + 1; j < arr.length; j++){
            if(arr[j] < arr[currentSmallestValueIndex]) {
                currentSmallestValueIndex = j;
            }
        }

        // swap
        int temp = arr[i];
        arr[i] = arr[currentSmallestValueIndex];
        arr[currentSmallestValueIndex] = temp;
        i++;

        }

    }


}
