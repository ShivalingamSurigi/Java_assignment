package Strings;
public class CountdigitsLettersandSpecialCharacters {
    static void main(String[] args) {
        String input="Java@123";
        int Letters=0;
        int Digits=0;
        int SpecialCharacters=0;
        String word=input.toLowerCase();
        for (int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            int dg=word.charAt(i);
            if(ch>='a'&&ch<='z')
            {
                Letters++;
            }else if(dg>='1' && dg<='9')
            {
                Digits++;
            }else
            {
                SpecialCharacters++;
            }
        }
        IO.println("Letters:"+Letters);
        IO.println("Digits:"+Digits);
        IO.println("Characters:"+SpecialCharacters);
    }
}
