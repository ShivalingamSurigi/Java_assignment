package Strings;

import java.util.Arrays;

public class CountWords {
    static void main(String[] args) {
        String input="Java is Easy";
        if(input==null||input.trim().isEmpty())
        {
            IO.println("Word Count:0");
            return;
        }
        String[] words=input.trim().split("\\s+");
        IO.println("Word Count:"+words.length);
    }
}
