import java.util.*;

public class RomanNumeralConverter {
    private static Integer answer =0;

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("IX"));

    }

        public static int romanToInt(String s) {
        answer = 0;
            Map<Character, Integer> numerals = new HashMap<>();
            numerals.put('I', 1);
            numerals.put('V', 5);
            numerals.put('X', 10);
            numerals.put('L', 50);
            numerals.put('C', 100);
            numerals.put('D', 500);
            numerals.put('M', 1000);

            char[] charArray = s.toCharArray();

            Character[] keys = numerals.keySet().toArray(new Character[numerals.keySet().size()]);



            for(int i = 0; i<s.length();i++){
                if(i != s.length()-1 && numerals.get(s.charAt(i)) < numerals.get(s.charAt(i+1))){
                    answer -= numerals.get(s.charAt(i));
                }
                else {
                    answer += numerals.get(s.charAt(i));
                }
            }
            return answer;

        }

        public int sum(int x, int y){
            return x + y;
        }
    }
