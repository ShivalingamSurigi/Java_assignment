package OOPs.Encapsulation;

public class Product {
    private String ProductName;
    private int Price;
    private int Quantity;
    private int TotalBill;
    public void setProduct(String ProductName,int Price,int Quantity)
    {
        this.ProductName=ProductName;
        this.Price=Price;
        this.Quantity=Quantity;
    }
    public void calculateBill()
    {
       TotalBill=Price*Quantity;
    }
    public void displayBill()
    {
        IO.println("Product:"+ProductName);
        IO.println("Quantity:"+Quantity);
        IO.println("Total Bill:₹"+TotalBill);
    }
    static void main(String[] args) {
        Product p=new Product();
        p.setProduct("Laptop",65000,2);
        p.calculateBill();
        p.displayBill();
    }
}
