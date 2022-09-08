package polymorphism;

class Three
{
    static void display()
    {
        System.out.println("class three");
    }
}

class Four extends Three
{
    static void display()
    {
        System.out.println("class four");
    }
}


public class Poly3 {
    public static void main(String[] args)
    {
        Three.display();
        Four.display();
    }
}

// static polymorphism
// single copy in a memory is shared by all objects
// static methods belongs to a class rather to an objects, so they are called by class name
// When these methods are overloaded or override, since they won't depend upon objects so java compiler
// need not wait until the objects created to understand which method should be called