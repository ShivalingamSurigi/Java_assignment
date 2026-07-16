package OOPs.ThisKeyword;
public class Product {
    int ProductID;
    String ProductName;
    double Price;
    int Quantity;
    double Discount;
    double Bill;
    public void addProduct(int ProductID,String ProductName,double Price,int Quantity)
    {
        this.ProductID=ProductID;
        this.ProductName=ProductName;
        this.Price=Price;
        this.Quantity=Quantity;
    }
    public void calculateDiscount()
    {
        this.Discount=Discount;
        if(Price>10000)
        {
            Discount=0.1*Price;
        }else if(Price>5000)
        {
            Discount=0.05*Price;
        }else {
            IO.println("No Discount");
        }
    }
    public void calculateBill()
    {
        this.Bill=Bill;
        Bill=Price-Discount;
    }
    public void displayProduct()
    {
        IO.println("Product Added Successfully\n");
        IO.println("Product ID:"+ProductID);
        IO.println("Product Name:"+ProductName);
        IO.println("Price:₹"+Price);
        IO.println("Quantity:"+Quantity);
        IO.println("Discount:₹"+Discount);
        IO.println("Final Bill:₹"+Bill);
    }
    static void main(String[] args) {
        Product p=new Product();
        p.addProduct(101,"Laptop",65000,1);
        p.calculateDiscount();
        p.calculateBill();
        p.displayProduct();
    }
}
