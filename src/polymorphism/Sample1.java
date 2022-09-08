package polymorphism;

public class Sample1 {
    void add() // method1
    {
        System.out.println("Sum is "+(1+2));
    }
    void add(int a, int b) // method2
    {
        System.out.println("Sum of two "+(a+b));
    }
    int add(int a, int b, int c, int d) // method 4
    {
        return a+b+c+d;
    }
    void add(int a, int b, int c) // method 3
    {
        System.out.println("Sum of three "+(a+b+c));
    }


}
