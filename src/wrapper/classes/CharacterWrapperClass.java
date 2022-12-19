package wrapper.classes;

import java.util.Scanner;

public class CharacterWrapperClass {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        sc.close();

        if(Character.isDigit(ch)) System.out.println("Digit");
        else if(Character.isUpperCase(ch)) System.out.println("Upper Case");
        else if(Character.isLowerCase(ch)) System.out.println("Lower Case");

        Character char1 = Character.valueOf('A');
        Character char2 = Character.valueOf('A');

        if(char1==char2) System.out.println("Equal");
        else System.out.println("Not Equal");

    }
}
