import java.util.Scanner;
public class StudentResultManagementSystem {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int[] marks=new int[5];
        int sum=0;
        double average=0;
        int HighestMarks=marks[0];
        int LowestMarks=marks[0];
        int PassMarks=35;
        int count=0;
        int failcount=0;
        IO.print("Enter student marks:");
        for (int i=0;i<marks.length;i++)
        {
            marks[i]=sc.nextInt();
            sum+=marks[i];
        }
       int arrayaverage=marks.length;
        average=(double)sum/(double)arrayaverage;
        IO.println("Total Marks:"+sum);
        IO.println("Average Marks:"+average);
        for (int i=1;i< marks.length;i++)
        {
            if (marks[i]>marks[HighestMarks])
            {
                HighestMarks=i;
            }
        }
        IO.println("Highest Marks:"+marks[HighestMarks]);
        for (int i=1;i< marks.length;i++)
        {
            if (marks[i]<marks[LowestMarks])
            {
                LowestMarks=i;
            }
        }
        IO.println("Lowest Marks:"+marks[LowestMarks]);
        for (int i=0;i< marks.length;i++)
        {
            if (marks[i]>=35)
            {
                count++;
            }
        }
        IO.println("Pass count:"+count);
        for (int i=0;i< marks.length;i++)
        {
            if (marks[i]<PassMarks)
            {
                failcount++;
            }
        }
        IO.println("Fail count:"+failcount);
    }
}
