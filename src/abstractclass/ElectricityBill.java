package abstractclass;

abstract class Plan
{
    protected double rate;
    public abstract void getRate(double rate);
    public void calculate(int units)
    {
        System.out.printf("Bill amount for %d units is %.1f",units,rate*units);
        System.out.println();
    }
}
class CommercialPlan extends Plan
{
    public void getRate(double rate)
    {
        this.rate = rate;
    }
}
class DomesticPlan extends Plan
{
    public void getRate(double rate)
    {
        this.rate = rate;
    }
}

public class ElectricityBill {
    public static void main(String[] args)
    {
        Plan ref;
        ref = new CommercialPlan();
        ref.getRate(5.00);
        ref.calculate(250);
        ref = new DomesticPlan();
        ref.getRate(2.60);
        ref.calculate(150);
    }
}
