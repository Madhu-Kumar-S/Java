package practice;

import java.util.Scanner;

public class RowColumnSum {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                int e = sc.nextInt();
                arr[i][j] = e;
            }
        }

        System.out.println("Row wise sum");
        for(int[] a: arr)
        {
            int sum = 0;
            for(int i: a)
            {
                sum+=i;
            }
            System.out.print(sum+"\t");
        }

        System.out.println("\nColumn wise sum");
        for(int i=0;i<c;i++)
        {
            int sum = 0;
            for(int j=0;j<r;j++)
            {
                sum+=arr[j][i];
            }
            System.out.print(sum+"\t");
        }



    }
}
