package methods;

public class Method2 {
    public static void main(String[] args)
    {
        Sample2 s = new Sample2(1,2);
        s.display();
        System.out.println(s.sum());

        double d1 = s.sum(5,5);
        System.out.println(d1);

        double d2 = s.sum(2.0,3.0);
        System.out.println(d2);
    }
}
