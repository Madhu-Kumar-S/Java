package basics;

public class ControlStatements {
    public static void main(String args[])
    {
        // if else
        if(3==2) System.out.println("True");
        else System.out.println("False");

        // if..else if
        if(1<2) System.out.println("True");
        else if(2>1) System.out.println("True");

        // Switch statement
        int option = 2;
        switch (option) {
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
            case 3 -> System.out.println("2");
            default -> System.out.println("default");
        }

        //break statement

        boolean x = true;
        block1:{
            block2:{
               block3:{
                System.out.println("Block 3");if(x) break block2;}
                System.out.println("Block 2");}
            System.out.println("Block 1");}

        // Continue statement using for loop

        for(int i=1;i<=5;i++)
        {
            if(i==3) continue;
            System.out.print(i+"\t");
        }
        System.out.println();

        // while loop
        int i=1;
        while(i<=5)
        {
            System.out.print(i+"\t");
            i++;
        }
        System.out.println();

        //do while loop
        int j=1;
        do
        {
            System.out.print(j+"\t");
            j++;
        }while(j<=5);
        System.out.println();


        //return statement
        int c = ControlStatements.addition(10,20);
        System.out.println(c);

        //if we use return in main entire program will be terminated;
        //System.exit(0); --> terminates the entire program when used in normal or main method
    }
    static int addition(int a,int b)
    {
        return a+b;
    }
}

