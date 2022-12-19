package exceptionhandling;

public class ExceptionalHandling {
    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        try {
            System.out.println("open files");
            int c = a/b;
            System.out.println(c);
        }
        catch (Exception e)
        {
            // to print exception details
            System.out.println(e);
            // to display own message to user
            System.out.println("Division by zero is not possible");
        }
        finally {
            System.out.println("close files");
        }

    }
}
