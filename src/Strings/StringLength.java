package Strings;
import java.util.Scanner;
public class StringLength {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        IO.print("Enter a String:");
        String str=sc.nextLine();
        IO.print("Enter index:");
        int index=sc.nextInt();
        IO.println("Length="+str.length());
        IO.println("Character="+str.charAt(index));
        IO.println("Index="+str.indexOf("c"));
        String str1="Programming";
        IO.println("Last Index="+str1.lastIndexOf('g'));
    }
}
