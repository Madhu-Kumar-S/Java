package arrays;

public class CopyingArray {
    public static void main(String[] args)
    {
        int[] copyFrom = {1,2,3,4,5,6,7,8,9};
        int[] copyTo = new int[7];
        System.arraycopy(copyFrom,2,copyTo,0,5);
        for(int i:copyTo)
        {
            System.out.println(i);
        }
    }
}
