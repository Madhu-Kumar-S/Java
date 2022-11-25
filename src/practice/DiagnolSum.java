package practice;

public class DiagnolSum {
    public static void main(String[] args)
    {
        int[][] arr = {{1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5},
                {2,2,3,4,5}};

        int rightDiognalSum = 0;
        int leftDiognalSum = 0;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(i==j)
                    rightDiognalSum += arr[i][j];
                if((i+j) == arr.length-1)
                    leftDiognalSum += arr[i][j];
            }
        }
        System.out.println(rightDiognalSum);
        System.out.println(leftDiognalSum);
    }
}
