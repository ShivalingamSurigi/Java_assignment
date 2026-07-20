package OOPs.inheritance;

public class Vehicle {
    void display()
    {
        IO.println("I am a vehicle");
    }
   static class Car extends Vehicle
    {
        void display()
        {
            IO.println("I am a Car");
        }
    }
    static class SportsCar extends Vehicle
    {
        void diplay()
        {
            IO.println("I am a Sports Car");
        }
    }

    static void main(String[] args) {
        Vehicle v=new Vehicle();
        v.display();
        Car c=new Car();
        c.display();
        SportsCar sc=new SportsCar();
        sc.diplay();
    }
}
