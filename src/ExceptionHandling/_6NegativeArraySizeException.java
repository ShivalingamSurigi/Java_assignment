package ExceptionHandling;

import java.util.Scanner;

public class _6NegativeArraySizeException {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        IO.print("Enter Array Size:");
        int i=sc.nextInt();
        try{
            int[] arr=new int[i];
            IO.println(arr[i]);
        }catch (NegativeArraySizeException e)
        {
            IO.println("Array Size Cannot Be Negative");
        }
    }
}
