package methods;

public class Method5 {
    public static void main(String[] args)
    {
        Sample5 s1 = new Sample5();
        Sample5 s2 = new Sample5();
        System.out.println("Instance variable before incrementing:");
        s1.display1(); // 10
        s2.display1(); // 10

        s1.x++;
        System.out.println("Instance variable after incrementing:");
        s1.display1(); // 11
        s2.display1(); // 10

        Sample5 s3 = new Sample5();
        Sample5 s4 = new Sample5();
        System.out.println("static variable before incrementing:");
        s3.display2(); // 10
        s4.display2(); // 10

        Sample5.y++;
        System.out.println("static variable after incrementing:");
        s3.display2(); // 11
        s4.display2(); // 11

//         it is a good practice that static methods should be called by classname.methodname()
//         just for demo i called with object.methodname()

//        After executing the static methods only JVM will create objects
//        That's y static methods cannot access instance variables as it is not available to object
//        whereas instance methods can access both static and non-static content
//        The main priority is given to the static  / class content than instance content
    }
}
