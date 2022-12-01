package typecasting;

// Referenced DT casting
class One
{
    void show1()
    {
        System.out.println("Super class method");
    }
}
class Two extends One
{
    void show2()
    {
        System.out.println("Sub class method");
    }

}
public class Casting2 {
    public static void main(String[] args)
    {
//        widening
//        One o = new Two();
//        o.show1();

//        Narrowing done by superclass object - gives exception
//        Two t = (Two) new One();
//        t.show1();

//        Narrowing done by subclass object
//        One o = new Two();
//        Two t = (Two) o;
//        t.show1();
//        t.show2();
    }
}
