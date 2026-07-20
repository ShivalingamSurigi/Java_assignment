package OOPs.Polymorphism;

public class Recharge {
    int Amount;
    int Mobilenumber;
    int Coupon;
    void recharge(int Amount,int Mobilenumber,int Coupon)
    {
        this.Amount=Amount;
        this.Mobilenumber=Mobilenumber;
        this.Coupon=Coupon;
        IO.println("Amount:₹"+Amount+" mobilenumber:"+Mobilenumber+" Coupon:"+Coupon);
    }

    static void main(String[] args) {
        Recharge r=new Recharge();
        r.recharge(50000,123456789,56);
    }
}
