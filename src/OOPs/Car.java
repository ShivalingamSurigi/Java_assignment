package OOPs;

public class Car {
    String Brand;
    String Model;
    String Color;
    double Price;
    public Car(String Brand,String Model,String Color,double Price)
    {
        this.Brand=Brand;
        this.Model=Model;
        this.Color=Color;
        this.Price=Price;
    }
    void display()
    {
        IO.println("Car Details\n");

        IO.println("Brand:"+Brand);
        IO.println("Model:"+Model);
        IO.println("Color:"+Color);
        IO.println("Price:"+Price);
    }
    static void main(String[] args) {
        Car c=new Car("Hyundai","Creta","White",1800000);
        c.display();
    }
}
