package OOPs.Encapsulation;
public class Q8Employee {
    private int Salary;
    public void get()
    {
        if(Salary>0)
        {
            IO.println("Valid Salary");
        }else {
            IO.println("Invalid Salary");
        }
    }
    public void set(int Salary)
    {
        this.Salary=Salary;
    }

    static void main(String[] args) {
        Q8Employee e=new Q8Employee();
        e.set(-5000);
        e.get();
    }
}
