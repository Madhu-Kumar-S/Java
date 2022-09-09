package relationship_bw_objects_methods;

import java.awt.*;

public class One {
    int x;
    Two t; // class Two reference
    One(Two t) // constructor that receives Two class reference
    {
        this.t = t;
        x = 10;
    }
    void display()
    {
        System.out.println("Ones variable "+x);
        System.out.println("Twos variable from ones class "+t.y); // accessing Two class variable
        t.display();  // calling Two class method from One class
    }
}
