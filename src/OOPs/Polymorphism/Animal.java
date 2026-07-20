package OOPs.Polymorphism;

public class Animal {
    void makeSound()
    {

    }
    static class Dog extends Animal
    {
        @Override
        void makeSound()
        {
            IO.println("Dog Barks\n");
        }
    }
   static class Cat extends Animal
    {
        @Override
        void makeSound()
        {
            IO.println("Cat Meows");
        }
    }

    static void main(String[] args) {
        Dog d= new Dog();
        d.makeSound();
        Cat c=new Cat();
        c.makeSound();
    }
}
