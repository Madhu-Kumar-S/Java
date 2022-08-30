package programs;

import java.util.Scanner;

public class SearchingString {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();

//        System.out.println(s);
        String[] arr = str.split(" ");

        System.out.println("Enter a String you want to find:");
        String search  = sc.next();
        for(int i=0;i< arr.length;i++)
        {
            if(search.equalsIgnoreCase(arr[i]))
            {
                System.out.println(search+" found at position "+(i+1));
            }
        }

    }
}
