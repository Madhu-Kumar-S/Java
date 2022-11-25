package hacker_rank;

import java.util.Scanner;

public class CatAndMouse {
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);
        int catA = sc.nextInt();
        int catB = sc.nextInt();
        int mouse = sc.nextInt();

        int cAmC = Math.abs(mouse - catA);
        int cBmC = Math.abs(mouse - catB);

        int minD = Math.min(cAmC,cBmC);

        if(cAmC==cBmC) System.out.println("Mouse C");
        else if(minD==cAmC) System.out.println("Cat A");
        else System.out.println("Cat B");
    }
}
