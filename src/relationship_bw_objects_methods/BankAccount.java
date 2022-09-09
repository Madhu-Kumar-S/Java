package relationship_bw_objects_methods;

import java.util.Scanner;

public class BankAccount
{
    private double balance;
    BankAccount(double balance)
    {
        this.balance = balance;
    }

    void contact(double intrest)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password :");
        String password = sc.nextLine();
        if(password.equals("1234"))
        {
            Intrest in = new Intrest(intrest);
            in.calculateIntrest();
        }
        else
        {
            System.out.println("Incorrect password...");
        }
    }

    private class Intrest
    {
        private double rate;
        Intrest(double rate)
        {
            this.rate = rate;
        }

        void calculateIntrest()
        {
            double intrest = BankAccount.this.balance * Intrest.this.rate / 100;
            BankAccount.this.balance += intrest;
            System.out.println("Updated balance "+BankAccount.this.balance);
        }
    }
}
