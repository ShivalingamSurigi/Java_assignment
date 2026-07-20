package Threads;
import java.lang.Thread;

public class MyRunnable implements java.lang.Runnable{
    @Override
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Learning Multithreading");
        }
    }
    public static void main(String[] args) {
        MyRunnable runnable=new MyRunnable();
        Thread thread=new Thread(runnable);
        thread.start();
    }
}
