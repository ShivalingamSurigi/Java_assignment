import java.util.Scanner;
public class CricketScoreBoard {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int runs[]=new int[11];
        int sum=0;
        int maxIndex=0;
        for (int i=0;i< runs.length;i++)
        {
            runs[i]=sc.nextInt();
            sum+=runs[i];
        }
        IO.println("Total runs in innings:"+sum);
        for (int i=1;i<runs.length;i++)
        {
            if (runs[i]>runs[maxIndex])
            {
                maxIndex=i;
            }
        }
        IO.println("Highest Scorer:"+runs[maxIndex]);
        for (int i=0;i<runs.length;i++)
        if (runs[i]<runs[maxIndex])
        {
            maxIndex=i;
        }
        IO.println("Lowest Scorer:"+runs[maxIndex]);
    }
}
