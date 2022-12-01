package typecasting;

class Myclass
{
    int x;
    Myclass(int x)
    {
        this.x = x;
    }
}

public class Compare {
    public static void main(String[] args)
    {
        Myclass m1 = new Myclass(1);
        Myclass m2 = new Myclass(1);
        if(m1.equals(m2)) System.out.println("same");
        else System.out.println("different");

        System.out.println(m1.getClass().toString());

    }
}
