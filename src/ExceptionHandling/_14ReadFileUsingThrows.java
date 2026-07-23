package ExceptionHandling;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class _14ReadFileUsingThrows {
    public static void readFile() throws IOException {
        File file=new File("non_existent_file.txt");
        FileReader fr=new FileReader(file);
        fr.close();
    }

    static void main(String[] args) {
        try{
            readFile();
        }catch (IOException e){
            IO.println("File Not Found.");
        }
    }
}
