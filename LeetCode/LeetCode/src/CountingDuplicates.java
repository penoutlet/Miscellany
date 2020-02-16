public class CountingDuplicates {

    public static void main(String[] args) {
//        duplicateCount("aaa");

        System.out.println(firstUnique("aapaa"));
        System.out.println(firstUnique("apaa"));

    }

    public static int duplicateCount(String text) {
        // Write your code here
//        char[] chars = new char[text.length()-1];
        int[] charCount = new int[10];
        char[] unique = new char[10];
        for(int i = 0; i<text.length(); i++){
            //count the num of letters appearing more than once.
            System.out.println(text.charAt(i));
//            charCount[i]++;
//            System.out.println(chars[i][0]);

            charCount[i]++;

            unique[i] = text.charAt(i);

        }
        printArray(charCount);
        return 1;
    }

    public static void printArray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static char firstUnique(String str){
        int i = 0;
        char current = str.charAt(i);
        char next = str.charAt(i+1);
        char previous;
        for(; i<str.length();i++) {
            if (i==0) {
              if(next!=current) {
                  return current;
              }
              continue;
            }
            else if(i==str.length()-1){
                if(current != str.charAt(i-1)){
                    return current;
                }
                continue;
            }

            else {
                if (current != str.charAt(i-1) && current != next) {
                    return current;
            }
                else {
                    continue;
                }
            }
        }
        return 'n';
    }
}
