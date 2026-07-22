package ExceptionHandling;

import java.util.Scanner;

public class _3StringIndexOutOfBounds {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        IO.print("Enter a string:");
        String s=sc.nextLine();
        IO.print("Enter Index:");
        int i=sc.nextInt();
        try{
            IO.println(s.charAt(i));
        }catch (StringIndexOutOfBoundsException e)
        {
            IO.println("Invalid Character Index.");
            IO.println(e.getMessage());
        }
    }
}
