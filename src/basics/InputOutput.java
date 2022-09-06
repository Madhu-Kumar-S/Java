package basics;

import java.io.*;
import java.util.*;

public class InputOutput {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // to read char

        // br.read() takes input as single char from keyboard, but it releases \n char
        // which is taken input for next upcoming input

        //solution 1
        System.out.println("Enter char:");
        char ch = (char) br.read();
        System.out.println("char = "+ch);
        br.skip(1);

        //sol 2
        System.out.println("Enter char:");
        char c = br.readLine().charAt(0);
        System.out.println("char = "+c);

        //to read string
        System.out.println("Enter string:");
        String str = br.readLine();
        System.out.println("string = "+str);

        //to read integer
        System.out.println("Enter int:");
        int n = Integer.parseInt(br.readLine());
        System.out.println("integer = "+n);

        //to read floating point
        System.out.println("Enter float");
        float f = Float.parseFloat(br.readLine());
        System.out.println("floating point = "+f);

        // to read double
        System.out.println("Enter double:");
        double d = Double.parseDouble(br.readLine());
        System.out.println("double = "+d);

        System.out.println("----------------------------------");

        // to accept multiple inputs at a time
        System.out.println("Enter name id and salary:");
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s," ");

        String s1 = st.nextToken();
        String s2 = st.nextToken();
        String s3 = st.nextToken();

        s1 = s1.trim();
        s2 = s2.trim();
        s3 = s3.trim();

        String name = s1;
        int id = Integer.parseInt(s2);
        float salary = Float.parseFloat(s3);

        System.out.println("Name = "+name);
        System.out.println("Id = "+id);
        System.out.println("Salary = "+salary);

        br.close(); //closing stream

        System.out.println("----------------------------------");

        // Reading input using Scanner class

        Scanner sc = new Scanner(System.in);

        String string1 = sc.next(); // to read single word
        String string2 = sc.nextLine(); // to read till end of line
        char cha = sc.next().charAt(0); // to read char
        int is = sc.nextInt(); // to read int
        float fs = sc.nextFloat(); // to read float

        System.out.println(string1+"\t"+string2+"\t"+cha+"\t"+is+"\t"+fs);

        sc.close();

        // displaying output with printf()

        System.out.printf("string = %s","continetal gt");
        System.out.printf("%ncharacter = %c",'A');  // %n --> new line char
        System.out.printf("%ninteger = %d",56);
        System.out.printf("%nfloat = %f",5.6f);

        int num = 65;
        System.out.printf("%noctal = %o",num);
        System.out.printf("%nhexadecimal = %x",num);

        // using string.format()

        int no = 2;
        String stt = "hi";
        char ct = 'A';

        System.out.println(String.format("%ninteger = %d%nstring = %s%nchar = %c",no,stt,ct));

    }
}
