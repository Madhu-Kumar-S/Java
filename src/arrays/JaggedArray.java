package arrays;

//Jagged array -> group of arrays within it, irregular array
public class JaggedArray {
    public static void main(String[] args)
    {
        int[][] arr = new int[2][]; // 2-arrays
        arr[0] = new int[2]; // 0th row 2 elements
        arr[1] = new int[3]; // 1st row 3 elements

        arr[0][0] = 1;
        arr[0][1] = 2;

        arr[1][0] = 3;
        arr[1][1] = 4;
        arr[1][2] = 5;

        for(int[] i:arr)
        {
            for(int j: i)
            {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}
