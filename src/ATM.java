class ATMSystem {
    int Balance;
    int depositamount;
    int withdraw;
    int newbalance;
    public void deposit(int Balance,int depositamount)
    {
        this.Balance=Balance;
        this.depositamount=depositamount;
    }
    public void withdraw(int withdraw)
    {
        this.withdraw=this.Balance-this.withdraw;
    }
    public void checkBalance()
    {
        this.newbalance=this.Balance+this.depositamount;
        IO.println("Deposited Successfully!!");
        IO.println("Current Balance=₹"+newbalance);
    }
}
public class ATM
{
    static void main(String[] args) {
        ATMSystem as=new ATMSystem();
        as.deposit(50000,500);
        as.checkBalance();
    }
}