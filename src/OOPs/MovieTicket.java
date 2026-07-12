package OOPs;
public class MovieTicket {
    String MovieName;
    int TicketPrice;
    int Tickets;
    void calculateAmount(String MovieName,int TicketPrice,int Tickets)
    {
        IO.println("\nMovie:"+MovieName);
        IO.println("\nTickets:"+Tickets);
        IO.println("\nTotal Amount:₹"+TicketPrice*Tickets);
    }
    static void main(String[] args) {
        MovieTicket mt=new MovieTicket();
        mt.calculateAmount("Pushpa 3",200,4);
    }
}
