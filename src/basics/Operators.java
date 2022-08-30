package basics;

public class Operators {
    public static void main(String args[])
    {
        int a = 20;
        int b = 10;
        System.out.println("Arithmetic operators");
        System.out.println("Addition a+b="+(a+b));
        System.out.println("Subtraction a-b="+(a-b));
        System.out.println("Multiplication a*b="+(a*b));
        System.out.println("Division a/b="+(a/b));
        System.out.println("Modulus a%b="+(a%b));

        System.out.println("--------------------------------");

        int i = 2;
        System.out.println("Unary operators");
        System.out.println("post Increment = "+(i++));
        System.out.println("post Decrement = "+(i--));
        System.out.println("pre Increment = "+(++i));
        System.out.println("pre Decrement = "+(--i));
        System.out.println("unary minus = "+(-i));

        System.out.println("--------------------------------");

        System.out.println("Assignment operator");
        a += a;
        System.out.println(a);

        System.out.println("--------------------------------");

        System.out.println("Relational operator");
        System.out.println("Greater than > "+(a>b));
        System.out.println("Lesser than < "+(a<b));
        System.out.println("Greater than equal to >= "+(a>=b));
        System.out.println("Lesser than equal to <= "+(a<=b));
        System.out.println("Equal to == "+(a==b));
        System.out.println("Not equal to != "+(a!=b));

        System.out.println("--------------------------------");

        System.out.println("Logical operator");
        int x = 20;
        int y = 10;
        System.out.println("Logical and && "+((x>y)&&(x<y)));
        System.out.println("Logical or || "+((x>y)||(x<y)));
        System.out.println("Logical not ! "+!(x>y));

        System.out.println("--------------------------------");

        System.out.println("Ternary operator");
        System.out.println((x>y)?x:y);

        System.out.println("--------------------------------");

        System.out.println("new and instance of operator");

        Operators op = new Operators();
        boolean bool = op instanceof Operators;
        System.out.println(bool);

        System.out.println("--------------------------------");

        System.out.println("Cast operator");
        int z = (int)5.6;
        System.out.println(z);

        /*
        Boolean Operators
        boolean and - a&b returns true if both a and b r true
        boolean or - a|b returns true if either a or b r true
        boolean not - a! returns false if a is true and vice versa

        Bitwise Operators

        bitwise and - &
        bitwise or - |
        bitwise xor - ^
        bitwise complement - ~
        bitwise right shift - >>
        bitwise left shift -  <<

        priority of operators
        braces
        increment or decrement
        arithmetic
        unary + or -
        relational
        boolean and bitwise
        logical
        ternary
        assignment

         */
    }
}
