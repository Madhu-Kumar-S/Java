package methods;

public class StaticBlock2 {
    static
    {
        System.out.println("static block");
//        System.exit(0);
//        by using above method this program can be terminated successfully without any error
    }
    // executes static block and rises error as no main method found
    // it cannot be run in ide but traditionally can be done
}
