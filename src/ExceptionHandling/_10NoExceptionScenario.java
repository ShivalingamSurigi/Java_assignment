package ExceptionHandling;

public class _10NoExceptionScenario {
    static void main(String[] args) {
        int a=10,b=2;
        try{
            int result=a/b;
            IO.println("Division Result:"+result);
        }catch (ArithmeticException e)
        {
            IO.println("Arthmetic Exception.");
        }finally {
            IO.println("Finally Executed.");
        }
    }
}
