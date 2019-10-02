import java.io.*;
import java.util.*;
public class FileUsingScanner{
    public static void main(String[] args) throws IOException
    {
        FileWriter fw = new FileWriter("file-4.txt");
        fw.write("Experimenting with Scanner ");
        fw.close();
        FileReader fr = new FileReader("file-4.txt");
        Scanner sc = new Scanner(fr);
        System.out.print(sc.next());
        fr.close();
    }
}