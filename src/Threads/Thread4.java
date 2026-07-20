package Threads;
import java.lang.Thread;
public class Thread4 extends Thread{
    @Override
   public void run()
    {
        for (char i='A';i<='E';i++)
        {
            IO.println(i);
        }
    }

    static void main(String[] args) {
        Thread4 t4=new Thread4();
        t4.start();
    }
}
