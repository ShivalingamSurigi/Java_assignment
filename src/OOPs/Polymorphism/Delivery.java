package OOPs.Polymorphism;

public class Delivery {
    void deliveryCharge()
    {
    }
   static class NormalDelivery extends Delivery
    {
        @Override
        void deliveryCharge()
        {
            IO.println("Normal Delivery:₹45");
        }
    }
     static class ExpressDelivery extends Delivery
    {
        @Override
        void deliveryCharge()
        {
            IO.println("Express Delivery:₹90");
        }
    }

    static void main(String[] args) {
        NormalDelivery n=new NormalDelivery();
        n.deliveryCharge();
        ExpressDelivery e=new ExpressDelivery();
        e.deliveryCharge();
    }
}
