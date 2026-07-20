package Threads;
import java.lang.Thread;
public class Sleep extends Thread{
    public void sleep()
    {
        for (int i=0;i<5;i++)
        {
            IO.println("Loading...");
        }
        try{
            Sleep.sleep(1000);
        } catch (InterruptedException e) {
           IO.println("Thread Interrupt:"+e.getMessage());
        }
    }
   public static void main(String[] args) {
        Sleep s=new Sleep();
        s.sleep();
    }
}
