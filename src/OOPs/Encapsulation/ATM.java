package OOPs.Encapsulation;

import java.util.regex.Pattern;

public class ATM {
    private String PIN;
    public void set(String pinString) {
        if(pinString!=null && pinString.matches("\\d{4}"))
        {
            this.PIN=pinString;
            IO.println("PIN set successfully");
        }else {
            IO.println("Invalid PIN");
        }
    }
    static void main(String[] args) {
        ATM a=new ATM();
        String userInput="12345";
        a.set(userInput);
    }
}
