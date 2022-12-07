package interfaces;

interface Father
{
    float HT = 6.2f;
    void height();
}
interface Mother
{
    float HT = 5.8f;
    void height();
}
class Child implements Father, Mother
{
    public void height()
    {
        System.out.printf("child height is %.1f ft",(Father.HT+Mother.HT)/2);
    }
}
public class MultipleInheritance {
    public static void main(String[] args)
    {
        Child ch = new Child();
        ch.height();
    }
}
