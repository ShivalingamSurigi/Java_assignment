package OOPs.constructor;

import java.util.Scanner;

public class BankManagementSystem {
    int AccountNumber;
    String CustomerName;
    double Balance;
    boolean isaccountCreated=false;
     static Scanner sc=new Scanner(System.in);
    void createAccount()
    {
        IO.print("Enter Customer Name:");
        sc.nextLine();
        this.CustomerName=sc.nextLine();
        IO.print("Enter Account Number:");
        this.AccountNumber=sc.nextInt();
        IO.print("Enter initial balance:");
        this.Balance=sc.nextDouble();
        isaccountCreated=true;
        IO.println("Account Created Successfully!!!");
        IO.println("Current Balance:₹"+Balance);
    }
    void deposit()
   {
       IO.print("Enter Deposit amount:");
       double amount=sc.nextDouble();
       if(amount>0)
       {
           Balance+=amount;
           IO.println("Deposit Successfully");
           IO.println("Current Balance:₹"+Balance);
       }
   }
   void withdraw()
   {
       IO.print("Enter withdraw amount:");
       double amount=sc.nextDouble();
       if(amount>0 && amount<=Balance)
       {
           Balance-=amount;
           IO.println("withdrawal successfully!!");
           IO.println("Current Balance:"+Balance);
       }
   }
   void displayAccount()
   {
       IO.println("Customer Name:"+CustomerName);
       IO.println("Account Number:"+AccountNumber);
       IO.println("Current Balance:"+Balance);
   }
   void exit()
   {
       IO.println("Thank you!!!");
   }
    static void main(String[] args) {
        BankManagementSystem bm=new BankManagementSystem();
        int choice;
        do {
            IO.println("==================");
            IO.println("BANK MANAGEMENT SYSTEM");
            IO.println("=====================");
            IO.println("1 Create Account");
            IO.println("2 Deposit");
            IO.println("3 Withdraw");
            IO.println("4 Display Account");
            IO.println("5 Exit");
            IO.print("Enter ur choice:");
            choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                    bm.createAccount();
                    break;
                case 2:
                    bm.deposit();
                    break;
                case 3:
                    bm.withdraw();
                    break;
                case 4:
                    bm.displayAccount();
                    break;
                case 5:
                    bm.exit();
                    break;
                default:
                    IO.println("Invalid data");
            }
        }
        while (choice!=5);
    }
}
