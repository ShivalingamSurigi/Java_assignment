package OOPs.inheritance;

public class Employee {
    int EmpID;
    String Name;
    void displayEmployee(int EmpID,String Name)
    {
        this.EmpID=EmpID;
        this.Name=Name;
        IO.println("Employee ID:"+EmpID);
        IO.println("Employee Name:"+Name);
    }
    static class Developer extends Employee {
        String Language;
        double Salary;

        void displayDeveloper(String Language,double Salary) {
            this.Language=Language;
            this.Salary=Salary;
            IO.println("Programming Language:"+Language);
            IO.println("Salary:₹"+Salary);
        }
    }

    static void main(String[] args) {
        Developer d=new Developer();
        d.displayEmployee(201,"Priya");
        d.displayDeveloper("Java",65000);
    }
}
