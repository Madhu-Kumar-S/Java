package inheritance;

class Shape
{
    protected float l;
    Shape(float l)
    {
        this.l=l;
    }
}

class Square extends Shape
{
    Square(float l)
    {
        super(l);
    }

    void calculate()
    {
        System.out.println("Area os Square :"+ (l*l)+" sq units");
    }
}

class Rectangle extends Square
{
    private final float b;
    Rectangle(float l, float b)
    {
        super(l);
        this.b = b;
    }

    void calculate()
    {
        super.calculate();
        System.out.println("Area os Rectangle :"+ (l*b)+" sq units");
    }
}

public class Area {
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle(5.5f,6);
        r.calculate();
    }
}
