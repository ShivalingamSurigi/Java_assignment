package ExceptionHandling;

import java.util.Scanner;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
public class _19RailwayTicketBooking {
    public static void bookTicket(int age)throws InvalidAgeException{
        if (age<0){
            throw new InvalidAgeException("Invalid Age.");
        }
        IO.println("Ticket Booked Successfully!");
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        IO.print("Age:");
        try {
            int age=sc.nextInt();
            bookTicket(age);
        }catch (InvalidAgeException e){
            IO.println(e.getMessage());
        }catch (Exception e){
            IO.println("Invalid input format.");
        }
        sc.close();
    }
}
