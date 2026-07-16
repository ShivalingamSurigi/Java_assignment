package OOPs.Encapsulation;

public class User {
    private String Email;
    public void set(String Email)
    {
        this.Email=Email;
        if (Email.endsWith("@gmail.com"))
        {
            IO.println("Valid Email");
        }else {
            IO.println("Invalid Email");
        }
    }

    static void main(String[] args) {
        User u=new User();
        u.set("surigishivalingam4@gmail.com");
    }
}
