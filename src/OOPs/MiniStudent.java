package OOPs;

import java.util.Scanner;

public class MiniStudent {
    int StudentID;
    String StudentName;
    int Marks;
    String Course;
    public static Scanner sc=new Scanner(System.in);
    void addStudent()
    {
        IO.println("Enter your name:");
        StudentName =sc.nextLine();
       IO.print("Enter your ID:");
       StudentID=sc.nextInt();
       IO.println("Enter Course:");
       Course= sc.nextLine();
       IO.println("Enter your marks:");
       Marks=sc.nextInt();
       IO.println("Student Added Successfully");
    }
    void displayStudent()
    {
        IO.println("Student ID:"+StudentID);
        IO.println("Student Name:"+StudentName);
        IO.println("Course:"+Course);
        IO.println("Marks:"+Marks);
    }
    void calculateGrade()
    {
        if(Marks>=90 && Marks<=100)
        {
            IO.println("Grade:A+");
        }else if(Marks>=75&&Marks<=89)
        {
            IO.println("Grade:A");
        }else if(Marks>=60 && Marks<=74)
        {
            IO.println("Grade:B");
        }else if(Marks>=35 && Marks<=59)
        {
            IO.println("Grade:C");
        }else {
            IO.println("Grade:FAIL");
        }
    }
    static void main(String[] args) {
        MiniStudent ms=new MiniStudent();
        ms.addStudent();
        ms.displayStudent();
        ms.calculateGrade();
    }
}
