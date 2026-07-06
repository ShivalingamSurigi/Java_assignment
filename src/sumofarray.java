public class sumofarray {
    public static void main(String args[])
    {
        int[] numbers={1,2,3,4,5};
        int sum=0;
        double average=0;
        for (int num:numbers)
        {
            sum+=num;
        }
        int arraylength= numbers.length;
        average=(double)sum/(double)arraylength;
        {
            IO.println("Sum:"+sum);
            IO.println("Average:"+average);
        }
    }
}
