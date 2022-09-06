package programs;

import java.util.Scanner;

public class FindingOccurances {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();

        System.out.println("Enter a character: ");
        char c = sc.next().charAt(0);

        int count = 0;
        for(int i=0;i<s.length();i++)
        {
            if(c==s.charAt(i))
            {
                count++;
            }
        }

        System.out.println(c+" repeated "+count+" times.");
        sc.close();
    }
}
