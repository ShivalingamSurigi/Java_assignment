package Threads;
import java.lang.Thread;
public class mythread extends Thread{
    @Override
    public void run()
    {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        mythread thread=new mythread();
        thread.start();
    }
}
