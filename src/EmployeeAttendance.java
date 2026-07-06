import java.util.Scanner;
public class EmployeeAttendance {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        IO.print("Enter no of days:");
        int n=sc.nextInt();
        int[] attendance=new int[n];
        char Present='P';
        char Absent='A';
        int count=0;
        IO.println("Enter no of days present or absent:");
        for (int i=0;i< attendance.length;i++)
        {
            attendance[i]=sc.next().charAt(i);
        }
        for (int i=0;i< attendance.length;i++)
        {
            if (attendance[i]==(attendance[Present]))
            {
                count++;
            }
        }
        IO.println("Present Days:"+count);
    }
}
