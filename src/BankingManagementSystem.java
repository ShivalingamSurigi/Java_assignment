import java.util.Scanner;
public class BankingManagementSystem {
    private String accountHolderName;
    private String accountNumber;
    private double balance;
    private int pin;
    private boolean isAccountCreated=false;
    private static Scanner sc=new Scanner(System.in);
    // creating a account
    public void createAccount()
    {
        IO.print("Enter Account Holder Name:");
        sc.nextLine();
        this.accountHolderName=sc.nextLine();
        IO.print("Enter Account Number:");
        this.accountNumber=sc.next();
        IO.print("Enter 4-digit PIN:");
        this.pin= sc.nextInt();
        IO.print("Enter initial Deposit Amount:");
        this.balance=sc.nextDouble();
        this.isAccountCreated=true;
        IO.println("Account Created Successfully!!");
    }
    public void deposit()
    {
        if (!checkAccountExists())return;
        IO.print("Enter Deposited Amount:");
        double amount= sc.nextDouble();
        if (amount>0)
        {
            balance+=amount;
            IO.println("Deposit Successful");
            IO.println("Current Balance:₹"+(int)balance);
        }
        else
        {
            IO.println("Invalid deposit amount.");
        }
    }
    public void withdraw()
    {
        if (!checkAccountExists())return;
        IO.print("Enter PIN:");
        int enteredpin=sc.nextInt();
        if (enteredpin !=this.pin)
        {
            IO.println("Incorrect PIN!");
            return;
        }
        IO.print("Enter Withdraw Amount:");
        double amount=sc.nextDouble();
        if (amount>0 && amount<=balance)
        {
            balance-=amount;
            IO.println("Withdraw Successful");
            IO.println("Current Balance:₹"+(int)balance);
        }else if(amount>balance)
        {
            IO.println("Insuffient Balance!!");
        }else{
            IO.println("Invalid amount.");
        }
    }
    public void checkBalance()
    {
        if(!checkAccountExists())return;
        IO.print("Enter PIN:");
        int enteredpin=sc.nextInt();
        if (enteredpin==this.pin)
        {
            IO.println("Current Balance=₹"+(int)balance);
        }
        else {
            IO.println("Incorrect PIN!");
        }
    }
    public void changepin()
    {
        if(!checkAccountExists())return;
        IO.print("Enter current PIN:");
        int enteredpin=sc.nextInt();
        if (enteredpin==this.pin)
        {
            IO.print("Enter New 4-digit PIN:");
            this.pin=sc.nextInt();
            IO.println("PIN changed successfully!!");
        }else{
            IO.println("Incorrect current PIN!");
        }
    }
    private  void displayAccount()
    {
        if(!checkAccountExists())return;
        IO.println("\n-----Account Details-----");
        IO.println("Account Holder:"+accountHolderName);
        IO.println("Account NUmber:"+accountNumber);
        IO.println("Current Balance:₹"+(int)balance);
    }
    public void exit()
    {
        IO.println("Thank you!!!");
    }
    private boolean checkAccountExists()
    {
        if(!isAccountCreated)
        {
            IO.println("Please create account first(Option1).");
            return false;
        }
        return true;
    }
    static void main(String[] args) {
        BankingManagementSystem bankSystem=new BankingManagementSystem();
        int choice;
        do{
            IO.println("\n======================");
            IO.println("BANK MANAGEMENT SYSTEM");
            IO.println("========================");
            IO.println("1 Create Account");
            IO.println("2 Deposit");
            IO.println("3 Withdraw");
            IO.println("4 Check Balance");
            IO.println("5 Change PIN");
            IO.println("6 Display Account");
            IO.println("7 Exit");
            IO.print("Enter choice:");
            choice= sc.nextInt();
            switch (choice)
            {
                case 1:
                    bankSystem.createAccount();
                    break;
                case 2:
                    bankSystem.deposit();
                    break;
                case 3:
                    bankSystem.withdraw();
                    break;
                case 4:
                    bankSystem.checkBalance();
                    break;
                case 5:
                    bankSystem.changepin();
                    break;
                case 6:
                    bankSystem.displayAccount();
                    break;
                case 7:
                    bankSystem.exit();
                    break;
                default:
                    IO.println("Invalid choice! please select between 1 and 7.");
            }
        }
        while(choice!=7);
    }
}
