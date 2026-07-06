public class CopyArray {
    public static void main(String args[])
    {
        int[] num1={10,20,30,40,50};
        int[] num2=num1;
        for (int i=0;i< num1.length;i++) {
            IO.print(num1[i]+" ");
            IO.println(num2[i]);

        }
    }
}
