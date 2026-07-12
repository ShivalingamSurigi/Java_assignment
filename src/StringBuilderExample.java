public class StringBuilderExample {
    static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");
        StringBuilder sb1=new StringBuilder("Java");
        StringBuilder sb2=new StringBuilder("JavaProgramming");
        sb.append(" ");
        sb.append("World");
        sb.append("!");
        sb1.insert(2,'X');
        sb2.delete(4,15);
        IO.println(sb);
        IO.println(sb1);
        IO.println(sb1.reverse());
        IO.println(sb2);
    }
}
