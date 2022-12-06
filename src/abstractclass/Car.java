package abstractclass;

abstract class MyCar
{
    int regNo;
    MyCar(int regNo)
    {
        this.regNo = regNo;
    }
    public void fuelTank()
    {
        System.out.println("Fuel tank success");
    }
    abstract void steering();
    abstract void breaks();
}
class Maruthi extends MyCar
{
    Maruthi(int regNo)
    {
        super(regNo);
        System.out.println("Reg no: "+regNo);
    }
    void steering()
    {
        System.out.println("Manual Steering");
    }
    void breaks()
    {
        System.out.println("Hydraulic Breaks");
    }
}

class Santro extends MyCar
{
    Santro(int regNo)
    {
        super(regNo);
        System.out.println("Reg no: "+regNo);
    }
    void steering()
    {
        System.out.println("Power Steering");
    }
    void breaks()
    {
        System.out.println("Air Breaks");
    }
}

public class Car {
    public static void main(String[] args)
    {
        MyCar ref;
        ref = new Maruthi(1234);
        ref.fuelTank();
        ref.steering();
        ref.breaks();

        ref = new Santro(5678);
        ref.fuelTank();
        ref.steering();
        ref.breaks();
    }
}
