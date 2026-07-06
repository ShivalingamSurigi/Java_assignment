import java.util.Scanner;
public class MovieTicketEligibility {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age:");
        int age = sc.nextInt();
        if (age>=18) {
            System.out.println("Booking Allowed");
        }
        else
        {
            System.out.println("Booking Not Allowed");
        }
    }
}
