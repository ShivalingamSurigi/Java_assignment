package OOPs.inheritance;

public class Employee1 {
    void constructor()
    {
        IO.println("Employee Constructor");
    }
   static class Developer extends Employee1
    {
        void constructor()
        {
            super.constructor();
            IO.println("Developer Constructor");
        }
    }
    static void main(String[] args) {
        Developer d=new Developer();
        d.constructor();
    }
}
