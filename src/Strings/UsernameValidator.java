package Strings;
public class UsernameValidator {
    public static String validateUsername(String username)
    {
        if (username==null||username.length()<5||username.contains(" "))
        {
            return "Invalid Username";
        }
        char firstChar=username.charAt(0);
        if(!Character.isLetter(firstChar))
        {
            return "Invalid Username";
        }
        return "Valid Username";
    }

    static void main(String[] args) {
        IO.println(validateUsername("JavaStudent"));
    }
}
