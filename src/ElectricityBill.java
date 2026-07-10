public class ElectricityBill {
    static int calculateBill(int units)
    {
        return units*8;
    }
    static void main(String[] args) {
        int Bill=calculateBill(250);
        IO.println("Total Bill=₹"+Bill);
    }
}
