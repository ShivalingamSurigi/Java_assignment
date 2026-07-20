package OOPs.Polymorphism;

public class Payment {
    void pay()
    {

    }
    static class UPI extends Payment
    {
        @Override
        void pay()
        {
            IO.println("Payment through UPI\n");
        }
    }
    static class CreditCard extends Payment
    {
        @Override
        void pay()
        {
            IO.println("Payment through Credit Card\n");
        }
    }
    static class NetBanking extends Payment
    {
        @Override
        void pay()
        {
            IO.println("Payment through Net Banking");
        }
    }
    static void main(String[] args) {
        UPI u=new UPI();
        u.pay();
        CreditCard c=new CreditCard();
        c.pay();
        NetBanking n=new NetBanking();
        n.pay();
    }
}
