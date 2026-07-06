import java.util.Scanner;
public class CompareTwoArrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        IO.print("Enter number1:");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        IO.print("Enter number2:");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = sc.nextInt();
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j])
                IO.println("Arrays are equal");
                break;
            }
        }
    }
}
