package methods;

public class Method3 {

    // static method are the methods that do not act upon instance variables of a class
    // these methods can be called using classname.methodname();

    static void display()
    {
        System.out.println("This is static method");
    }

    public static void main(String[] args)
    {
        Method3.display();
        System.out.println("Sum is = "+Sample3.sum(10,20));
    }

}
