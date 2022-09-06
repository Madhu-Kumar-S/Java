package classes_objects;

public class Flower {
    private final String name;
    private final String colour;

    public Flower(String n, String c) // parameterized constructor
    {
        name = n;
        colour = c;
    }

    void show()
    {
        System.out.println("Flower name is: "+name);
        System.out.println("Flower colour is: "+colour);
    }
}
