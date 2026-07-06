import java.util.Scanner;
public class SearchAnElement {
    public static void main(String args[])
    {
        int[] numbers={38,40,36,35,49};
        Scanner sc=new Scanner(System.in);
        IO.print("Enter a element:");
        int search=sc.nextInt();
        boolean istrue=false;
        for (int i=0;i< numbers.length;i++)
        {
            if (search==numbers[i])
            {
                istrue=true;
                break;
            }
        }
        if (istrue)
        {
            IO.println("Element Found");
        }
        else
        {
            IO.println("Element Not Found");
        }

    }
}
