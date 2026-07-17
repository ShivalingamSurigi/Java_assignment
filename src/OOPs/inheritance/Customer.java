package OOPs.inheritance;

public class Customer extends Bank {
    int AccNumber;
    String Name;
    int Balance;
    void Customer(int AccNumber,String Name,int Balance)
    {
        this.AccNumber=AccNumber;
        this.Name=Name;
        this.Balance=Balance;
        IO.println("Account Number:"+AccNumber);
        IO.println("Customer Name:"+Name);
        IO.println("Balance:₹"+Balance);
    }

    static void main(String[] args) {
        Customer c=new Customer();
        c.displayBank("SBI",54412);
        c.Customer(123456789,"Shivalingam",65000);
    }
}
