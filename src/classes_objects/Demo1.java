package classes_objects;

public class Demo1 {
    public static void main(String[] args)
    {
        // object creation
        Person raju = new Person();

        // caling methods of the classes using objects
        raju.show();

        // hashcode is a unique identification number allocated to object by the JVM except for string objects
        // hascode is stored in the variable raju (i.e object)
        System.out.println("Hash code: "+raju.hashCode());

        //---------------------------------------------------------------

        Student ravi = new Student();
        ravi.show();
        System.out.println("Hash code: "+ravi.hashCode());
    }
}
