package ExceptionHandling;

import java.util.Scanner;

public class _11AgeValidation {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        IO.print("Enter your age:");
        int age= sc.nextInt();
        if (age<18){
            throw new ArithmeticException("you must be 18 or older to vote.");
        }else{
            IO.println("Eligible for vote");
        }
    }
}
