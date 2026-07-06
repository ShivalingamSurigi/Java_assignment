import java.util.Scanner;
public class FreeDelivery {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Order Amount:");
        int Amount=sc.nextInt();
        if (Amount>499)
        {
            System.out.println("Free Delivery Available");
        }
    }
}
