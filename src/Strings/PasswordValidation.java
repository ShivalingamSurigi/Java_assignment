package Strings;
import java.util.regex.Pattern;
public class PasswordValidation {
    public static String validatePassword(String password)
    {
        if (password==null||password.length()<8)
        {
            return "Weak Password";
        }
        boolean hasUppercase= Pattern.compile("[A-Z]").matcher(password).find();
        boolean hasLowercase=Pattern.compile("[a-z]").matcher(password).find();
        boolean hasDigit=Pattern.compile("\\d").matcher(password).find();
        if(hasUppercase&&hasLowercase&&hasDigit)
        {
            return "Strong Password";
        }
        return "Weak Password";
    }

    static void main(String[] args) {
        IO.println(validatePassword("Java@123"));
    }
}
