package methods;

public class Sample7
{
    private final int a;
    private final int b;

    static private final int c = 30;
    Sample7()
    {
        this(20,10); // calls the parameterized constructor
        System.out.println("default constructor");
        this.sum(); // calls the sum() method
        System.out.println("static variable "+c+" accessing from constructor");
    }
    Sample7(int a, int b)
    {
        System.out.println("parameterized constructor");
        this.a = a;
        this.b = b;
    }

    public void sum()
    {
        System.out.println("sum() method");
        System.out.println("sum is "+(this.a+this.b));
    }
}
