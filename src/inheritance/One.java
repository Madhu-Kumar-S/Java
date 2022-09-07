package inheritance;

public class One
{
    // protected specifier is commonly used in superclass to make the super class members available to the subclass
    // if we declare members in super class as private then it wont be able to accessed by subclass

    protected int x = 10;

    public void show()
    {
        System.out.println("Super class var :"+x);
        System.out.println("Super class method");
    }
}

