import java.util.Scanner;
public class ATMWithdraw {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account balance:");
        int balance= sc.nextInt();
        if (balance>=1000) {
            System.out.println("Withdrawal Allowed");
        }
        else
        {
          System.out.println("Minimum Balance Required");
        }
    }
}
