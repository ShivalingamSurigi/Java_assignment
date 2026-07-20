package OOPs.Polymorphism;

public class Order {
    void placeOrder()
    {

    }
   static class Online extends Order
    {
        @Override
        void placeOrder()
        {
            IO.println("Online Order");
        }
    }
   static class Offline extends Order
    {
        @Override
        void placeOrder()
        {
            IO.println("Offline Order");
        }
    }

    static void main(String[] args) {
        Online o=new Online();
        o.placeOrder();
        Offline of=new Offline();
        of.placeOrder();
    }
}
