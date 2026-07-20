package OOPs.Methods;

public class Employee {
    int EmployeeID;
    String EmployeeName;
    int Salary;
    {
        EmployeeID=201;
        EmployeeName="Priya";
        Salary=65000;
    }
    public Employee()
    {
        IO.println("Employee ID:"+EmployeeID);
        IO.println("Employee Name:"+EmployeeName);
        IO.println("Salary:₹"+Salary);
    }

    static void main(String[] args) {
        new Employee();
    }
}
