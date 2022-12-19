package exceptionhandling;

class MyException extends Exception
{
    static int[] num = {1,2,3,4,5,-1};
    static String[] alpha = {"a","b","c","d","e","z"};
    MyException(String str)
    {
        super(str);
    }
}

public class UserDefinedException {
    public static void main(String[] args)
    {
        try
        {
            for(int i: MyException.num)
            {
                for(String s: MyException.alpha)
                {
                    if(i>0)
                    {
                        System.out.println(i+" = "+s);
                    }
                    else
                    {
                        throw new MyException("Less than zero");
                    }
                    break;
                }
            }
        }
        catch (MyException e)
        {
            e.printStackTrace();
        }
    }
}
