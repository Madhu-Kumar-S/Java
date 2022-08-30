package basics;

public class EscapeSequence {
    public static void main(String args[])
    {
        System.out.print("Hi"); // print() throws courser in same line
        System.out.println("Hi"); // println() throws courser to the next line
        System.out.println("Hi");
        System.out.println("1. Hi,\nMy name is Java"); // \n - next line
        System.out.println("2. Hi,\bMy name is Java"); // \b - backspace
        System.out.println("3. Hi,\"My name is Java\""); // displays "
    }
}
