import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        IO.print("Enter Units Consumed:");
        int units=sc.nextInt();
        if (units<=100)
        {
            IO.println("Total Electricity Bill=₹"+units*2);
        }
        else if (units<=300)
        {
            IO.println("Total Electricity Bill=₹"+units*3);
        }
        else if (units<=500)
        {
            IO.println("Total Electricity Bill=₹"+units*5);
        }
        else if (units>500)
        {
            IO.println("Total Electricity Bill=₹"+units*5);
        }
    }
}
