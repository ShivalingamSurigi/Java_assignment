import java.util.Scanner;
public class ShoppingMallBilling {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        IO.print("Enter no of items buys:");
        int n=sc.nextInt();
        int[] billing=new int[n];
        int sum=0;
        double average=0;
        int HighestPrice=billing[0];
        int LowestPrice=0;
        IO.println("Enter prises of buying items:");
        for (int i=0;i< billing.length;i++)
        {
            billing[i]=sc.nextInt();
            sum+=billing[i];
        }
        int averageprice= billing.length;
        average=(double)sum/(double)averageprice;
        IO.println("Total Bill:"+sum);
        IO.println("Average Price:"+average);
        for (int i=1;i< billing.length;i++)
        {
            if (billing[i]>billing[HighestPrice])
            {
                HighestPrice=i;
            }
        }
        IO.println("Highest Price:"+billing[HighestPrice]);
        for (int i=1;i< billing.length;i++)
        {
            if (billing[i] < billing[LowestPrice])
            {
                LowestPrice=i;
            }
        }
        IO.println("Lowest Price:"+billing[LowestPrice]);
        int products= billing.length;
        IO.println("Number of Products:"+products);
    }
}
