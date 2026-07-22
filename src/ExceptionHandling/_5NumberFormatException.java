package ExceptionHandling;

import java.util.Scanner;

public class _5NumberFormatException {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="abc123";
        try
        {
            int m=Integer.parseInt(s);
            IO.println(m);
        }catch (NumberFormatException e)
        {
            IO.println("Invalid Number Format.");
        }
    }
}
