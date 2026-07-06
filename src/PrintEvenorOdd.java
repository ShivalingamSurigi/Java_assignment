import java.util.Scanner;

public class PrintEvenorOdd {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        IO.print("Enter a number:");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            if (i%2==0)
            {
                IO.print(i+" ");
            }
        }
        IO.println();
        {
            for (int j=1;j<=n;j++)
            {
                if (j%2!=0)
                IO.print(j+" ");
            }
        }
    }
}
