package OOPs.Methods;

public class Student {
    int StudentID;
    String StudentName;
    {
        IO.println("Instance Block Executed");
        StudentID=201;
        StudentName="Shivalingam";
    }
    public Student()
    {
        IO.println("Student ID:"+StudentID);
        IO.println("Student Name:"+StudentName);
    }

    static void main(String[] args) {
        new Student();
    }
}
