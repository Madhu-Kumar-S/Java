package hacker_rank;

import java.util.Objects;
import java.util.Scanner;

public class SparseArrays {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] stringarray = new String[n];
        for(int i=0;i<n;i++)
        {
            stringarray[i] = sc.next();
        }

        int q = sc.nextInt();
        String[] queryarray = new String[q];
        for(int i=0;i<q;i++)
        {
            queryarray[i] = sc.next();
        }
        for(String qa: queryarray)
        {
            int count = 0;
            for(String sa:stringarray)
            {
                if(Objects.equals(qa, sa))
                {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
