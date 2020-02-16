import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.*;

public class PermutationsOfString {

    public static void main(String[] args) {
        System.out.println(permuteString("elyse"));
    }

    public static List<List<Character>> permuteString(String str){
        List<List<Character>> answer = new ArrayList<>();

        List<Character> permutation = new ArrayList<>();

        for (int i=0;i<str.length();i++){
            permutation.add(str.charAt(i));
        }
        answer.add(permutation);
        swap(permutation, 1, 2);
        answer.add(1,permutation);
        return answer;
    }
}
