package OOPs.constructor;

public class Employee {
    int EmpID;
    String Name;
    String Department;
    double Salary;
    Employee(int EmpID,String Name,String Department,double Salary)
    {
        this.EmpID=EmpID;
        this.Name=Name;
        this.Department=Department;
        this.Salary=Salary;
        IO.println("Employee Details\n");
        IO.println("Employee ID:"+EmpID);
        IO.println("Employee Name:"+Name);
        IO.println("Department:"+Department);
        IO.println("Salary:"+Salary);
    }

    static void main(String[] args) {
        Employee e=new Employee(201,"Priya","Development",65000);
    }
}
