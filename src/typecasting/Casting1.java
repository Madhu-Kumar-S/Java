package typecasting;

// primitive DT casting
public class Casting1 {
    public static void main(String[] args)
    {
        // implicit casting/widening
        char ch1 = 'a';
        int i = ch1;
        System.out.println(ch1);
        System.out.println(i);

        // expicit casting/narrowing
        char ch2 = (char) i;
        System.out.println(ch2);
    }
}
