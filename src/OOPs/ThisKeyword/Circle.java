package OOPs.ThisKeyword;

public class Circle {
    double radius;
    double Area;
    public void readRadius(double radius)
    {
        this.radius=radius;
    }
    public void calculateArea()
    {
        Area=3.14*radius*radius;
    }
    public void display()
    {
        IO.println("Radius:"+radius);
        IO.println("Area:"+Area);
    }

    static void main(String[] args) {
        Circle c=new Circle();
        c.readRadius(5);
        c.calculateArea();
        c.display();
    }
}
