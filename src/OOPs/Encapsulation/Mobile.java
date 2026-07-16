package OOPs.Encapsulation;
public class Mobile {
    private String Brand;
    private int RAM;
    private int Storage;
    private double Price;
    public void get()
    {
        IO.println("Brand:"+Brand);
        IO.println("RAM:"+RAM+" GB");
        IO.println("Storage:"+Storage+" GB");
        IO.println("Price:₹"+Price);
    }
    public void set(String Brand,int RAM,int Storage,double Price)
    {
        this.Brand=Brand;
        this.RAM=RAM;
        this.Storage=Storage;
        this.Price=Price;
    }

    static void main(String[] args) {
        Mobile m=new Mobile();
        m.set("Redmi",8,128,25000);
        m.get();
    }
}
