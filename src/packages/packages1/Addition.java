package packages.packages1;

public class Addition {
    private final double d1;
    private final double d2;
    public Addition(double d1, double d2)
    {
        this.d1 = d1;
        this.d2 = d2;
    }
    public void sum()
    {
        System.out.println("Sum is "+(d1+d2));
    }
}
