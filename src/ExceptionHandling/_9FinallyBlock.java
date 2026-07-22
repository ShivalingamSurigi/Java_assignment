package ExceptionHandling;

public class _9FinallyBlock {
    static void main(String[] args) {
        int a=20,b=0;
        try
        {
            int result = a / b;
            IO.println(result);
        }catch (ArithmeticException e)
        {
            IO.println("Arthmetic Exception.\n");
        }
        finally {
            IO.println("Database Connection Closed");
        }
    }
}
