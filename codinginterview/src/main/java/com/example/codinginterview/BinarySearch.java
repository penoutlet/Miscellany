package com.example.codinginterview;

import java.util.Arrays;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,210,301,1111};
//        System.out.println(binarySearch(arr,3));

//        System.out.println(binarySearch(arr, 0, arr.length, 1111111));
        List<Integer> list = Arrays.asList(1,2,2,3,4,5,210,301);
        System.out.println(searchFirstOfK(list,2));
        System.out.println(firstIndexLargerThanK(list, 210));

        System.out.println(binarySearchRecursivePractice(arr, 0, arr.length, 1111));
    }



    public static int binarySearchRecursivePractice(int[] arr, int left, int right, int target){
        if(right>=left){
            int mid = left + (right - left)/2;
            if(target < arr[mid]){
                binarySearchRecursivePractice(arr, 0, mid -1, target);
            }
            else if ( target > arr[mid]){
                return binarySearchRecursivePractice(arr, mid + 1, arr.length-1, target);
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    // returns index of target value
    public static int binarySearchRecursive(int[] array, int left, int right, int target){


        if(right >= left){ // check for valid input
            int mid = left + (right - left)/2; // find midpoint index
            if(mid > array.length-1) return -1;
            System.out.println("Mid: " + mid);
            if(array[mid]==target){ // if we've found target, return its index.
                return mid;
            }
            // if the target is greater than the value at mid, then recur on the right side of the array.

            if(array[mid]< target){
               return binarySearchRecursive(array, mid+1, array.length, target);
            }

            // if it's smaller, recur on the left side of the array.
            if(array[mid] > target){
                return binarySearchRecursive(array, 0, mid-1, target);
            }
        }

        return -1;
    }


    public static int searchFirstOfK(List<Integer> list, int k){
        int left = 0, right = list.size() - 1, result = 1;

        while( left <= right){
            // if right is 7 and left is 4
            // 4 + (7-4)/2
            // (7-4)/2 = 1
            // 4 + 1 = 5
            // 5 is the new midpoint of the right half.
            int mid = left + ((right - left)/2);
            // if vale at mid > k, search the left half of list
            if (list.get(mid) > k) {
                right = mid - 1;
            }
            // if the value at mid equals k, then update result
            // and then search the left half
            else if(list.get(mid)==k){
                //compare to result
                result = mid;
                right = mid -1;
            } else {
                // else, search the right half.
                left = mid + 1;
            }
        }
        return result;
    }

    public static int firstIndexLargerThanK(List<Integer> list, int k){
        int left = 0, right = list.size()-1, result = -1;

        while (left <= right) {
            int mid = left + ((right-left)/2);
            if(list.get(mid) > k){
                result=mid; // result stores the index of values larger than k.
                right = mid -1; // search the left half.
            }
            else if(list.get(mid)<=k){
                left = mid +1;
            }
        }

        return result;
    }
}
