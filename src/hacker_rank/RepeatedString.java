package hacker_rank;


import java.util.Scanner;

public class RepeatedString {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        char[] stringarr = s.toCharArray();

        int count = 0;
        int t = 0;
        for(int i=0;i<n/2;i++)
        {
            for(char c: stringarr)
            {
                if(t==n)
                {
                    break;
                }
                if(c=='a')
                {
                    count++;
                }
                t++;

            }
        }
        System.out.println(count);
    }
}
