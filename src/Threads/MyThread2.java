package Threads;
import java.lang.Thread;
public class MyThread2 extends Thread{
    @Override
    public void run()
    {
        for (int i=0;i<5;i++)
        {
            System.out.println("Welcome to Java Multithreading");
        }
    }

    static void main(String[] args) {
        MyThread2 thread=new MyThread2();
        thread.start();
    }
}
