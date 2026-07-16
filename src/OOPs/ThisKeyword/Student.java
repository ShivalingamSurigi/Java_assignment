package OOPs.ThisKeyword;
public class Student {
    int StudentID;
    String Name;
    String Course;
    public void readStudent(int StudentID,String Name,String Course)
    {
        this.StudentID=StudentID;
        this.Name=Name;
        this.Course=Course;
    }
    public void display()
    {
        IO.println("Student Details\n");
        IO.println("Student ID:"+StudentID);
        IO.println("Student Name:"+Name);
        IO.println("Course:"+Course);
    }
    static void main(String[] args) {
        Student s=new Student();
        s.readStudent(101,"Shiva","Java Full Stack");
        s.display();
    }
}
