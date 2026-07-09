public class LargestNumber {
    static int largest(int a,int b)
    {
        return (a>b)?a:b;
    }
    static void main(String[] args) {
        int number=largest(20,40);
        IO.println("Largest Number:"+number);
    }
}
