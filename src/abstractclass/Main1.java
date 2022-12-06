package abstractclass;

abstract class AbstractClass
{
    abstract void calculate(double l);
}
class Subclass1 extends AbstractClass
{
    void calculate(double l) //square value
    {
        System.out.println("Area of square "+(l*l));
    }
}
class Subclass2 extends AbstractClass
{
    void calculate(double l) // cube value
    {
        System.out.println("Area of rectangle "+(l*l*l));
    }
}
public class Main1 {
    public static void main(String[] args)
    {
        // objects
        Subclass1 s1 = new Subclass1();
        s1.calculate(2);
        Subclass2 s2 = new Subclass2();
        s2.calculate(3);

        // references
        AbstractClass ref;
        ref = s1;
        ref.calculate(3);
        ref = s2;
        ref.calculate(4);
    }
}
