package exceptionhandling;

public class MultipleExceptionalHandling {
    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int[] arr = {1,2,3,4,5};

        try {
            System.out.println("open files");
            int c = a/b;
            arr[5] = 6;
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("close files");
        }
    }
}
