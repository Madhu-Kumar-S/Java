package methods;
class Swap1
{
    void swap(int a, int b)
    {
        System.out.println("variables before swapping in outside main method");
        System.out.println(a);
        System.out.println(b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("variables after swapping in outside main method");
        System.out.println(a);
        System.out.println(b);
    }

}
public class PassPrimitive
{
    public static void main(String[] args)
    {
        Swap1 s = new Swap1();
        int a = 10;
        int b = 20;
        System.out.println("variables before swapping in main method");
        System.out.println(a);
        System.out.println(b);
        s.swap(a,b);
        System.out.println("variables after swapping in main method");
        System.out.println(a);
        System.out.println(b);
    }
}
