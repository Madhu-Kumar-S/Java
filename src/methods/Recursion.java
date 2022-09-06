package methods;

import java.util.Scanner;

public class Recursion
{
    int factorial(int n)
    {
        if(n==0 || n==1) return n;

        return n*factorial(n-1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial:");
        int num =  sc.nextInt();

        Recursion r = new Recursion();
        int fact = r.factorial(num);
        System.out.println("Factorial of a "+num+" is "+fact);
        sc.close();
    }
}
