package ExceptionHandling;

public class _4NullPointerException {
    static void main(String[] args) {
        String s=null;
        try{
            IO.println(s.length());
        }catch (NullPointerException e)
        {
            IO.println("String object is null.");
            IO.println(e.getMessage());
        }
        IO.println("Exception Handled Successfully.");
    }
}
