package OOPs;
import java.util.Scanner;
public class MiniBankAccount {
    int AccountNumber;
    String CustomerName;
    double Balance;
    boolean isAccountCreated=false;
    public static Scanner sc=new Scanner(System.in);
    public void createAccount()
    {
        IO.print("Enter Account Holder Name:");
        sc.nextLine();
        this.CustomerName=sc.nextLine();
        IO.print("Enter Account Number:");
        this.AccountNumber=sc.nextInt();
        IO.print("Enter initial amount:");
        this.Balance=sc.nextDouble();
        this.isAccountCreated=true;
        IO.println("Account Successfully Created!!!");
    }
    public void deposit()
    {
        IO.print("Enter Deposit amount:");
        double amount=sc.nextDouble();
        if (amount > 0)
        {
            Balance+=amount;
            IO.println("Deposited Successfully!!!");
            IO.println("Current Balance:"+(int)Balance);
        }
    }
    public void withdraw()
    {
        IO.print("Enter withdraw amount:");
        double amount=sc.nextDouble();
        if (amount>0 && amount<=Balance)
        {
            Balance-=amount;
            IO.println("Withdraw Successfully!!!");
            IO.println("Current Balance:"+(int)Balance);
        }
    }
    public void checkBalance()
    {
        IO.println("Balance:"+Balance);
    }
    public void displayAccount()
    {
        IO.println("Customer Name:"+CustomerName);
        IO.println("Account Number:"+AccountNumber);
        IO.println("Current Balance:"+Balance);
    }
    public void exit()
    {
        IO.println("Thank you!!!");
    }
    static void main(String[] args) {
        MiniBankAccount mb=new MiniBankAccount();
        int choice;
        do{
            IO.println("=====================");
            IO.println("BANK MANAGEMENT SYSTEM");
            IO.println("=======================");
            IO.println("1 Create Account");
            IO.println("2 Deposit");
            IO.println("3 Withdraw");
            IO.println("4 Check Balance");
            IO.println("5 Display Account");
            IO.println("6 Exit");
            IO.print("Enter your choice:");
            choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                    mb.createAccount();
                    break;
                case 2:
                    mb.deposit();
                    break;
                case 3:
                    mb.withdraw();
                    break;
                case 4:
                    mb.checkBalance();
                    break;
                case 5:
                    mb.displayAccount();
                    break;
                case 6:
                    mb.exit();
                    break;
                default:
                    IO.println("Invalid account!!!");
            }
        }
        while (choice!=6);
    }
}
