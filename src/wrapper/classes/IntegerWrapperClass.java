package wrapper.classes;

import java.util.Scanner;

public class IntegerWrapperClass {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        Integer obj1 = Integer.valueOf(n1);
        Integer obj2 = Integer.valueOf(n2);

        System.out.println(obj1.compareTo(obj2));

        int num = sc.nextInt();
        System.out.println("In hexaDecimal: "+Integer.toHexString(num));
        System.out.println("In octal: "+Integer.toOctalString(num));
        System.out.println("In binary: "+Integer.toBinaryString(num));
    }
}
