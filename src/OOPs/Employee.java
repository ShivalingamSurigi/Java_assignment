package OOPs;
public class Employee {
    int EmpID;
    String EmpName;
    String Department;
    double Salary;
    public Employee(int EmpID, String EmpName, String Department, double Salary) {
        this.EmpID = EmpID;
        this.EmpName = EmpName;
        this.Department = Department;
        this.Salary = Salary;
    }
    void display() {
        IO.println("-----Employee Details-----");
        IO.println("Employee ID:" + EmpID);
        IO.println("Employee Name:" + EmpName);
        IO.println("Department:" + Department);
        IO.println("Salary:" + Salary);
    }
    static void main(String[] args) {
        Employee em=new Employee(201,"Priya","Development",55000);
        em.display();
    }
}
