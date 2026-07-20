package OOPs.Polymorphism;

public class Student {
    void calculateAverage(int sub1,int sub2)
    {
        IO.println("Average:"+(double)(sub1+sub2)/2);
    }
    void calculateAverage(int sub1,int sub2,int sub3)
    {
        IO.println("Average:"+(double)(sub1+sub2+sub3)/3);
    }
    void calculateAverage(int sub1,int sub2,int sub3,int sub4,int sub5)
    {
        IO.println("Average:"+(double)(sub1+sub2+sub3+sub4+sub5)/5);
    }

    static void main(String[] args) {
        Student s=new Student();
        s.calculateAverage(38,40);
        s.calculateAverage(38,40,36);
        s.calculateAverage(38,40,36,38,36);
    }
}
