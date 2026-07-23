package ExceptionHandling;

import java.util.Scanner;

public class _13StudentMarksValidation {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        IO.print("Enter student marks:");
        int marks= sc.nextInt();
        if (marks<0 || marks>100){
            throw new ArithmeticException("Invalid Marks Entered.");
        }else{
            IO.println("Valid Marks...");
        }
    }
}
