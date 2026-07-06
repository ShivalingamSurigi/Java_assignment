import java.util.Scanner;

public class RestaurantMenu {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Choice:");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                IO.println("Idli");
                break;
            case 2:
                IO.println("Dosa");
                break;
            case 3:
                IO.println("Poori");
                break;
            case 4:
                IO.println("Meals");
                break;
        }
        IO.println("Selected Item:"+choice);
    }
}
