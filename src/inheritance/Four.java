package inheritance;

public class Four extends Three
{
    Four() // subclass default constructor
    {
        System.out.println("Sub class Default constructor");
    }

    Four(String s1, String s2)
    {
        // call superclass para-constructor and pass argument
        // super() should be 1st statement
        super(s1);
        System.out.println(s2);
    }
}

