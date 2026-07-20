package OOPs.inheritance;

public class Bank {
    String BankName;
    int IFSCcode;
    void displayBank(String BankName,int IFSCcode)
    {
        this.BankName=BankName;
        this.IFSCcode=IFSCcode;
        IO.println("Bank Name:"+BankName);
        IO.println("IFSC Code:"+IFSCcode);
    }
}
