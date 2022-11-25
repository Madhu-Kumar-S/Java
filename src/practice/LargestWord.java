package practice;

import java.util.Scanner;

public class LargestWord {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int max = 0;
        String ts = null;
        for(String s: arr)
        {
            if(s.length()>max)
            {
                max = s.length();
                ts = s;
            }
        }
        System.out.println(ts);
    }
}
