package programs;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.next();

        String rev = "";

        for(int i=0;i<s.length();i++)
        {
            rev = s.charAt(i) + rev;
        }

        System.out.println("Reversed string is: "+rev);

        if(s.equalsIgnoreCase(rev)) System.out.println(s+" is Palindrome");
        else System.out.println(s+" is not palindrom");

    }
}
