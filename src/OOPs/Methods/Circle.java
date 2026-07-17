package OOPs.Methods;

public class Circle {
    static double PI=3.14;
    static int Radius=5;
    static void display()
    {
        double Area=PI*Radius*Radius;
        IO.println("PI:"+PI);
        IO.println("Area:"+Area);
    }
    static void main(String[] args) {
        display();
    }
}
