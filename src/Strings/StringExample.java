package Strings;
public class StringExample {
    static void main(String[] args) {
        String str="Java Programming";
        String str1="     Hello    ";
        IO.println(str.substring(4,15));
        IO.println(str1.trim());
        IO.println(str.replace('a','@'));
        IO.println(str.toUpperCase());
        IO.println(str.toLowerCase());
        IO.println(str.startsWith("Java"));
        IO.println(str.endsWith("Programming"));
        IO.println(str.strip());
    }
}
