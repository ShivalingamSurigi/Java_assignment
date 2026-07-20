package OOPs.Methods;

public class Students {
    static String Name;
    static int MaximumStudents;
    static
    {
        Name="ABC Engineering College";
        MaximumStudents=50;
    }
    static void display()
    {
        IO.println("College Name:"+Name);
        IO.println("Maximum Students:"+MaximumStudents);
    }

    static void main(String[] args) {
        display();
    }
}
