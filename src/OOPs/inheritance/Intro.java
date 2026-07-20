package OOPs.inheritance;

public class Intro {
    void introduce()
    {
        IO.println("I am Person");
    }
    static class Student extends Intro
    {
        void introduce()
        {
            IO.println("I am Student\n");
            super.introduce();
        }
    }

    static void main(String[] args) {
        Student s=new Student();
        s.introduce();
    }
}
