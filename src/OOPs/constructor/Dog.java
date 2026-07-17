package OOPs.constructor;

public class Dog extends Animal{
    void Dog()
    {
        IO.println("Dog Constructor");
    }
    static void main(String[] args) {
        Dog d=new Dog();
        d.Dog();
    }
}
