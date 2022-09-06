package methods;

public class Sample4
{

    // instance variable
    private final int x = 10;

    // static variable / class variable
    static private final int y = 20;

    void display1() // instance method
    {
        System.out.println("instance var = "+x);
        System.out.println("class or static var = "+y);
    }

    static void display2() // static method
    {
        // System.out.println("instance var = "+x); this statement rises error
        System.out.println("class or static var = "+y);
    }

    // Static content can be accessed only by static members
    // non-static content or instance variables and methods can access both static and non-static content
}
