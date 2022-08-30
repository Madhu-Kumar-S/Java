package arrays;

// Single dimension array is a collection of elements of similar datatype

public class SingleDimensionArray {
    public static void main(String[] args)
    {
        int[] marks1 = {1,2,3,4,5};
        System.out.println("marks1:");
        for(int i:marks1)
            System.out.println(i);

        int[] marks2 = new int[5];
        marks2[0] = 1;
        marks2[1] = 2;
        marks2[2] = 3;
        marks2[3] = 4;
        marks2[4] = 5;

        System.out.println("marks2:");
        for(int i:marks2)
            System.out.println(i);

        //similarlly
        float[] marks3 = {1.1f,2.2f,3.3f};
        float[] marks4 = new float[2];
        marks4[0] = 1.1f;
        marks4[1] = 2.2f;

        char[] letters1 = {'A','B','C'};
        char[] letters2 = new char[2];
        letters2[0] = 'a';
        letters2[1] = 'b';

        String[] names1 = {"Gt","Interceptor"} ;
        String[] names2 = new String[2];
        names2[0] = "Thunderbird";
        names2[1] = "meteor";

        System.out.println("RE Names:");
        for(int i=0;i<2;i++)
        {
            System.out.println(names1[i]);
        }
    }
}
