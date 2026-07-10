 class Shopping {
    double amount;
    double discount;
    double totalamount;
    public void addShoppingdetails(double amount,double discount)
    {
        this.amount=amount;
        if (amount>5000)
        {
            this.discount=discount;
        }
    }
    public void calculateDiscount()
    {
        this.totalamount=this.amount*this.discount;
        totalamount=amount-totalamount;
        discount=amount*discount;
        IO.println("Original Amount:"+amount);
        IO.println("Discount:"+discount);
        IO.println("Final Amount:"+totalamount);
    }
}
public class Shoppingdetails
{
    static void main(String[] args) {
        Shopping s=new Shopping();
        s.addShoppingdetails(6000,0.1);
        s.calculateDiscount();
    }
}

