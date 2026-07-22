package ExceptionHandling;

import java.util.Scanner;

public class _8ExceptionPrinting {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        IO.print("Enter first Number:");
        int num1=sc.nextInt();
        IO.print("Enter Second Number:");
        int num2=sc.nextInt();
        try{
            int result=num1/num2;
        }catch (ArithmeticException e)
        {
            IO.println(e.getMessage());
            IO.println();
            IO.println(e.toString());
            IO.println();
            IO.println("Using printStackTrace()");
            e.printStackTrace();
        }
    }
}
