package inheritance;

public class OneTwo {
    public static void main(String[] args)
    {
        Two t = new Two();
        t.show();
    }
}

/* when both super class and subclass contains same variables and methods
so if we create an object to subclass then only subclass members will be accessed
but not super class although super class contains same variable and method name
To overcome this
'super' keyword is used in subclass to access the members of super class
 */
