import java.util.Scanner;
public class Calculator {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        IO.print("Enter First Number:");
        int num1=sc.nextInt();
        IO.print("Enter Second Number:");
        int num2=sc.nextInt();
        IO.print("Enter a operator:");
        int operator=sc.nextInt();
        switch(operator)
        {
            case '+':
                IO.println("Result="+(num1+num2));
                break;
            case '-':
                IO.println("Result="+(num1-num2));
                break;
            case '*':
                IO.println("Result="+(num1*num2));
                break;
            case '/':
                IO.println("Result="+(num1/num2));
                break;

        }
    }
}
