package classes_objects;

public class Student {
    private final String name;
    private final int age;

    // constructor is used to initialize the instance variables of a class
    Student() // default constructor
    {
        name = "Ravi";
        age = 22;
    }

    public void show()
    {
        System.out.println("Student details are:");
        System.out.println("Name is :"+name);
        System.out.println("Age is :"+age);
    }
}
