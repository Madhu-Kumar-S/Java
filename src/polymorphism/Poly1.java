package polymorphism;

public class Poly1 {
    public static void main(String[] args)
    {
        Sample1 s1 = new Sample1();
        s1.add(); // this call is bounds to the method1
        s1.add(1,2); // this call is bounds to the method2
        s1.add(1,2,3); // this call is bounds to the method3
        System.out.println("Sum of four "+s1.add(1,2,3,4)); // this call is bounds to the method4
    }
}
