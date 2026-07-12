package OOPs;
public class Rectangle {
    int Length;
    int Width;
    void calculateArea(int l,int w)
    {
        Length=l;
        Width=w;
        IO.println("Area="+Length*Width);
    }

    static void main(String[] args) {
        Rectangle re=new Rectangle();
        re.calculateArea(10,5);
    }
}
