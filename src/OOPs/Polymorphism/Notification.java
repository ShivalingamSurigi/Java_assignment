package OOPs.Polymorphism;

public class Notification {
    void sendNotification()
    {

    }
    static class SMS extends Notification
    {
        @Override
        void sendNotification()
        {
            IO.println("You got a sms");
        }
    }
    static class Email extends Notification
    {
        @Override
        void sendNotification()
        {
            IO.println("You got a Email");
        }
    }
    static class Whatsapp extends Notification
    {
        @Override
        void sendNotification()
        {
            IO.println("You got a Whatsapp");
        }
    }
    static void main(String[] args) {
        SMS s=new SMS();
        s.sendNotification();
        Email e=new Email();
        e.sendNotification();
        Whatsapp w=new Whatsapp();
        w.sendNotification();
    }
}
