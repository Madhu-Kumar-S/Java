package inheritance;

public class Two extends One {
    private int x = 20;
    public void show()
    {
        System.out.println("Sub class var :"+x);
        System.out.println("Sub class method");
        super.show();
        System.out.println("Super class var from sub class :"+super.x);


    }
}
