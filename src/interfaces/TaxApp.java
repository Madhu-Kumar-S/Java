package interfaces;

interface Tax
{
    double stateTax();
}
class KA implements Tax
{
    public double stateTax()
    {
        System.out.println("According to KA govt rules...");
        return 5000.0;
    }
}
class TN implements Tax
{
    public double stateTax()
    {
        System.out.println("According to TN govt rules...");
        return 2000.0;
    }
}
public class TaxApp {
    public static void main(String[] args) throws Exception
    {
        Tax ref;
        ref = new TN();
        calculateTax(ref);
        ref = new KA();
        calculateTax(ref);
    }
    static void calculateTax(Tax ref) // callback done here
    {
        double centraltax = 1000.0;
        double statetax = ref.stateTax();
        System.out.println("Total tax = "+(centraltax+statetax));

    }
}
