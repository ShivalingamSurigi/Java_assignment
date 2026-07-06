import java.util.Scanner;

public class StudentGrade {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        IO.print("Enter marks:");
        int marks=sc.nextInt();
        if (marks>=90)
        {
            IO.println("Grade A");
        }
        else if (marks>=80)
        {
            IO.println("Grade B");
        }
        else if (marks>=70)
        {
            IO.println("Grade C");
        }
        else if (marks>=60)
        {
            IO.println("Grade D");
        }
        else if (marks>=35)
        {
            IO.println("Pass");
        }
        else
        {
            IO.println("Fail");
        }
    }
}
