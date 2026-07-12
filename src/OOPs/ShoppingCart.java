package OOPs;
public class ShoppingCart {
    String ProductName;
    int Quantity;
    int Price;
    void calculateTotal(String ProductName, int Quantity,int Price)
    {
        this.ProductName=ProductName;
        this.Quantity=Quantity;
        this.Price=Price;
        IO.println("Product:"+ProductName);
        IO.println("\nQuantity:"+Quantity);
        IO.println("\nTotal Bill:₹"+Price*Quantity);
    }
    static void main(String[] args) {
        ShoppingCart sc=new ShoppingCart();
        sc.calculateTotal("Laptop",1,65000);
    }
}
