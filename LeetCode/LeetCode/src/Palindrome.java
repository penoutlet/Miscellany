public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("succcess"));

        System.out.println(isPalindrome2("racecar"));
        System.out.println(isPalindrome2("succcess"));
        System.out.println(isIntPalindrome(24));
        System.out.println(isIntPalindrome(403029));
    }

    static boolean isPalindrome(String word){
        String rev="";
        for(int i=word.length()-1; i>=0;i--){
            rev+=word.charAt(i);
        }
        if(rev.equals(word)) return true;
        return false;
    }

    static boolean isPalindrome2(String word){
        for(int i=word.length()-1; i>=0;i--){
            for(int j=0;j<word.length();j++){
                if(word.charAt(i)==word.charAt(j)) {
                    continue;
                }
                else {
                    return false;
                }
            }
        }
            return true;
    }

    public static int isIntPalindrome(int x){
        int newNum = 0;
        //reverse the number
        if(x<10 && x>0){
            return x;
        }
        else {
            if((x%10)!=0){
                newNum = (x%10)*10;//50
//                int newNum = x/10;
               return newNum + isIntPalindrome(x/10);
            }
        }
        return 1;
        //compare it to itself
    }
}
