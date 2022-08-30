package strings;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args)
    {
        String s1 = "String Class";
        String s2 = "Methods in Java";

        // joining strings
        System.out.println(s1.concat(s2)); // using concat method
        System.out.println(s1+" "+s2); // using + operator
        System.out.println("--------------");

        // finding length
        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println("--------------");

        // extracting character at given index
        System.out.println(s1.charAt(0));
        System.out.println(s2.charAt(11));
        System.out.println("--------------");

        System.out.println(s1.compareTo(s2));
        // if s1 > s2 returns +ve num
        System.out.println("hi".compareTo("hi"));
        // if s1 s2 are equal returns 0
        System.out.println("Hi".compareTo(s2));
        // if s1 < s2 returns -ve num
        System.out.println(s1.compareToIgnoreCase(s2));
        // same but ignores case
        System.out.println("--------------");

        // compares 2 strings and returns boolean value
        System.out.println(s1.equals(s2));
        System.out.println("hi".equals("hi"));
        System.out.println("Hi".equalsIgnoreCase("hi"));
        System.out.println("--------------");

        // returns boolean val
        System.out.println(s1.startsWith("S"));
        System.out.println(s2.endsWith("J"));
        System.out.println("--------------");

        // finding substring
        String s3 = "This is a book";
        String s4 = new String(s3);
        System.out.println(s3.indexOf("is"));
        System.out.println(s3.lastIndexOf("is"));
        System.out.println("--------------");

        // replacing words
        System.out.println(s3.replace("a","the"));
        System.out.println("--------------");

        // extracting substring
        System.out.println(s3.substring(10));
        System.out.println(s3.substring(0,4)); // returns characters from i to n-1 position
        System.out.println("--------------");

        // converting to lower and upper case
        System.out.println(s1.toUpperCase(Locale.ROOT));
        System.out.println(s1.toLowerCase(Locale.ROOT));
        System.out.println("--------------");

        // removing blank spaces around string
        System.out.println(s1.trim());
        System.out.println("--------------");


    }
}
