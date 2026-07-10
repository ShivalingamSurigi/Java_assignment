 class StudentDetails {
     String StudentName;
     String Course;
    public void addStudentdetails(String StudentName,String Course)
    {
        this.StudentName=StudentName;
        this.Course=Course;
    }
    public void displayStudent()
    {
        IO.println("Student Name:"+StudentName);
        IO.println("Course:"+Course);
    }
}
public class Student
{
    static void main(String[] args) {
        StudentDetails sd=new StudentDetails();
        sd.addStudentdetails("Shivalingam","CSE");
        sd.displayStudent();
    }
}
