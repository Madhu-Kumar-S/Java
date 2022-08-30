package programs;

public class Alphabets {
    /** program to print alphabets from a-z */
    public static void main(String args[])
    {
        System.out.println("UpperCase");
        for(int i=0;i<26;i++)
        {
            System.out.println((i+65)+"="+(char)(i+65));
        }
        System.out.println("......................");
        System.out.println("LowerCase");
        for(int i=0;i<26;i++)
        {
            System.out.println((i+97)+"="+(char)(i+97));
        }

    }
}
