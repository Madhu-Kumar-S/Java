package hacker_rank;

import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args)
    {
        Scanner sc  =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            int e = sc.nextInt();
            arr[i] = e;
        }
        float po = 0.0f,ne = 0.0f,ze = 0.0f;
        for(int i: arr)
        {
            if(i>0) po++;
            else if(i<0) ne++;
            else if(i==0) ze++;
        }
        System.out.println(String.format("%.5f",po/n));
        System.out.println(String.format("%.5f",ne/n));
        System.out.println(String.format("%.5f",ze/n));
    }
}
