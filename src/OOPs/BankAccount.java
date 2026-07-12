package OOPs;

import java.util.Scanner;
public class BankAccount {
    int AccountNumber;
    String CustomerName;
    double Balance;
    double amount;
    public static Scanner sc=new Scanner(System.in);
    void deposit(double Balance,double amount)
    {
        if(amount>0)
        {
            Balance+=amount;
            IO.println("\nDeposited Successfully!!!");
            IO.println("Current Balance:₹"+(int)Balance);
        }
    }
    void withdraw(double Balance,double amount)
    {
        if(amount>0 && amount<=Balance)
        {
            Balance-=amount;
            IO.println("\nWithdrawal Successful!!!");
            IO.println("Current Balance:₹"+(int)Balance);
        }
    }
    void display(double Balance)
    {
        IO.println("Current Balance:"+(int)Balance);
    }
    static void main(String[] args) {
        BankAccount ba=new BankAccount();
        ba.deposit(50000,5000);
        ba.withdraw(50000,5000);
        ba.display(5000);
    }
}
