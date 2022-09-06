package methods;

public class Sample2
{
    // declaring instance variables
    private final int a;
    private final int b;

    Sample2(int x, int y) // parameterized constructor
    {
        // initializing instance variables
        a = x;
        b = y;
    }

    // void method
    void display()
    {
        System.out.println("void method");
    }

    // instance method -> act upon instance variable of the class
    // instance method can be called using object.method_name();

    // method without parameters with return type
    double sum()
    {
        return a+b;
    }

    // method with parameters & with return type
    double sum(int a, int b)
    {
        return (double) (a+b);
    }

    double sum(double a,double b)
    {
        return a+b;
    }
}
