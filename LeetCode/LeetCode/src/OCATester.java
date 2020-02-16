public class OCATester {

    public static void main(String[] args) {
        String s = "hi";
        String t = new String(s);
        System.out.println("hi".equals(s)); //true
        System.out.println(t == s); // false, refer to 2 different objects
        System.out.println(t.equals(s)); // true, contents are the same.
        System.out.println("hi" == s); // true, s uses the string pool normally
        System.out.println("hi" == t); // false, t is not reusing the literal "hi" bc of the new keyword.

        String p = "purr";
        String[] str[] = new String[2][];
        p+=false;

        int val = 3;
        square(val);
        System.out.println(val);
    }

    public static long square(int x){
        long y = x * (long) x;
        x = -1;
        return y;
    }
}
