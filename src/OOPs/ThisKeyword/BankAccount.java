package OOPs.ThisKeyword;
public class BankAccount {
    int Number;
    String Name;
    double Balance;
    public void createAccount(int Number,String Name,double Balance)
    {
        this.Number=Number;
        this.Name=Name;
        this.Balance=Balance;
    }
    public void displayAccount()
    {
        IO.println("Account Number:"+Number);
        IO.println("Customer Name:"+Name);
        IO.println("Balance:₹"+Balance);
    }
    static void main(String[] args) {
        BankAccount ba=new BankAccount();
        ba.createAccount(1001,"Shiva",50000);
        ba.displayAccount();
    }
}
