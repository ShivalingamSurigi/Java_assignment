package Strings;
public class ReverseEveryWord {
    static void main(String[] args) {
       String input="Java Programming Language";
       String[] words=input.split(" ");
       StringBuilder result=new StringBuilder();
       for (String word:words)
       {
           StringBuilder reversedword=new StringBuilder(word);
           reversedword.reverse();
           result.append((reversedword).append(" "));
       }
       String finalOutput=result.toString().trim();
       IO.println("Original:"+input);
       IO.println("Reversed:"+finalOutput);
    }
}
