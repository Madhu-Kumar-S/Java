package methods;

public class Sample6
{
    private int x = 1; // Instance / global variable
    void modify(int a)
    {
        System.out.println("value of a "+a);
        x = a; // a is local variable
        int b = 10; // y is local variable
        System.out.println("value of b "+b);
    }
    void access()
    {
        System.out.println("value of x "+x);
//        System.out.println(a);
//        System.out.println(b);
//        the above two methods gives error because variables a and b are local variables
//        whose scope is limited where they are declared and initialized
//        so we cant access them from another method
    }
}
