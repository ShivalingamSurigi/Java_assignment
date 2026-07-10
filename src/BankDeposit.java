public class BankDeposit {
    static double deposit(double amount)
    {
        return amount;
    }
    static void main(String[] args) {
        double amount=deposit(5000);
        IO.println("Amount Deposited Sucessfully");
        IO.println("Deposited Amount=₹"+amount);
    }
}
