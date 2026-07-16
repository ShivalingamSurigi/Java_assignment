package OOPs.Encapsulation;
public class Employee {
    private int EmpID;
    private String EmpName;
    private String Department;
    private double Salary;
    public void getEmployeeDetails()
    {
        IO.println("Employee Details\n");
        IO.println("Employee ID:"+EmpID);
        IO.println("Employee Name:"+EmpName);
        IO.println("Department:"+Department);
        IO.println("Salary:₹"+Salary);
    }
    public void setEmployeeDetails(int EmpID,String EmpName,String Department,double Salary)
    {
        this.EmpID=EmpID;
        this.EmpName=EmpName;
        this.Department=Department;
        this.Salary=Salary;
    }
    static void main(String[] args) {
      Employee e=new Employee();
      e.setEmployeeDetails(201,"Priya","Development",65000);
      e.getEmployeeDetails();
    }
}
