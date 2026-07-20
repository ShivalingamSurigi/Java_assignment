package OOPs.Methods;

public class Company {
    static String Name;
    static String Location;
    static
    {
        Name="TCS NQT";
        Location="Hyderabad";
    }
    static void display()
    {
        IO.println("Company Name:"+Name);
        IO.println("Location:"+Location);
    }

    static void main(String[] args) {
        display();
    }
}
