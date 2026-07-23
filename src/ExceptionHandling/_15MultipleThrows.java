package ExceptionHandling;
import java.io.IOException;
import java.sql.SQLException;

public class _15MultipleThrows {
    public static void processData(int option)throws IOException,SQLException
    {
        if (option==1){
            throw new IOException();
        }else if(option==2){
            throw new SQLException();
        }
    }

    static void main(String[] args) {
        try{
            processData(1);
        }catch (IOException e){
            IO.println("IO Exception Handled.");
        } catch (SQLException e) {
          IO.println("SQL Exception Handled.");
        }
        IO.println();
        try {
            processData(2);
        }catch (IOException e){
            IO.println("IO Exception Handled.");
        }catch (SQLException e){
            IO.println("SQL Exception Handled.");
        }
    }
}
