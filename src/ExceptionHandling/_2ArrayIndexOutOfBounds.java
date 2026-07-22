package ExceptionHandling;

import java.util.Scanner;

public class _2ArrayIndexOutOfBounds {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5};
        IO.print("Enter index:");
        int i=sc.nextInt();
        try{
            IO.println(arr[i]);
        }catch (ArrayIndexOutOfBoundsException e)
        {
            IO.println("Invalid Array Index:"+e.getMessage());
        }
        IO.println("Program Ended Successfully");
        sc.close();
    }
}
