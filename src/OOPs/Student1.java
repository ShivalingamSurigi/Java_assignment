package OOPs;
public class Student1 {
    String Name;
    int Marks;
    void displayResult(String n,int m)
    {
        Name=n;
        Marks=m;
        IO.println("Student Name:"+Name);
        IO.println("Marks:"+Marks);
        if (Marks>=35)
        {
            IO.println("Result:PASS");
        }else {
            IO.println("Result:FAIL");
        }
    }

    static void main(String[] args) {
        Student1 s1=new Student1();
        s1.displayResult("Shivalingam",33);
    }
}
