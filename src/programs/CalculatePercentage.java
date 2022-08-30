package programs;

import java.util.Scanner;

public class CalculatePercentage {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many Subjects:");

        int sub = sc.nextInt();

        int[] marks = new int[sub];

        for(int i=0;i<marks.length;i++)
        {
            System.out.println("Enter sub "+(i+1)+" marks");
            int m = sc.nextInt();
            marks[i] = m;
        }
        int sum = 0;
        for (int i: marks)
        {
            sum+=i;
        }
        System.out.println("Sum is:"+sum);
        System.out.println("Percentage is:"+sum/sub);
    }
}
