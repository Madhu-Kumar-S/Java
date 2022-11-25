package hacker_rank;

import java.util.Scanner;

public class AngryProffessor {
    static void angryProfessor(int n, int k, int[] arrivalTime)
    {
        int arrivedLate = 0;
        for(int i: arrivalTime)
        {
            if(i>0)
            {
                arrivedLate++;
            }
        }
//        System.out.println(arrivedLate);
        if(arrivedLate<k) System.out.println("Yes");
        else System.out.println("No");

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
//        int testCases = sc.nextInt();
        int[] stu = new int[2];
        stu[0] = sc.nextInt();
        stu[1] = sc.nextInt();
        int[] arrivalTime = new int[stu[0]];
        for(int i=0;i<arrivalTime.length;i++)
        {
            int a = sc.nextInt();
            arrivalTime[i] = a;
        }
        AngryProffessor.angryProfessor(stu[0], stu[1],arrivalTime);
    }
}
