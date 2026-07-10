 class EmployeeSalarySystem {
    //Instance Variable
    private String name;
    private double basicsalary;
    private double bonus;
    private double totalSalary;
    public void addemployee(String name,double basicsalary,double bonus)
    {
        this.name=name;
        this.basicsalary=basicsalary;
        this.bonus=bonus;
    }
    public void calculateSalary()
    {
        this.totalSalary=this.basicsalary+this.bonus;
    }
    public void displayEmployee()
    {
        IO.println("Total Salary=₹"+(int)totalSalary);
    }
}
public class Mains
{
    static void main(String[] args) {
        EmployeeSalarySystem emp=new EmployeeSalarySystem();
        emp.addemployee("Shiva",50000,5000);
        //Processing and output
        emp.calculateSalary();
        emp.displayEmployee();
    }
}
