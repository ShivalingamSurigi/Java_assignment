package OOPs.Methods;

public class Tax {
    static double GST=0.18;
    static int ProductPrice=1000;
    static void Calculator()
    {
         GST=GST*ProductPrice;
        IO.println("GST:₹"+(int)GST);
        IO.println("Final Price:₹"+(int)(ProductPrice+GST));
    }
    static void main(String[] args) {
        Calculator();
    }
}
