package polymorphism;

class One
{
    void display()
    {
        System.out.println("Super class");
    }
}

class Two extends One
{
    void display()
    {
        System.out.println("Sub class");
    }
}

public class Poly2 {
    public static void main(String[] args)
    {
        new One().display();
        new Two().display();
        // here JVM calls which method has to be called depending upon the object to which class it is created
    }
}
