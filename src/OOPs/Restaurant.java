package OOPs;
public class Restaurant {
    String ItemName;
    int Quantity;
    int Price;
    void generateBill(String ItemName,int Quantity,int Price)
    {
        IO.println("Item:"+ItemName);
        IO.println("Quantity:"+Quantity);
        IO.println("Price:₹"+Price);
        IO.println();
        IO.println("Total Bill:₹"+Price*Quantity);
    }
    static void main(String[] args) {
        Restaurant r=new Restaurant();
        r.generateBill("Pizza",2,250);
    }
}
