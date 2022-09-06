package methods;

public class StaticBlock1 {
    static
    {
        System.out.println("static block");
    }

    public static void main(String[] args)
    {
        System.out.println("main method");
    }

    // JVM executes static block on higher priority basis
    // then only main method
}
