package Threads;
import java.lang.Thread;
public class MarksThread extends Thread{
    @Override
    public void run()
    {
        IO.println("Calculating Marks...");
    }
     static public class GradeThread extends Thread
    {
        @Override
        public void run()
        {
            IO.println("Generating Grade...");
        }
    }

    static void main(String[] args) {
        MarksThread mt=new MarksThread();
        GradeThread gt=new GradeThread();
        mt.start();
        gt.start();
    }
}
