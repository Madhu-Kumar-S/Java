package strings;

public class String_Buffer {
    public static void main(String[] args)
    {
        StringBuffer sb1 = new StringBuffer("hello");
        System.out.println(sb1);

        StringBuffer sb2 = new StringBuffer(50); // default capacity 16 chars
        // StringBuffer methods
        sb2.append("Welcome to Java"); // adds string at end
        System.out.println(sb2);

        sb2.insert(0,"Hello ");
        System.out.println(sb2);       // adds string at given position
        sb2.insert(sb2.length()," programming");
        System.out.println(sb2);

        sb2.delete(0,6); // deletes chars from i to n-1 pos
        System.out.println(sb2);

        System.out.println(sb2.length()); // returns length of string

        StringBuffer sb3 = new StringBuffer("This is a book");
        System.out.println(sb3.indexOf("is"));
        System.out.println(sb3.lastIndexOf("is"));

        sb3.replace(8,9,"the"); // start - end - string to replace
        System.out.println(sb3);

        System.out.println(sb3.substring(12)); // start
        System.out.println(sb3.substring(0,4)); // start - end

        System.out.println(sb3.toString()); // converts to string
        System.out.println(sb3.reverse().toString()); // reverses the string

    }
}
