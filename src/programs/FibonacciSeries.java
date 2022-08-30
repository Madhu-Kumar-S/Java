package programs;

import java.util.Scanner;

// fibonacci series is a series in which each number is sum of previous two terms

public class FibonacciSeries {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter up-to how many terms:");
        int n = sc.nextInt();
        System.out.println("Enter 1st number:");
        int f1 = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int f2 = sc.nextInt();

        int f = f1+f2;
        System.out.println("Fibonacci series:");
        System.out.print(f1+"\t"+f2+"\t"+f+"\t");

        for(int i=3;i<10;i++)
        {
            f1 = f2;
            f2 = f;
            f = f1+f2;
            System.out.print(f+"\t");
        }
    }
}
