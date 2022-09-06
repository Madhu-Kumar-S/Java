package basics;

public class DataTypes {
    public static void main(String args[])
    {
        byte b = 127; // 1 byte = 8 bits
        short s = 32767; // 2 bytes
        int i = 2147483647; // 4 bytes
        long l = 92; // 8 bytes

        float f = 5.6f; // 4 bytes
        double d = 5.067; // 8 bytes

        char c = 'x'; // 2 bytes
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
