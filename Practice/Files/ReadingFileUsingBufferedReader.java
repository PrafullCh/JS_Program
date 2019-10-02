import java.io.*;
public class ReadingFileUsingBufferedReader{
    public static void main(String[] args) throws IOException
    {
        FileWriter file = new FileWriter("file-1.txt");
        BufferedWriter br = new  BufferedWriter(file);
        br.write("i am genius");
        br.close();
    }
}