package ExceptionHandling;

import java.util.Scanner;

public class _1ArthmeticException {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        IO.print("Enter First Number:");
        int a=sc.nextInt();
        IO.print("Enter Second Number:");
        int b=sc.nextInt();
        try{
            IO.println(a/b);
        } catch (ArithmeticException e) {
            IO.println("Exception:"+e.getMessage());
        }
        IO.println("Program continues successfully.");
    }
}
