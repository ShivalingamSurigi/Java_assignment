package OOPs;
public class Circle {
    int Radius;
    void calculateArea(int r)
    {
        Radius=r;
        IO.println("Area="+3.14*r*r);
    }

    static void main(String[] args) {
        Circle c=new Circle();
        c.calculateArea(5);
    }
}
