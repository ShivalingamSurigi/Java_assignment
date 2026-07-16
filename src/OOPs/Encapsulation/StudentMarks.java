package OOPs.Encapsulation;
public class StudentMarks {
    private int Marks;
    public void get()
    {
        if(Marks>0 && Marks<=100)
        {
            IO.println("Valid Marks");
        }else
        {
            IO.println("Invalid Marks");
        }
    }
    public void set(int Marks)
    {
        this.Marks=Marks;
    }

    static void main(String[] args) {
        StudentMarks sm=new StudentMarks();
        sm.set(100);
        sm.get();
    }
}
