import java.util.Scanner;
public class LoginValidation {
    public static void main(String args[])
    {
        String Username="admin";
        String Password="java123";
        Scanner sc=new Scanner(System.in);
        IO.print("Enter Username:");
        String U=sc.nextLine();
        IO.print("Enter Password:");
        String P=sc.nextLine();
        if (Username.equals(U) && Password.equals(P)) //Logical operator
        {
            IO.println("Login Successful");
        }
        else
        {
            IO.println("Invalid Username or Password");
        }
    }
}
