package OOPs;
public class Student {
    String StudentID;
    String Name;
    String Course;
    public Student(String StudentID,String Name,String Course)
    {
        this.StudentID=StudentID;
        this.Name=Name;
        this.Course=Course;
    }
    void display()
    {
        IO.println("Student Details");
        IO.println("Student ID:"+StudentID);
        IO.println("Student Name:"+Name);
        IO.println("Course:"+Course);
    }

    static void main(String[] args) {
        Student s=new Student("101","Shiva","CSE");
        s.display();
    }
}
