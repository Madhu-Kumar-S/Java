package packages.packages1;

public class Subtraction {
    private final double d1;
    private final double d2;
    public Subtraction(double d1, double d2)
    {
        this.d1 = d1;
        this.d2 = d2;
    }
    public void diff()
    {
        System.out.println("Difference is "+(d1-d2));
    }
}
