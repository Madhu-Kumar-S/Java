package packages.packages2;
//import packages.packages1.Addition; // Addition is a class in packages1
//import packages.packages1.Subtraction; // Subtraction is a class in package1
//or
import packages.packages1.*;

public class UserDefinedDemo {
    public static void main(String[] args)
    {
        new Addition(15.5,10).sum();
        new Subtraction(15.5,10).diff();
    }
}
