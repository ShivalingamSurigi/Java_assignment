package OOPs.Encapsulation;
public class Book {
    private int BookID;
    private String BookName;
    private String Author;
    private int Price;
    private void get()
    {
        IO.println("Book ID:"+BookID);
        IO.println("Book Name:"+BookName);
        IO.println("Author:"+Author);
        IO.println("Price:₹"+Price);
    }
    public void set(int BookID,String BookName,String Author,int Price)
    {
        this.BookID=BookID;
        this.BookName=BookName;
        this.Author=Author;
        this.Price=Price;
    }
    static void main(String[] args) {
        Book b=new Book();
        b.set(101,"Java Programming","James Gosling",850);
        b.get();
    }
}
