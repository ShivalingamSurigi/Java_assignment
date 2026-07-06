public class PatternQ22 {
    public static void main(String args[])
    {
        for (int i=1;i<=5;i++)
        {
            char ch='A';
            for (int j=1;j<=i;j++)
            {
                IO.print(ch+" ");
                ch++;
            }
            IO.println();
        }
    }
}
