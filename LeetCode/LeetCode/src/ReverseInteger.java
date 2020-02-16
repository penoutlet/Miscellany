public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(120));
        System.out.println(reverse(1));
//        System.out.println(reverse(9646324351));
        System.out.println(reverse(1534236469));
    }
//    static int reverse(int x) { // if x = 123...
//        Integer digit1;
//        Integer digit2;
//        String intStr = "";
//        boolean isNeg = false;
//        if (x < 0) {
//            isNeg = true;
//
//            x *= -1;
//        }
//        if((x %10)==0){
//            x /= 10;
//            digit1 = x % 10;  // digit1 = 0
//            digit2 = ((x - digit1)/10) % 10; // digit2 = 2
//            intStr =  Integer.toString(digit1) + digit2;
//        }
//        else if ((x%10)!=0){
//            digit1 = x % 10;  // digit1 = 0
//            digit2 = ((x - digit1)/10) % 10; // digit2 = 2
//            Integer digit3 = (x - (digit2 * 10 + 3))/10/10;
//            intStr =  Integer.toString(digit1) + digit2 + digit3;
//        }
//
//
//        int reversed = Integer.parseInt(intStr);
//        if(isNeg==true){
//            reversed *= -1;
//        }
//
//        return       reversed;
//    }

    static int reverse(int x) { // if x = 123...
        Integer digit1;
        Integer digit2;
        String rev = "";
        boolean isNeg = false;
        if (x < 0) {
            isNeg = true;

            x *= -1;
        }
        String intToStr = String.valueOf(x);

        int lastIndex = intToStr.length()-1;
        for(int i = lastIndex; i>=0;i--){

            rev += intToStr.charAt(i);
        }

//        System.out.println(rev);
        Long checkMe = Long.parseLong(rev);
        if(checkMe>Integer.MAX_VALUE || checkMe<Integer.MIN_VALUE) return 0;
        else {

        if(isNeg==true){
            return Integer.parseInt(rev)  * -1;
        }
        return Integer.parseInt(rev);
        }
    }

}
