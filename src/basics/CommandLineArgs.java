package basics;

public class CommandLineArgs {
    public static void main(String[] args)
    {
        System.out.println("Command Line Arguments :");
        for(String s: args)
        {
            System.out.println(s);
        }
    }
}
