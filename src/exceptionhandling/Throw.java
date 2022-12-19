package exceptionhandling;

public class Throw {
    static void show()
    {
        try
        {
            System.out.println("Inside Demo");
            throw new NullPointerException("Exception Data");
        }
        catch (NullPointerException e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args)
    {
        Throw.show();
    }
}
