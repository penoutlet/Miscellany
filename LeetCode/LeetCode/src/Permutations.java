//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//public class Permutations {
//   static int x = 0;
//    public static void main(String[] args) {
//
//        Permutations p = new Permutations();
//        p.meDoNuthing(p.x);
//        System.out.println(x);
//
//
//
//        nextPermutation(new int[] {1,2,3});
//        List<Integer> perms = new ArrayList<Integer>();
//        perms.add(1);
//        perms.add(2);
//        perms.add(3);
////        permute(perms,0);
//
//        Collections.swap(perms, 0, 1);
//        System.out.println(perms);
//    }
//
//    static void meDoNuthing(int x){
//        x +=1;
//
//    }
//
//    static void permuteMe(List<Integer> array, int k){
//        for( int i = k; i < array.size(); i++){
//            Collections.swap(array, i, k);
//            permute(array, k+1);
//            Collections.swap(array, k, i);
//        }
//
//        if (k == array.size()) {
//            System.out.println(array);
//        }
//    }
//
//    static List<List<Integer>> permuteList(int[] arr, int k){
//        List<List<Integer>> returnMe = new ArrayList<List<Integer>>();
//        List<int[]> perm =Arrays.asList(arr);
//
//        for(int i = k; i < arr.length; i+){
//            Collections.swap(perm, i, k);
//            permute(perm, k + 1);
//        }
//    }
//
//        static void permute(java.util.List<Integer> arr, int k){
//            for(int i = k; i < arr.size(); i++){
//                java.util.Collections.swap(arr, i, k);
//                permute(arr, k+1);
//                java.util.Collections.swap(arr, k, i);
//            }
//            if (k == arr.size() -1){
//                System.out.println(java.util.Arrays.toString(arr.toArray()));
//            }
//        }
//
////    class Solution {
//        public static void nextPermutation(int[] nums) {
//            int i = nums.length - 2;
//            // while i is >= 0, and the num at i is greater or equal to the one to its right
//            // decrement i
//            // i will eventually equal to -1
//            while(i >= 0 && nums[i] >= nums[i+1])i--; // continues as long as array is in descending order when
//            // traversed back to front
//
//            // when it is -1, traverse the entire array
//            // from front to back and back to front simultaneously
//            // swap each x index with each y index value as long as x is < y
//            if(i == -1){ //if i is -1
//                for(int x = 0, y = nums.length - 1; x < y; x++, y--){ // while x is less th y, incre x and decre y
//                    // swap num at index x with num at index y
//                    int temp  = nums[x];
//                    nums[x] = nums[y];
//                    nums[y] = temp;
//                }
//            }else{ // if i isn't -1 yet, traverse backwards from end of array until j is equal to i
//                for(int j = nums.length - 1; j > i; j--){
//                    if(nums[j] > nums[i]){ // if num J is greater than I, swap them and break
//                        int temp = nums[j];
//                        nums[j] = nums[i];
//                        nums[i] = temp;
//                        break;
//                    }
//                }
//
//                // k is = i, l is last index,
//                // as long as l is greater than k, increment k and decrement l
//                // swap num K and num L
//                for(int k = i + 1, l = nums.length - 1; l > k; k++, l--){
//                    int temp  = nums[k];
//                    nums[k] = nums[l];
//                    nums[l] = temp;
//                }
//            }
//        }
//
////        static void permuteArray(int[] arr, int k){
////        List<Integer> list = convertToList(arr);
////        for(int i = k; i < arr.length; i++){
////            Collections.swap(list, 1,k);
////            permuteArray(list.toArray(),k+1);
////        }
////        }
//
////    public static List<List<Integer>> permute(int[] arr) {
////        List<List<Integer>> allPerms = new ArrayList<List<Integer>>();
////        int n;
////        List<Integer> perm = new ArrayList<>();
////
////        if(n==1){
////            perm = convertToList(arr);
////        } else {
////            for (int i = 0; i < n-1; i++){
////                permute()
////            }
////        }
////    }
//
//    public static List<Integer> convertToList(int [] arr){
//        List<Integer> perm = new ArrayList<>();
//        int i =0 ;
//        while(i<arr.length){
//            perm.add(arr[i]);
//        }
//        return perm;
//    }
//}
