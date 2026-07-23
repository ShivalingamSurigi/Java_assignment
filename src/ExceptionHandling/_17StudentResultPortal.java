package ExceptionHandling;

import java.util.Scanner;

class InvalidMarksException extends Exception{
    public InvalidMarksException(String message){
        super(message);
    }
}
public class _17StudentResultPortal {
    public static void checkResult(String input)throws InvalidMarksException{
        try {
            int marks=Integer.parseInt(input);
            if (marks<0 || marks>100){
                throw new InvalidMarksException("Invalid Marks.");
            }
            if(marks>=40){
                IO.println("Result:Pass");
            }else{
                IO.println("Result:Fail");
            }
        }catch (NumberFormatException e){
            IO.println("Invalid Marks Format.");
        }
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        IO.print("Marks:");
        String input=sc.nextLine();
        try {
            checkResult(input);
        }catch (InvalidMarksException e){
            IO.println(e.getMessage());
        }
    }
}
