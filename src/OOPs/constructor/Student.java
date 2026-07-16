package OOPs.constructor;

public class Student {
    int id;
    String Name;
    String Course;
    Student()
    {
        this.id=id;
        this.Name=Name;
        this.Course=Course;
        IO.println("Student Details\n");
        IO.println("Student ID:"+id);
        IO.println("Student Name:"+Name);
        IO.println("Course:"+Course);
    }

    static void main(String[] args) {
        Student s=new Student();
    }
}
