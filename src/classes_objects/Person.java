package classes_objects;

public class Person {

    // initializing instance variables
    private String name;
    private int age;

    // declaring methods
    public void show()
    {
        System.out.println("Person details are:");
        System.out.println("Name is :"+name);
        System.out.println("Age is :"+age);
    }

    /* the above method gives output as null and 0
    * because the variables is not initialized and default values will be returned as output */

}
