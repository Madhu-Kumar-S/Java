package strings;

public class StringCreation {
    public static void main(String[] args)
    {
        // 1st way
        String s1 = "Hello";
        System.out.println(s1);

        // 2nd way
        String s2 = new String("Hi");
        System.out.println(s2);

        //3rd way
        char[] arr = {'w','e','l','l','c','o','m','e'};
        String s3 = new String(arr);
        System.out.println(s3);

        String s4 = new String(arr,0,4);
        System.out.println(s4);

    }
}
