package basics;

public class DataTypes {
    public static void main(String args[])
    {
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 92;

        float f = 5.6f;
        double d = 5.067;

        char c = 'x';
        String str = "Hi";

        boolean bool = true;

        System.out.println("byte="+b+"\nshort="+s+"\nint="+i+"\nlong="+l+"\nfloat="+f+"\ndouble="+d+"\nchar="+c+"\nString="+str+"\nboolean="+bool);

        int decimal = 26;
        int octal = 032;
        int hexadecimal = 0x1a;
        int binary = 0b1010;
        int num = (int)binary;
        System.out.println();
        System.out.printf("\nDecimal = %d",num);
        System.out.printf("\nOctal = %o",num);
        System.out.printf("\nHexaDecimal = %x",num);
        System.out.printf("\nbinary = %s",Integer.toBinaryString(num));

        int no = 1_00_000; // for readability

    }
}
