package OOPs;
public class Mobile {
    String Brand;
    String RAM;
    String Storage;
    int Price;
    public  Mobile(String Brand,String RAM,String Storage,int Price)
    {
        this.Brand=Brand;
        this.RAM=RAM;
        this.Storage=Storage;
        this.Price=Price;
    }
    void display()
    {
        IO.println("Brand:"+Brand);
        IO.println("RAM:"+RAM);
        IO.println("Storage:"+Storage);
        IO.println("Price:"+Price);
    }
    static void main(String[] args) {
        Mobile m=new Mobile("Samsung","8 GB","128 GB",25000);
        m.display();
    }
}
