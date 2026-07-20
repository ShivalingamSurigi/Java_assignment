package OOPs.Polymorphism;

public class Employee {
    void calculateSalary(int Salary)
    {
        IO.println("Salary:₹"+Salary);
    }
    void calculateSalary(int Salary,int Bonus)
    {
        IO.println("Salary:₹"+(Salary+Bonus));
    }
    void calculateSalary(int Salary,int Bonus,int Incentive)
    {
        IO.println("Salary:₹"+(Salary+Bonus+Incentive));
    }
    static void main(String[] args) {
        Employee e=new Employee();
        e.calculateSalary(30000);
        e.calculateSalary(30000,5000);
        e.calculateSalary(30000,5000,2000);
    }
}
