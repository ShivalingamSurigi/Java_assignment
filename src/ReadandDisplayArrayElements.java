import java.util.Scanner;
public class ReadandDisplayArrayElements {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        IO.println("Array Elements:");
       for (int j=0;j< arr.length;j++)
       {
           IO.print(arr[j]+" ");
       }
    }
}
