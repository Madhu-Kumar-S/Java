package strings;

public class StringComparision {
    public static void main(String[] args)
    {
        String s1 = "Hi";
        String s2 = "Hi";
        // s1 and s2 holds same memory location

        String s3 = new String("Hi");
        // when new keyword is used it always takes separate memory

        // == compares the references of string objects
        System.out.println(s1==s2);
        System.out.println(s1==s3);

        // .equals() compares the contents
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}
