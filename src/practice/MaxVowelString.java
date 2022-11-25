package practice;

import java.util.Scanner;

public class MaxVowelString {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        char[] chararr = {'a','e','i','o','u'};

        int maxvs = 0;
        String mvs = null;
        for(String s: arr)
        {
            int vcount = 0;
            char[] ca = s.toCharArray();
            for(char c1: ca)
            {
                for(char c2:chararr)
                {
                    if(c1==c2)
                    {
                        vcount++;
                    }
                }
            }
            if(vcount > maxvs) // if equal print first
            {
                maxvs = vcount;
                mvs = s;
            }
//            else if(vcount >= maxvs) // if equal print last
//            {
//                maxvs = vcount;
//                mvs = s;
//            }
        }
        System.out.println(mvs);
    }
}
