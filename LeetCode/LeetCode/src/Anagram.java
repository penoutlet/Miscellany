import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Anagram {
    public static void main(String[] args) {
        String name = "asdff";

        System.out.println(buildCharMap(name));
        System.out.println(isAnagram("sam","mas"));

        System.out.println(isAnagram("elyse","elsa"));
        System.out.println(isAnagram("carol","raolc"));
    }

    public static boolean isAnagram(String stringA, String stringB){
        Map<Character, Integer> mapA = buildCharMap(stringA);
        Map<Character, Integer> mapB = buildCharMap(stringB);
        AtomicInteger count = new AtomicInteger();
        mapA.forEach((k,v)->{
            mapB.forEach((k1,v1)->{
                if (k.equals(k1) && v.equals(v1)) {
                    System.out.println("K, k1: " + k + k1);
                    count.getAndIncrement();
                }
            });
        });

        if (count.intValue()==(mapA.keySet().size())) {

            return true;
        }
        return false;
    }

    public static Set<Character> buildCharSet(String string) {
        Set<Character> uniqueChars = new HashSet<Character>();
        Map<Character, Integer> charMap = new HashMap();
        for (Character c : string.toCharArray()) {
            uniqueChars.add(c);
        }
        return uniqueChars;
    }

    public static List<Integer> countChars(Set<Character> chars, String str){
        List<Integer> numChars = new ArrayList<>();

        for(Character c: chars){
            Integer count = 0;
            for(int i = 0; i<str.length(); i++){
                if(c.equals(str.charAt(i))){
                    count ++;
                }
            }
            numChars.add(count);
        }
        return numChars;
    }

    public static Map<Character, Integer> buildCharMap(String str){
        Set<Character> charSet = buildCharSet(str);
        List<Integer> countList = countChars(charSet, str);
        Map<Character, Integer> charMap = new HashMap<>();

        Iterator<Character> iter = charSet.iterator();
        while(iter.hasNext()){
            for(Integer i: countList){
                charMap.put(iter.next(), i);
            }
        }

        return charMap;
    }
}
