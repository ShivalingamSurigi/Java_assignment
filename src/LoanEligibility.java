import java.util.Scanner;

public class LoanEligibility {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        IO.print("Enter Monthly Salary:");
        int salary=sc.nextInt();
        if (salary>=30000)
        {
            IO.println("Loan Approved");
        }
        else
        {
            IO.println("Loan Rejected");
        }
    }
}
