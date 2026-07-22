package ExceptionHandling;

import java.util.Scanner;

public class _7MultipleCatchBlocks {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        IO.print("Enter ur choice:");
        int choice=sc.nextInt();
        try{
            if(choice==1)
            {
                IO.print("Enter Number:");
                int num=sc.nextInt();
                IO.print("Enter Denominator:");
                int deno=sc.nextInt();
                int result=num/deno;
                IO.print(result);
            }else{
                int[] arr={1,2,3};
                IO.println(arr[5]);
            }
        }catch (ArithmeticException e)
        {
            IO.println("Arithmetic Exception Handled.");
        }catch (ArrayIndexOutOfBoundsException e)
        {
            IO.println("Array out of bound Exception.");
        }
    }
}
