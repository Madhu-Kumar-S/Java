package programs;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows:");
        int rows = sc.nextInt();
        System.out.print("\nEnter columns:");
        int columns = sc.nextInt();
        System.out.println();

        int[][] matrix = new int[rows][columns];
        int count = 1;
        System.out.println("Enter "+matrix.length*matrix[0].length+" elements:");
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                int e = sc.nextInt();
                matrix[i][j] = e;
            }
        }

        System.out.println("Elements of the matrix:");
        for (int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("Elements of the Transpose matrix:");
        for (int i=0;i<matrix[i].length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                System.out.print(matrix[j][i]+"\t");
            }
            System.out.println();
        }

        sc.close();

    }
}
