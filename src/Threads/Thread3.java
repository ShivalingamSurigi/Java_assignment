package Threads;
import java.lang.Thread;
public class Thread3 extends Thread{
    @Override
   public void run()
    {
        for (int i=1;i<6;i++)
        {
            IO.println(i);
        }
    }

    static void main(String[] args) {
        Thread3 t3=new Thread3();
        t3.start();
    }
}
