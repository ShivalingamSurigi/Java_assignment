public class ReplaceanElement {
    public static void main(String args[])
    {
        int[] numbers={10,20,30,40,50};
        numbers[2]=90;
        for (int i=0;i< numbers.length;i++)
        {
            IO.print(numbers[i]+" ");
        }
    }
}
