import java.util.Scanner;
public class ATMPINValidation {
    public static void main(String args[]) {
        int maxattempts = 3;
        int correctpin = 1234;
        int attempt = 0;
        boolean accessGranted = false;
        Scanner sc = new Scanner(System.in);
        {
            while (attempt < maxattempts) {
                IO.print("Enter Pin:");
                int PIN = sc.nextInt();
                attempt++;
                if (PIN == correctpin) {
                    accessGranted = true;
                    break;
                }
            }
            if (accessGranted) {
                IO.println("Access Granted");
            } else {
                IO.println("Card Blocked");
            }
        }
    }
}

