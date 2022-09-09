package relationship_bw_objects_methods;

public class Relate {
    public static void main(String[] args)
    {
        Two t = new Two(22);
        One o = new One(t); // passing Two class object to One class
        o.display();
    }

}
