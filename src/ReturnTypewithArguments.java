public class ReturnTypewithArguments {
    static int sum(int a,int b)
    {
        return a+b;
    }
    static void main(String[] args) {
        int result=sum(20,40);
        IO.println("Sum:"+result);
    }
}
