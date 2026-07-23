package ExceptionHandling;

import java.util.Scanner;

public class _12BankWithdrawal {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        IO.print("Enter initial balance:");
        int balance=sc.nextInt();
        IO.print("Enter withdraw amount:");
        int amount= sc.nextInt();
        if (amount>balance){
            throw new ArithmeticException("Insufficient Balance.");
        }else{
            IO.println("Sufficient balance.");
        }
    }
}
