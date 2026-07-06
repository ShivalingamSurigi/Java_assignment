public class SumOfDigits {
    public static void main(String[] args)
    {
        int num=123;
        int sum=0;
        int lastDigit=0;
        while(num>0)
        {
           lastDigit=num%10;
           sum+=lastDigit;
           num=num/10;
        }
        IO.println(sum);
    }
}
