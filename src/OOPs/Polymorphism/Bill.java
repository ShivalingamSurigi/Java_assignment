package OOPs.Polymorphism;

public class Bill {
    void calculateBill(int Price)
    {
        IO.println("Bill:"+Price);
    }
    void calculateBill(int Price,int GST)
    {
        IO.println("Bill:"+(Price+GST));
    }
    void calculateBill(int Price,int GST,int Discount)
    {
        IO.println("Bill:"+(Price+GST+Discount));
    }

    static void main(String[] args) {
        Bill b=new Bill();
        b.calculateBill(1000);
        b.calculateBill(1000,18);
        b.calculateBill(1000,18,100);
    }
}
