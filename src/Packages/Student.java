package Packages;

public class Student {
    private String name="Shivalingam";
    private String CollegeName="ABC Engineering College";
    public void display()
    {
        IO.println("Student Name:"+name);
        IO.println("College Name:"+CollegeName);
    }
    static void main(String[] args) {
        Student s=new Student();
        s.display();
    }
}
