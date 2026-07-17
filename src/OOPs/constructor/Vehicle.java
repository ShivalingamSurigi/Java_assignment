package OOPs.constructor;
public class Vehicle {
   void Vehicle()
    {
        IO.println("I am a vehicle");
    }
    static class Bike extends Vehicle
    {
        void Vehicle()
        {
            super.Vehicle();
            IO.println("I am a bike");
        }
    }
    public static void main(String[] args) {
        Bike bike=new Bike();
        bike.Vehicle();
    }
}
