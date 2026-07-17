package OOPs.inheritance;

public class Person {
    String Name;
    int Age;
    void displayPerson(String Name,int Age)
    {
        this.Name=Name;
        this.Age=Age;
        IO.println("Name:"+Name);
        IO.println("Age:"+Age);
    }
   static class Student extends Person
    {
        int StudentID;
        String Course;
        void displayPerson(int StudentID,String Course) {
           this.StudentID=StudentID;
           this.Course=Course;
            IO.println("Student ID:"+StudentID);
            IO.println("Course:"+Course);
        }
    }

    static void main(String[] args) {
        Student s=new Student();
        s.displayPerson("Shivalingam",20);
        s.displayPerson(101,"Development");
    }
}
