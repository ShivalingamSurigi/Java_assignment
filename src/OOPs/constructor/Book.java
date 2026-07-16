package OOPs.constructor;

public class Book {
    int ID;
    String Name;
    String Author;
    double Price;
    Book(int ID,String Name,String Author,double Price)
    {
        this.ID=ID;
        this.Name=Name;
        this.Author=Author;
        this.Price=Price;
    }
    void display()
    {
        IO.println("Book ID:"+ID);
        IO.println("Book Name:"+Name);
        IO.println("Author:"+Author);
        IO.println("Price:₹"+Price);
    }

    static void main(String[] args) {
        Book b=new Book(101,"Java Programming","James Gosling",850);
        b.display();
    }
}
