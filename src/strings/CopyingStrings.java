package strings;

public class CopyingStrings {
    public static void main(String[] args)
    {
        String s = "Hi welcome to java programming";

        char[] arr = new char[s.length()];

        s.getChars(3,s.length(),arr,0);

        System.out.println(arr);
    }
}
