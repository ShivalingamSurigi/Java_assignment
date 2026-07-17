package OOPs.Polymorphism;

public class Calculator {
    void add(int a,int b)
    {
        IO.println("Sum:"+(a+b)+"\n");
    }
    void add(int a,int b,int c)
    {
        IO.println("Sum:"+(a+b+c)+"\n");
    }
    void add(double a,double b)
    {
        IO.println("Sum:"+(a+b));
    }

    static void main(String[] args) {
        Calculator c=new Calculator();
        c.add(10,20);
        c.add(10,20,30);
        c.add(12.5,15.5);
    }
}
