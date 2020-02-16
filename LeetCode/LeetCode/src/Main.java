import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] ints = {1,6,8,5,9,4,7,2};
        System.out.println(summation(ints));

        int[] ints2 = {1,2,3};
        System.out.println(permute(ints2));
    }
    private static List<Integer> summation(int[] arr){
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(arr[0]);
        int i = 1;
        while(i<arr.length-1){
            boolean skip2 = true;
            if(skip2==true){
                intList.add(arr[i]+arr[i+1]);
                skip2 = false;
                i += 2;
            }
            if ((i+2)>arr.length-1){
                if((i+1)>arr.length-1){
                    return intList;
                }
                intList.add(arr[i] + arr[i+1]);
                return intList;
            }
            intList.add(arr[i] + arr[i+1] + arr[i+2]);
            i+=3;
        }

        return intList;
    }

    //depth first search
    private static List<List<Integer>> permute(int[] arr){
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        List<Integer> permutation = new ArrayList<Integer>();

        //gets first permutation
//        for(int i = 0; i<arr.length-1;i++){
////            permutation = new ArrayList<>();
//            permutation.add(arr[i]);
//        }
//        //123
//        answer.add(permutation);
        //next permutation
        permutation = new ArrayList<Integer>();

        for(int i=0; i<arr.length-1;i++){
            permutation.add(arr[i]);
            for(int j=1;j<arr.length;j++){
//                if(permutation.contains(arr[j])){
//                    permutation.add(arr[j-1]);
//                }
                permutation.add(arr[j]);
            }
            answer.add(permutation);
        }

        //return a list of lists
        return answer;
    }


}
