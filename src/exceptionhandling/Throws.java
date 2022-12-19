package exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Throws {
    static void show() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter string");
        String s = br.readLine();
        System.out.println(s);
    }
    public static void main(String[] args) throws IOException
    {
        Throws.show();
    }
}
