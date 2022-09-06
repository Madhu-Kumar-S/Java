package methods;

import java.util.Scanner;

class Matrix
{
    private int r,c;
    private int[][] arr;
    Matrix(int r, int c)
    {
       this.r = r;
       this.c = c;
       arr = new int[r][c];
    }

    int[][] getMatrix()
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                int element = sc.nextInt();
                arr[i][j] = element;
            }
        }
        sc.close();
        return arr;
    }

    void display(int[][] arr)
    {
        for(int[] i: arr)
        {
            for(int j: i)
            {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }

    int[][] sumMatrix(int[][] x, int[][] y)
    {
        int[][] temp = new int[r][c];

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                temp[i][j] = x[i][j]+y[i][j];
            }
        }
        return temp;
    }

    void displayMatrix(int[][] res)
    {
        for(int[] i: res)
        {
            for(int j: i)
            {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }

}

public class PassArray {
    public static void main(String[] args)
    {
        // Matrix addition - for addition rows and columns should be same

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int r = sc.nextInt();
        System.out.print("Enter columns: ");
        int c = sc.nextInt();

        if(r==c)
        {
            Matrix m1 = new Matrix(r, c);
            Matrix m2 = new Matrix(r, c);

            int[][] x,y,z;

            System.out.println("Enter "+(r*c)+" elements for 1st matrix");
            x = m1.getMatrix();
            System.out.println("Enter "+(r*c)+" elements for 2nd matrix");
            y = m2.getMatrix();

            System.out.println("Elements of 1st matrix");
            m1.display(x);
            System.out.println("Elements of 2nd matrix");
            m2.display(y);

            z = m1.sumMatrix(x, y);

            System.out.println("Sum of two matrix");
            m1.displayMatrix(z);

        }
        else System.out.println("***NOTE***\nPlease enter equal rows and columns for matrix addition.");

        sc.close();

    }
}
