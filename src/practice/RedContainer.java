package practice;

import java.util.Arrays;

public class RedContainer {
    public static void main(String[] args)
    {
        int[] redContainer = {10,20,30};
        int index = 0;
        for(int i: redContainer)
        {
            i = i+2;
            redContainer[index] = i;
            index++;
        }
        System.out.println(Arrays.toString(redContainer));
    }
}
