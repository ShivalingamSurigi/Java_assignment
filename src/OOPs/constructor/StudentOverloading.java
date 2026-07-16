package OOPs.constructor;

public class StudentOverloading {
    int StudentID;
    String StudentName;
    StudentOverloading()
    {
        StudentID=0;
        StudentName="Unknown";
    }
    StudentOverloading(int StudentID,String StudentName)
    {
        this.StudentID=StudentID;
        this.StudentName=StudentName;
    }
    void show()
    {
        IO.println("Student ID:"+StudentID);
        IO.println("Student Name:"+StudentName);
    }

    static void main(String[] args) {
        StudentOverloading s1=new StudentOverloading();
        StudentOverloading s2=new StudentOverloading(101,"shiva");
        s1.show();
        s2.show();
    }
}