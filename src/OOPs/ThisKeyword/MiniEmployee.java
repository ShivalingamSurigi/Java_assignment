package OOPs.ThisKeyword;
public class MiniEmployee {
    int EmployeeID;
    String EmployeeName;
    String Department;
    double Salary;
    double Bonus;
    public void addEmployee(int EmployeeID,String EmployeeName,String Department,double Salary)
    {
        this.EmployeeID=EmployeeID;
        this.EmployeeName=EmployeeName;
        this.Department=Department;
        this.Salary=Salary;
    }
    public void calculateBonus()
    {
        if(Salary>=50000)
        {
           Bonus=0.1*Salary;
        }else if(Salary<50000)
        {
            Bonus=0.05*Salary;
        }
    }
    public void displayEmployee()
    {
        IO.println("Employee Added Successfully\n");
        IO.println("Employee ID:"+EmployeeID);
        IO.println("Employee Name:"+EmployeeName);
        IO.println("Department:"+Department);
        IO.println("Salary:₹"+Salary);
        IO.println("Bonus:₹"+Bonus);
    }
    static void main(String[] args) {
        MiniEmployee m=new MiniEmployee();
        m.addEmployee(201,"Shivalingam","Development",60000);
        m.calculateBonus();
        m.displayEmployee();
    }
}
