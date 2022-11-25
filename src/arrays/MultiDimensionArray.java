package arrays;

import java.util.Scanner;

// multidimensional array are combinations of arrays
// 3d array -> combination of several 2d arrays
// 2d array -> combination of several 1d arrays

public class MultiDimensionArray {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        int[][] twoD1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}}; // 1-row 3-columns
        System.out.println("Two D Array 1:");
         for (int i=0;i<twoD1.length;i++)
        {
            for(int j=0;j<twoD1[i].length;j++)
            {
                System.out.print(twoD1[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();

        System.out.print("Enter rows:");
        int rows = sc.nextInt();
        System.out.print("\nEnter columns:");
        int columns = sc.nextInt();
        System.out.println();

        int[][] twoD2 = new int[rows][columns];
        int count = 1;
        for(int i=0;i<twoD2.length;i++)
        {
            for(int j=0;j<twoD2[i].length;j++)
            {
                System.out.println("Enter element "+count+" :");
                int e = sc.nextInt();
                twoD2[i][j] = e;
                count++;
            }
        }

        System.out.println("Elements of Two D Array 2:");
        for(int[] i:twoD2)
        {
            for(int j:i)
            {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
