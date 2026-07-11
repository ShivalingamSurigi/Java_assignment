import java.util.Scanner;
public class StudentManagementSystem {
    String StudentName;
    String RollNumber;
    String Course;
    int totalmarks;
    int math;
    int os;
    int se;
    int befa;
    int dbms;
    int subjects;
    double Average;
    String newname;
    String number;
    boolean ispassed=false;
    private static Scanner sc=new Scanner(System.in);
    public void addStudent()
    {
        IO.print("Enter Student Name:");
        sc.nextLine();
        this.StudentName=sc.nextLine();
        IO.print("Enter RollNumber:");
        this.RollNumber=sc.nextLine();
        IO.print("Enter your Course:");
        Course=sc.nextLine();
        IO.print("Enter five subjects marks:");
        this.subjects=sc.nextInt();
        this.math=sc.nextInt();
        this.os=sc.nextInt();
        this.se=sc.nextInt();
        this.befa= sc.nextInt();
        this.dbms=sc.nextInt();
        this.ispassed=true;
        IO.println("Students Details Successfully updated!!!");
    }
    public void displayStudent()
    {
        if(!checkMarksExists())return;
        IO.println("\n-----Student Details-----");
        IO.println("Student Name:"+StudentName);
        IO.println("RollNumber:"+RollNumber);
        IO.println("Course:"+Course);
        IO.println("Math marks:"+math);
        IO.println("OS marks:"+os);
        IO.println("SE marks:"+se);
        IO.println("BEFA marks:"+befa);
        IO.println("DBMS marks:"+dbms);
    }
    private void calculateTotal()
    {
        if(!checkMarksExists())return;
        {
            this.totalmarks=this.math+this.os+this.se+this.befa+this.dbms;
            IO.println("Total Marks:"+totalmarks);
        }
    }
    public void calculateAverage()
    {
        if(!checkMarksExists())return;
        {
            this.Average=this.totalmarks/this.subjects;
            IO.println("Average Marks:"+(double)Average);
        }
    }
    public void displayGrade()
    {
            if (math>=35&&os>=35&&se>=35&&befa>=35&&dbms>=35) {
                IO.println("Grade A++");
            }
            else if(math<=35&&os<=35&&se<=35&&befa<=35&&dbms<=35)
        {
            IO.println("Grade A");
        }
    }
    public void searchStudent()
    {
        IO.print("Enter Student Name:");
        String name=sc.nextLine();
        if (name == this.StudentName)
        {
            IO.println("Student Found!!!");
        }else
        {
            IO.println("Please Enter valid Student Name!!");
        }
    }
    public void updateStudent()
    {
        IO.println("Enter new Name:");
         this.newname= sc.nextLine();
        if(this.newname !=this.StudentName)
        {
            IO.print("Updated Student Name:"+newname);
            IO.println("Roll Number:"+RollNumber);
            IO.println("Course:"+Course);
        }else
        {
            IO.println("Invalid Details!!!");
        }
    }
    public void deleteStudent()
    {
        IO.print("Enter RollNumber:");
         this.number=sc.nextLine();
         if(this.number.equals(this.RollNumber))
        {
            IO.println("Deleted Successfully!!!");
        }
    }
    public void exit()
    {
        IO.println("Thank you!!!");
    }
    private boolean checkMarksExists()
    {
        if(!ispassed)
        {
            IO.println("Please add student details(Option 1)");
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        StudentManagementSystem sm=new StudentManagementSystem();
        int choice;
        do {
            IO.println("\n=======================");
            IO.println("STUDENT MANAGEMENT SYSTEM");
            IO.println("==========================");
            IO.println("1 Add Student");
            IO.println("2 Display Student");
            IO.println("3 Calculate Total");
            IO.println("4 Calculate Average");
            IO.println("5 Display Grade");
            IO.println("6 Search Student");
            IO.println("7 Update Student");
            IO.println("8 Delete Student");
            IO.println("9 Exit");
            IO.print("Enter ur choice:");
            choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                    sm.addStudent();
                    break;
                case 2:
                    sm.displayStudent();
                    break;
                case 3:
                    sm.calculateTotal();
                    break;
                case 4:
                    sm.calculateAverage();
                    break;
                case 5:
                    sm.displayGrade();
                    break;
                case 6:
                    sm.searchStudent();
                    break;
                case 7:
                    sm.updateStudent();
                    break;
                case 8:
                    sm.deleteStudent();
                    break;
                case 9:
                    sm.exit();
                    break;
                default:
                    IO.println("Invalid Choice! please enter between 1 to 9");
            }
        }
        while (choice!=9);
    }
}
