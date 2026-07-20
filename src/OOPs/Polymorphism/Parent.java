package OOPs.Polymorphism;

public class Parent {
    void speed()
    {
    }
    static class Bike extends Parent
    {
        @Override
        void speed()
        {
            IO.println("I am a Bike");
        }
    }
   static class Car extends Parent
    {
        @Override
        void speed()
        {
            IO.println("I am a Car");
        }
    }
    static void main(String[] args) {
        Bike b=new Bike();
        b.speed();
        Car c=new Car();
        c.speed();
    }
}
