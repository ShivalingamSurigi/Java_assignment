package OOPs;
public class Book {
    int BookID;
    String BookName;
    String Author;
    int Price;
    void display(int id,String b,String a,int p)
    {
        BookID=id;
        BookName=b;
        Author=a;
        Price=p;
        IO.println("Book ID:"+BookID);
        IO.println("Book Name:"+BookName);
        IO.println("Author:"+Author);
        IO.println("Price:"+Price);
    }

    static void main(String[] args) {
        Book b=new Book();
        b.display(101,"Java Programming","James Gosling",850);
    }
}
