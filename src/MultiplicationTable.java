import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        IO.print("Enter a number:");
        int n=sc.nextInt();
        for (int i=1;i<=10;i++)
        {
            IO.println(n+"x"+i+"="+(n*i));
        }
        sc.close();
    }
}
