package ExceptionHandling;

import java.util.Scanner;

class InvalidPINException extends Exception{  //we are created exceptions...
    public InvalidPINException(String message){
        super(message);
    }
}
class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message){
        super(message);
    }
}
public class _16ATMMachine {
    private static final int CorrectPin=1234;
    private static double balance=50000.00;
    public static void withdraw(int pin,double amount)throws InvalidPINException,InsufficientBalanceException{
        if (pin!=CorrectPin){
            throw new InvalidPINException("Invalid PIN Entered.");
        }
        if(amount>balance){
            throw new InsufficientBalanceException("Insufficient Balance in Account.");
        }
        balance-=amount;
        IO.println("Withdrawal Successfully!Remaining Balance:"+balance);
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        IO.print("Enter PIN:");
        int pin=sc.nextInt();
        IO.print("Enter amount:");
        double amount=sc.nextDouble();
        try {
            withdraw(pin,amount);
        }catch (InvalidPINException|InsufficientBalanceException e){
            IO.println(e.getMessage());
        }
        sc.close();
    }
}
