package Strings;
public class VowelsConsonantsCounter {
    static void main(String[] args) {
        String str="Programming";
        int vowels=0;
        int consonants=0;
        String lowerstr=str.toLowerCase();
        for (int i=0;i<lowerstr.length();i++)
        {
            char ch=lowerstr.charAt(i);
            if (ch>='a'&&ch<='z')
            {
                if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                {
                    vowels++;
                }
                else {
                    consonants++;
                }
            }
        }
        IO.println("Original String:"+str);
        IO.println("No of vowels:"+vowels);
        IO.println("No of consonants:"+consonants);
    }
}
