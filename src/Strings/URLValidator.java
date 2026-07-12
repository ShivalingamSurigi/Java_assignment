package Strings;

import java.util.regex.Pattern;

public class URLValidator {
    public static String validateURL(String url)
    {
        if (url==null)
        {
            return "Invalid URL";
        }
        String urlRegex="^(https?://)?([\\w\\d\\-]+\\.)+[\\w\\d\\-]+(:\\d)?(/.*)?$";
        if(Pattern.matches(urlRegex,url))
        {
            return "Valid URL";
        }else {
            return "Invalid URL";
        }
    }
    static void main(String[] args) {
        IO.println(validateURL("https://www.google.com"));
    }
}
