package OOPs.inheritance;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

public class Person1 {
    String name;
    Person1(String name)
    {
        this.name=name;
        IO.println("Person Name:"+this.name);
    }
}
 class Student1 extends Person1
{
    Student1(String name)
    {
        super(name);
        IO.println("Student Created");
    }

    static void main(String[] args) {
        Student1 s=new Student1("Shiva");

    }
}
