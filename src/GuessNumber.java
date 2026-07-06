import java.util.Scanner;
public class GuessNumber {
    public static void main(String args[])
    {
        int ComputerNumber=25;
        int n=100;
        int attempt=0;
        boolean access=false;
        Scanner sc=new Scanner(System.in);
        while (attempt<n)
        {
            IO.print("Enter guess number:");
            int num=sc.nextInt();
            attempt++;
            if (ComputerNumber == num) {
                access = true;
                break;
            }
        }
        if (access) {
            IO.println("Congratulations!");
        }
    }
}
