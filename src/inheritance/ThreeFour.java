package inheritance;

public class ThreeFour {
    public static void main(String[] args)
    {
        Four f2 = new Four();
        Four f1 = new Four("Super class parameterized constructor", "Sub class parameterized constructor");
    }
}

/* when an object to a subclass is created then the default constructor of the super class will automatically called and then the sub class
as superclass default constructor is already available to the subclass by default

but in case of parameterized constructor, it should be called explicitly  by using super() keyword
 */