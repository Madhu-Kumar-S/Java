package programs;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers:");
        int len = sc.nextInt();

        System.out.println("Enter numbers:");
        int[] numbers = new int[len];
        for(int i=0;i<len;i++)
        {
            int n = sc.nextInt();
            numbers[i] = n;
        }

        System.out.println("Before sorting:");
        for(int i:numbers)
        {
            System.out.print(i+"\t");
        }

        System.out.println("\nAfter sorting:");
        for(int i=0;i<len-1;i++)
        {
            for(int j=0;j<len-i-1;j++)
            {
                if(numbers[j]>numbers[j+1])
                {
                    //swap
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        for (int i:numbers)
        {
            System.out.print(i+"\t");
        }

    }
}
