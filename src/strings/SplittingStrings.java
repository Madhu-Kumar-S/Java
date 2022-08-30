package strings;

public class SplittingStrings {
    public static void main(String[] args)
    {
        // split method
        String str = "Hi welcome to java programming";
        String[] arr = str.split(" ");
        for(String s: arr)
        {
            System.out.println(s);
        }
    }
}
