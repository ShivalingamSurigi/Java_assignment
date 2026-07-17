package OOPs.Polymorphism;

public class Bank {
    void calculateInterest()
    {

    }
    static class SBI extends Bank
    {
        @Override
        void calculateInterest()
        {
            IO.println("SBI Interest:6.5%");
        }
    }
    static class HDFC extends Bank
    {
        @Override
        void calculateInterest()
        {
            IO.println("HDFC Interest:7%");
        }
    }

    static void main(String[] args) {
        SBI s= new SBI();
        s.calculateInterest();
        HDFC h=new HDFC();
        h.calculateInterest();
    }
}
