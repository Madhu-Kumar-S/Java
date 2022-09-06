package methods;

public class VariableArguments
{
    void sum(int...x) // method with variable arguments -> can accept arbitrary no of arguments
    {
        int sum = 0;
        for (int i: x)
        {
            sum+=i;
        }
        System.out.println("Sum is "+sum);
    }

    void display(int a, int b,int...x)
    {
        System.out.print(a);
        System.out.print("\t"+b);
        for (int i: x)
        {
            System.out.print("\t"+i);
        }
    }
    public static void main(String[] args)
    {
        VariableArguments va = new VariableArguments();
        va.sum(1,2,3);
        System.out.println();
        va.sum(1,2,3,4,5);
        System.out.println();
        // can also pass array
        int[] arr = {10,20,30,40,50};
        va.sum(arr);
        System.out.println();
        // can also specify with other arguments but varagrs should be last while declaring in a method
        va.display(10,20,1,2,3,4,5);

    }
}
