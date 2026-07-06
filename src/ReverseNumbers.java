public class ReverseNumbers {
    public static void main(String args[])
    {
        int num=123456;
        int sum=0;
        int lastDigit=0;
        while (num>0)
        {
            lastDigit=num%10;
            sum=sum*10+lastDigit;
            num=num/10;
        }
        IO.println(sum);
    }
}
