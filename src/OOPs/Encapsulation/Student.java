package OOPs.Encapsulation;
public class Student {
    private int StudentID;
    private String StudentName;
    private String Course;
    public void getStudentDetails()
    {
        IO.println("Student Details\n");
        IO.println("Student ID:"+StudentID);
        IO.println("Student Name:"+StudentName);
        IO.println("Course:"+Course);
    }
    public void setStudentDetails(int StudentID,String StudentName,String Course)
    {
        this.StudentID=StudentID;
        this.StudentName=StudentName;
        this.Course=Course;
    }
    static void main(String[] args) {
     Student s=new Student();
     s.setStudentDetails(101,"Shivalingam","Java Full Stack");
     s.getStudentDetails();
    }
}
