import java.util.Scanner;

public class PrintNumbersm1toN {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            IO.print(i);
        }
        IO.println();
        {
            for (int j=n;j>=1;j--)
            {
                IO.print(j);
            }
        }
    }
}
