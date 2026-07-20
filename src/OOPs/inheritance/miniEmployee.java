package OOPs.inheritance;

public class miniEmployee {
    int EmpID;
    String EmpName;
    int Salary;
    static class Developer extends miniEmployee
    {
        String Language;
        int Experience;
        double Bonus;
        void calculateBonus(String Language,int Experience)
        {
            this.Language=Language;
            this.Experience=Experience;
            if (Experience>=5)
            {
               this.Bonus=0.5*Salary;
            }else if(Experience<5)
            {
                this.Bonus=0.1*Salary;
            }
            IO.println("Programming Language:"+Language);
            IO.println("Bonus:"+Bonus);
        }
    }
    void displayEmployee(int EmpID,String EmpName,int Salary)
    {
        this.EmpID=EmpID;
        this.EmpName=EmpName;
        this.Salary=Salary;
        IO.println("Employee ID:"+EmpID);
        IO.println("Employee Name:"+EmpName);
        IO.println("Salary:₹"+Salary);
    }

    static void main(String[] args) {
        Developer d=new Developer();
        d.displayEmployee(201,"Shivalingam",50000);
        d.calculateBonus("Java Full Stack",6 );
    }
}
