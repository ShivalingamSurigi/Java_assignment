package Threads;
import java.lang.Thread;
public class MyThread1 implements java.lang.Runnable{
    @Override
   public void run()
    {
        System.out.println("Runnable thread is called");
    }
        public static void main(String[] args) {
            MyThread1 thread=new MyThread1();
            Thread t=new Thread(thread);
            t.start();
        }
}
