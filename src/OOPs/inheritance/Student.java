package OOPs.inheritance;

public class Student extends School {
    String Name;
    int Marks;
    void display(String Name,int Marks)
    {
        this.Name=Name;
        this.Marks=Marks;
        IO.println("School Name:"+SchoolName);
        IO.println("Student Name:"+Name);
        IO.println("Marks Obtained:"+Marks);
    }

    static void main(String[] args) {
        Student s=new Student();
        s.displayName("ZP High School");
        s.display("Shiva",86);
    }
}
