package OOPs.Polymorphism;

public class Login {
    void login()
    {

    }
    static class Admin extends Login
    {
        @Override
        void login()
        {
            IO.println("Admin is created");
        }
    }
    static class Employee extends Login
    {
        @Override
        void login()
        {
            IO.println("Employee created");
        }
    }
    static void main(String[] args) {
        Admin a=new Admin();
        a.login();
        Employee e=new Employee();
        e.login();
    }
}
