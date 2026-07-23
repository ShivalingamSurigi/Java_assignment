package ExceptionHandling;

import java.util.Scanner;

class InvalidsalaryException extends Exception{
    public InvalidsalaryException(String message){
        super(message);
    }
}
public class _20EmployeeSalaryPortal {
    public static void enterSalary(double salary)throws InvalidsalaryException{
        if (salary<0){
            throw new InvalidsalaryException("Salary Cannot Be Negative.");
        }
        IO.println("Salary created Successfully.");
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        IO.print("Enter Salary:");
        try {
            double salary=sc.nextDouble();
            enterSalary(salary);
        }catch (InvalidsalaryException e){
            IO.println(e.getMessage());
        }catch (Exception e){
            IO.println("Invalid input format.");
        }
    }
}
