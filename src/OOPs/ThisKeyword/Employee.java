package OOPs.ThisKeyword;

public class Employee {
    String Name;
    double Salary;
    double Bonus;
    public void readdata(String Name,double Salary)
    {
        this.Name=Name;
        this.Salary=Salary;
    }
    public void calculate()
    {
        Bonus=0.1*Salary;
    }
    public void display()
    {
        IO.println("Employee Name:"+Name);
        IO.println("Salary:₹"+Salary);
        IO.println("Bonus:₹"+Bonus);
    }
    static void main(String[] args) {
        Employee e=new Employee();
        e.readdata("Shivalingam",50000);
        e.calculate();
        e.display();
    }
}
